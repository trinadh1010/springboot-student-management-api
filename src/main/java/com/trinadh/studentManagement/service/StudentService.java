package com.trinadh.studentManagement.service;

import com.trinadh.studentManagement.model.Students;
import com.trinadh.studentManagement.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;

    public String addStudent(Students stu) {
        repo.save(stu);
        return "Student added successfully";
    }

    public List<Students> getStudent() {
        return repo.findAll();
    }

    public Students getStudentById(int studId) {
        return repo.findById(studId).orElse(new Students());
    }

    public String updateStudent(Students stu) {
        repo.save(stu);
        return "student updated successufully";
    }

    public String deleteStudent(int studId) {
        repo.deleteById(studId);
        return "delete the student successfully";
    }
}
