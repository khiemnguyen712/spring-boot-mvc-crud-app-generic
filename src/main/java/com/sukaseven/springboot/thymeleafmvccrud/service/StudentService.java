package com.sukaseven.springboot.thymeleafmvccrud.service;

import com.sukaseven.springboot.thymeleafmvccrud.dao.StudentRepository;
import com.sukaseven.springboot.thymeleafmvccrud.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService{

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository theEmployeeRepository) {
        studentRepository = theEmployeeRepository;
    }

    // List all students
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    // List one student by ID
    public Student findById(int theId) {
        Optional<Student> result = studentRepository.findById(theId);

        Student theStudent = null;

        if (result.isPresent()) {
            theStudent = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return theStudent;
    }

    public void save(Student theStudent) { studentRepository.save(theStudent);}

    public void deleteById(int theId) {
        studentRepository.deleteById(theId);
    }
}






