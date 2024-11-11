package com.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Service.HelloService;

@SpringBootTest
public class HelloControllerTest {
    @Test
    public void sayHello(){
        String hello = "Hello";
        HelloService hs = new HelloService();
        String fn = hs.sayHello();
        Assert.assertEquals(fn, hello);
    }

    @Test
    public void sayHi(){
        String hi = "Hi";
        HelloService hs = new HelloService();
        String fn = hs.sayHello();
        Assert.assertEquals(fn, hi);
    }
}
