package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@SpringBootTest
public class TestClass {

	@Test
	void Test1() throws InterruptedException {
	
	RestAssured.baseURI = "http://localhost:8080/users";
	RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.request(Method.GET , "?page=1&limit=50");
	System.out.println(response.asPrettyString());
		
	}

}
