package com.example.student_tracker.repository;

import com.example.student_tracker.entity.CodingProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodingProfileRepository extends JpaRepository<CodingProfile, Long> {
}
