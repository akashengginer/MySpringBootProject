package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TestClass {
	
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	@Test
	public void testAdd() {
		int total = 8;
		int sum = add(4, 4);
		assertEquals(sum, total);
	}

	@Test
	public void testFailedAdd() {
		int total = 9;
		int sum = add(10, 5);
		assertNotSame(sum, total);
	}

	@Test
	public void testSub() {
		int total = 0;
		int sub = sub(4, 4);
		assertEquals(sub, total);
	}
	
//	@BeforeEach
//	void setUp(Method methodname) {
//		System.out.println("Before method : " + methodname);
//	}
//
//	@Test
//	void Test1() throws InterruptedException {
//	
//	System.out.println("Function Test1");
//	RestAssured.baseURI = "http://localhost:8080/users";
//	RequestSpecification httpRequest = RestAssured.given();
//	Response response = httpRequest.request(Method.GET , "?page=1&limit=50");
//	System.out.println(response.asPrettyString());
//		
//	}
//	
//	@Test
//	void Test2() throws InterruptedException {
//	
//	System.out.println("Function Test2");
//		
//	}

}
