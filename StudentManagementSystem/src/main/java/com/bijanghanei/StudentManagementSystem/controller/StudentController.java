package com.bijanghanei.StudentManagementSystem.controller;

import com.bijanghanei.StudentManagementSystem.entity.Student;
import com.bijanghanei.StudentManagementSystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // handler method to provide list of all students
    @GetMapping("/list")
    public String listStudents(Model model){
        model.addAttribute("students",studentService.findAll());
        return "list-students";
    }
    @GetMapping("/new")
    public String createStudentForm(Model model){
        Student student = new Student();
        model.addAttribute("students",student);
        return "create-student-form";
    }
}
