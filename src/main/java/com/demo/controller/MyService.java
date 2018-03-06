package com.demo.controller;


import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void hello(String name) {
        System.out.println("hello " + name);
    }
}
