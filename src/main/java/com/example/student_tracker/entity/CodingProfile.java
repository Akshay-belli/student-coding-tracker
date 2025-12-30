package com.example.student_tracker.entity;

import com.example.student_tracker.enums.Platform;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "coding_profile")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CodingProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Platform platform;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;

    private String username;
    private int solvedCount;
    private int rating;
}
