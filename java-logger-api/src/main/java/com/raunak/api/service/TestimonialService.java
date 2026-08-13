package com.raunak.api.service;

import com.raunak.api.model.Testimonial;
import com.raunak.api.repository.TestimonialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestimonialService {

    @Autowired
    private TestimonialRepository repo;

    public Testimonial save(Testimonial t) {
        return repo.save(t);
    }

    public List<Testimonial> getAll() {
        return repo.findAll();
    }
}
