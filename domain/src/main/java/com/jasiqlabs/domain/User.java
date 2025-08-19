//package com.jasiqlabs.domain;
//public class User {
//    private String name;
//    private String email;
//    public User() {}
//    public User(String name, String email) {
//        this.name = name;
//        this.email = email;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getEmail() {
//        return email;
//    }
//    public void setEmail(String email) {
//        this.email = email;
//    }
//}

package com.jasiqlabs.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "users") // Table name in PostgreSQL
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment in PostgreSQL
    private Long id;

    @Column(nullable = false) // not null
    private String name;

    @Column(nullable = false, unique = true) // unique email
    private String email;

    // Default constructor (required by JPA)
    public User() {}

    // Constructor with fields
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}


