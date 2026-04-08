package com.example.demo.courses.repository;

import com.example.demo.courses.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}