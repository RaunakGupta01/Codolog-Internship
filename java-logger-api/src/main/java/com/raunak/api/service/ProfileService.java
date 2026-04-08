package com.raunak.api.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProfileService {

    public Map<String, String> getProfile() {
        Map<String, String> profile = new HashMap<>();
        profile.put("name", "Raunak Gupta");
        profile.put("course", "BSc AI & ML");
        profile.put("college", "TCSC");
        return profile;
    }

    public String[] getSkills() {
        return new String[]{
                "Java",
                "Spring Boot",
                "Machine Learning",
                "API Development"
        };
    }
}