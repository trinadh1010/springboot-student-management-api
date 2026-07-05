package com.trinadh.studentManagement.controller;


import com.trinadh.studentManagement.model.Students;
import com.trinadh.studentManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService stud;

    @PostMapping("/students")
    public String addStudents(@RequestBody Students stu){
        return stud.addStudent(stu);
    }
    @GetMapping("/students")
    public List<Students> getStudents(){
        return stud.getStudent();
    }
    @GetMapping("/students/{StudId}")
    public Students getStudentById(@PathVariable int StudId){
        return stud.getStudentById(StudId);
    }
    @PutMapping("/students")
    public String updateStudent(@RequestBody Students stu){
        return stud.updateStudent(stu);
    }
    @DeleteMapping("/students/{studId}")
    public String deleteStudent(@PathVariable int studId){
        return stud.deleteStudent(studId);
    }

}
