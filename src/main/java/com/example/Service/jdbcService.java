package com.example.Service;

import org.springframework.stereotype.Service;

@Service
public class jdbcService {
    public void getById(Long id){
        System.out.println("get by id("+id+")");
    }
}
