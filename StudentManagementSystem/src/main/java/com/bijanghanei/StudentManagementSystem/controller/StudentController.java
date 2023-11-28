package com.bijanghanei.StudentManagementSystem.controller;

import com.bijanghanei.StudentManagementSystem.entity.Student;
import com.bijanghanei.StudentManagementSystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("student",student);
        return "create-student-form";
    }
    @GetMapping("/edit/{id}")
    public String editStudentForm(@PathVariable Integer id,Model model){
        Student student = studentService.findById(id);
        model.addAttribute("student",student);
        return "edit-student-form";
    }
    @PostMapping("/list")
    public String saveStudents(@ModelAttribute("student") Student student){
        studentService.save(student);
        return "redirect:/students/list";
    }
    @PostMapping("/update/{id}")
    public String updateStudent(@ModelAttribute("student") Student student){
        studentService.save(student);
        return "redirect:/students/list";
    }
}
