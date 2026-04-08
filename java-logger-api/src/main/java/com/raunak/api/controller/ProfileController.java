package com.raunak.api.controller;

import com.raunak.api.service.ProfileService;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ProfileController {

    private static final Logger logger = LoggerFactory.getLogger(ProfileController.class);

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/profile")
    public Map<String, String> getProfile() {
        logger.info("Profile API called");
        return profileService.getProfile();
    }

    @GetMapping("/skills")
    public String[] getSkills() {
        logger.info("Skills API called");
        return profileService.getSkills();
    }
}