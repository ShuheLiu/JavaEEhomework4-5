package com.example.bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Homework {
    private Long homeworkId;
    private String HomeworkDetail;
    private String startTime;
    private String endTime;

    public Homework(){
        super();
    }

    public Homework(Long homeworkId,String homeworkDetail,String startTime,String endTime){
        super();
        this.homeworkId=homeworkId;
        this.HomeworkDetail=homeworkDetail;
        this.startTime=startTime;
        this.endTime=endTime;
    }

    public void setHomeworkId(Long homeworkId) {
        this.homeworkId = homeworkId;
    }

    public Long getHomeworkId() {
        return homeworkId;
    }

    public void setHomeworkDetail(String homeworkDetail) {
        HomeworkDetail = homeworkDetail;
    }

    public String getHomeworkDetail() {
        return HomeworkDetail;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String toString(){
        return "("+this.homeworkId+",'"+this.HomeworkDetail+"','"+this.startTime+"','"+this.endTime+"')";
    }
}
