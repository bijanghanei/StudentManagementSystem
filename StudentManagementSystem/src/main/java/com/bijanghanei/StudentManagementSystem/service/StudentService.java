package com.bijanghanei.StudentManagementSystem.service;

import com.bijanghanei.StudentManagementSystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    void save(Student student);
}
