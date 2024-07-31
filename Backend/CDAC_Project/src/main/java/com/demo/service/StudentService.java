package com.demo.service;

import com.demo.beans.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(Long studentId);
    Student saveStudent(Student student);
    void deleteStudent(Long studentId);
}
