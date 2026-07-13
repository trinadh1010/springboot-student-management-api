package com.trinadh.studentManagement.service;

import com.trinadh.studentManagement.dto.StudentRequestDto;
import com.trinadh.studentManagement.dto.StudentResponseDto;
import com.trinadh.studentManagement.exception.StudentNotFoundException;
import com.trinadh.studentManagement.model.Students;
import com.trinadh.studentManagement.repo.StudentRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;

    public String addStudent(StudentRequestDto dto) {
        Students s= new Students();
        s.setName(dto.getName());
        s.setBranch(dto.getBranch());
        repo.save(s);
        return "Student added successfully";
    }

    public List<StudentResponseDto> getStudent() {
        List<StudentResponseDto> list=new ArrayList<>();
        List<Students> students = repo.findAll();
        for(Students st : students){
            StudentResponseDto dto = new StudentResponseDto();
            dto.setId(st.getId());
            dto.setName(st.getName());
            list.add(dto);

        }
        return list;
    }

    public StudentResponseDto getStudentById(int studId) {
        Students student = repo.findById(studId).orElseThrow(()->
                new StudentNotFoundException("student "+studId+" is not found"));
        StudentResponseDto dto =new StudentResponseDto();
        dto.setId(student.getId());
        dto.setName(student.getName());
        return dto;

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
