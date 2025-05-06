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

    // Return all student
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    // Return one student by ID
    // TODO: bad practice to return student
    public Student findById(int theId) {

        Optional<Student> studentFound = studentRepository.findById(theId);

        Student student = null;

        if (studentFound.isPresent()) {
            student = studentFound.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return student;
    }

    public void save(Student theStudent) { studentRepository.save(theStudent);}

    public void deleteById(int theId) {
        studentRepository.deleteById(theId);
    }
}






