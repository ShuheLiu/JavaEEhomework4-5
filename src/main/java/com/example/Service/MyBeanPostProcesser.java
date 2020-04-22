package com.example.Service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcesser implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException{
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException{
        System.out.println("bean '"+beanName+"' created:"+bean.toString());
        return bean;
    }

}
