package com.example.student_tracker.controller;

import com.example.student_tracker.entity.CodingProfile;
import com.example.student_tracker.repository.CodingProfileRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profiles")
public class CodingProfileController {

    private final CodingProfileRepository codingProfileRepository;

    public CodingProfileController(CodingProfileRepository codingProfileRepository) {
        this.codingProfileRepository = codingProfileRepository;
    }

    @PostMapping
    public CodingProfile createProfile(@RequestBody CodingProfile profile) {
        return codingProfileRepository.save(profile);
    }
}
