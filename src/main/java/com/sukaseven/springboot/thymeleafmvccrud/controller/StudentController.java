package com.sukaseven.springboot.thymeleafmvccrud.controller;

import com.sukaseven.springboot.thymeleafmvccrud.entity.Student;
import com.sukaseven.springboot.thymeleafmvccrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/list")
    public String listStudent(Model model) {

        List<Student> students = studentService.findAll();

        model.addAttribute("students", students);

        return "student-list";
    }

    // To show the ADD form
    @GetMapping("/add-student")
    public String addStudentForm(Model model) {

        Student student = new Student();

        model.addAttribute("student", student);

        return "student-form";
    }

    // To show the UPDATE form
    @GetMapping("/update-student")
    public String updateStudentForm(@RequestParam("studentId") int id, Model model) {

        Student student = studentService.findById(id);

        model.addAttribute("student", student);

        return "student-form";
    }

    @GetMapping("/delete-student")
    public String deleteStudent(@RequestParam("studentId") int id, Model model) {

        studentService.deleteById(id);

        return "redirect:/students/list";
    }

    // To process the ADD or UPDATE
    @PostMapping("/save")
    public String processStudentForm(@ModelAttribute("student") Student student) {

        studentService.save(student);

        return "redirect:/students/list";
    }

}