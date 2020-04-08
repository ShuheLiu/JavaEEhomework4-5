package com.example.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.example")
public class StudentHomework {
    private Long id;
    private Long studentId;
    private Long homeworkId;
    private String homeworkTitle;
    private String homeworkContent;
    private String createTime;
    private String updateTime;

    public StudentHomework(){
        super();
    }

    public StudentHomework(Long id,Long studentId,Long homeworkId,String homeworkTitle,String homeworkContent,String createTime){
        super();
        this.id=id;
        this.studentId=studentId;
        this.homeworkId=homeworkId;
        this.homeworkTitle=homeworkTitle;
        this.homeworkContent=homeworkContent;
        this.createTime=createTime;
    }

    public  StudentHomework sth(){
        return new StudentHomework(1l,111l,1111l,"hhhh","xxxx","hhhhhh");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getHomeworkId() {
        return homeworkId;
    }

    public void setHomeworkId(Long homeworkId) {
        this.homeworkId = homeworkId;
    }

    public String getHomeworkTitle() {
        return homeworkTitle;
    }

    public void setHomeworkTitle(String homeworkTitle) {
        this.homeworkTitle = homeworkTitle;
    }

    public String getHomeworkContent() {
        return homeworkContent;
    }

    public void setHomeworkContent(String homeworkContent) {
        this.homeworkContent = homeworkContent;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String toString(){
        return "("+id+","+ studentId+","+homeworkId+ ",'"+homeworkTitle+"','"+homeworkContent+"','"+createTime+"','"+updateTime+"')";
    }
}
