package com.example.demo.entity;

public class StudentProfile {

    private Long id;
    private String studentId;
    private String name;
    private String email;
    private String program;
    private int yearLevel;
    private boolean isRepeatOffender;
    public StudentProfile() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }


    public boolean isRepeatOffender() {
        return isRepeatOffender;
    }

   
    public void setRepeatOffender(boolean repeatOffender) {
        this.isRepeatOffender = repeatOffender;
    }
}
