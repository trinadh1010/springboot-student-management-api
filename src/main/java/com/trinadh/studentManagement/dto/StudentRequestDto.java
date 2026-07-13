package com.trinadh.studentManagement.dto;

import jakarta.validation.constraints.NotBlank;

public class StudentRequestDto {

    @NotBlank(message = "invalid name")
    private String name;
    @NotBlank(message = "invalid branch")
    private String branch;

    public StudentRequestDto(){

    }
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public StudentRequestDto(String branch, String name) {
        this.branch = branch;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
