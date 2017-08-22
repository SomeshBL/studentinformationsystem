package com.studentinformation.service.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentinformation.dao.student.StudentRepository;
import com.studentinformation.domain.student.Student;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student addStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

    public Iterable<Student> getStudents(){
        return studentRepository.findAll();
    }
}
