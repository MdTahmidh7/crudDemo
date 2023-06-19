package com.crud.service;

import com.crud.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();

    Student saveStudent(Student student);

    Student getStudentById(Long id);
    Student updateStudent(Student student);

    void deleteStudentsById(Long id);

}
