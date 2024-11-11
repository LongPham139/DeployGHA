package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Service.HelloService;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void sayHello() {
		String hello = "Hello";
		HelloService hs = new HelloService();
		String fn = hs.sayHello();
		Assert.assertEquals(fn, hello);
	}

	@Test
	public void sayHi() {
		String hi = "Hi";
		HelloService hs = new HelloService();
		String fn = hs.sayHello();
		Assert.assertEquals(fn, hi);
	}
}
