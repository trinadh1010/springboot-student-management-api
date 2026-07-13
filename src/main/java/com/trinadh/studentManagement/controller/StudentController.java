package com.trinadh.studentManagement.controller;


import com.trinadh.studentManagement.dto.StudentRequestDto;
import com.trinadh.studentManagement.dto.StudentResponseDto;
import com.trinadh.studentManagement.model.Students;
import com.trinadh.studentManagement.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService stud;

    @PostMapping("/students")
    public ResponseEntity<?> addStudents(@Valid @RequestBody StudentRequestDto stu){
        String message =stud.addStudent(stu);
        return ResponseEntity.status(HttpStatus.CREATED).body(message);
    }
    @GetMapping("/students")
    public List<StudentResponseDto> getStudents(){
        return stud.getStudent();
    }
    @GetMapping("/students/{StudId}")
    public StudentResponseDto getStudentById(@PathVariable int StudId){
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
