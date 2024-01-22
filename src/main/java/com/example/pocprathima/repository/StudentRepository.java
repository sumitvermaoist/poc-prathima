package com.example.pocprathima.repository;

import com.example.pocprathima.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {


}
