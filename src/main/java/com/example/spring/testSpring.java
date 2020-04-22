package com.example.spring;

import com.example.Service.jdbcService;
import com.example.aspect.testAspect;
import com.example.bean.Student;
import com.example.bean.StudentHomework;
import com.example.bean.StudentHomeworkJDBC;
import com.example.bean.TestBean;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;
@ComponentScan("com.example.*")
public class testSpring {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(testSpring.class);
        //ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");

       testAspect testAspect=context.getBean("testAspect", testAspect.class);
       System.out.println(testAspect.toString());
        jdbcService jdbcService=context.getBean("jdbcService", jdbcService.class);

        jdbcService.getById(10L);

        //Student service=context.getBean("Student",Student.class);
        /*StudentHomework service=(StudentHomework) context.getBean("StudentHomework");*/
        //System.out.println(service.toString());

    }
}
