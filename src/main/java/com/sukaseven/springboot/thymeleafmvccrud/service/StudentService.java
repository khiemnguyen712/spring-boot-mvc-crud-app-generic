package com.sukaseven.springboot.thymeleafmvccrud.service;

import com.sukaseven.springboot.thymeleafmvccrud.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    List<Student> findAll();

    Student findById(int theId);

    Student save(Student theEmployee);

    void deleteById(int theId);

}
