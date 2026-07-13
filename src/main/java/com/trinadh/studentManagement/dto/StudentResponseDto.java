package com.trinadh.studentManagement.dto;

public class StudentResponseDto {
    private int id;
    private String name;

    public StudentResponseDto() {
    }

    public StudentResponseDto(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
