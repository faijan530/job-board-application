//package com.jasiqlabs.domain;
//public class Job {
//    private Long id;
//    private String title;
//    private String location;
//    private String description;
//    public Job() {}
//    public Job(Long id, String title, String location, String description) {
//        this.id = id;
//        this.title = title;
//        this.location = location;
//        this.description = description;
//    }
//    public Long getId() { return id; }
//    public void setId(Long id) { this.id = id; }
//    public String getTitle() { return title; }
//    public void setTitle(String title) { this.title = title; }
//    public String getLocation() { return location; }
//    public void setLocation(String location) { this.location = location; }
//    public String getDescription() { return description; }
//    public void setDescription(String description) { this.description = description; }}


package com.jasiqlabs.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "jobs")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String skills;
    private String location;

    public Job() {} // Default constructor

    public Job(String title, String description, String skills, String location) {
        this.title = title;
        this.description = description;
        this.skills = skills;
        this.location = location;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getSkills() { return skills; }
    public void setSkills(String skills) { this.skills = skills; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}
