package com.raunak.api.controller;

import com.raunak.api.model.Testimonial;
import com.raunak.api.service.TestimonialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/testimonials")
@CrossOrigin("*") // allow frontend
public class TestimonialController {

    @Autowired
    private TestimonialService service;

    // ✅ POST API
    @PostMapping
    public Testimonial add(@RequestBody Testimonial t) {
        return service.save(t);
    }

    // ✅ GET API
    @GetMapping
    public List<Testimonial> getAll() {
        return service.getAll();
    }
}
