package com.sosa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.UUID;

@Entity(name = "Student")
@Table(name = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue
    private UUID id;

    private String firstName;

    private String lastName;

    private String otherName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private boolean valid;

    private ZonedDateTime createdAt;

    private ZonedDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = ZonedDateTime.now();
    }

    @PreUpdate void onUpdate() {
        this.updatedAt = ZonedDateTime.now();
    }
}
