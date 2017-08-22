package com.studentinformation.dao.student;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.studentinformation.domain.student.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
