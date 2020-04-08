package com.example.spring;

import com.example.bean.Student;
import com.example.bean.StudentHomework;
import com.example.bean.StudentHomeworkJDBC;
import com.example.bean.TestBean;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;

public class testSpring {

    public static void main(String[] args) {
        /*AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(StudentHomework.class);*/
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");

        Student service=context.getBean("Student",Student.class);
        /*StudentHomework service=(StudentHomework) context.getBean("StudentHomework");*/
        System.out.println(service.toString());

    }
}
