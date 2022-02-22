package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import javax.annotation.Priority;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestClass {
	
	@LocalServerPort
    private int port;
	
	@BeforeEach
	void setup() {
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = port;
	}
	
	@Test
	void Test_Get_1() throws InterruptedException {
	
	System.out.println("Function Test1");
	RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.request(Method.GET , "/users?page=1&limit=50");
	assertEquals(response.statusCode(), 200);
	System.out.println(response.asPrettyString());
		
	}
	
	@Test
	void Test_Post_2() throws InterruptedException {
	
	System.out.println("Function Test2");
	RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.request(Method.POST, "/users");
	assertEquals(response.statusCode(), 200);
	System.out.println(response.asPrettyString());
		
	}

}
