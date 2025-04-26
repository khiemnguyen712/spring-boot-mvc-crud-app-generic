package com.sukaseven.springboot.thymeleafmvccrud.dao;

import com.sukaseven.springboot.thymeleafmvccrud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    // full CRUD functionalities provided
}
