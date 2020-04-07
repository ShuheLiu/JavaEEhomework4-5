package com.example.Service;

public class StudentService {
    private Long student_id;
    private String student_name;
    private String grade;

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String toString(){
        return "("+student_id+",'"+student_name+"','"+grade+"')";
    }
}
