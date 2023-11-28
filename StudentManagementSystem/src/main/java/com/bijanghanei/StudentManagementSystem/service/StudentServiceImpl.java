package com.bijanghanei.StudentManagementSystem.service;

import com.bijanghanei.StudentManagementSystem.dao.StudentRepository;
import com.bijanghanei.StudentManagementSystem.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findById(Integer id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void deleteById(Integer id) {
        studentRepository.deleteById(id);
    }
}
