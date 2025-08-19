package com.jasiqlabs.domain.dto;
import com.jasiqlabs.domain.Job;

public class JobResponse {
    private Long id;
    private String title;
    private String location;
    private String skills;
    private String description;

    public JobResponse(Job job) {
        this.id = job.getId();
        this.title = job.getTitle();
        this.location = job.getLocation();
        this.skills = job.getSkills();
        this.description = job.getDescription();
    }

    // Getters only (read-only DTO)
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getLocation() { return location; }
    public String getSkills() { return skills; }
    public String getDescription() { return description; }
}
