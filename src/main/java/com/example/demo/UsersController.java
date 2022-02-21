package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@GetMapping
	public String getUsers(@RequestParam(value="page") int pageno, @RequestParam(value="limit") int limitno) {
		return "http Get request sent for Page No : " + pageno + " and Limit : " + limitno;
	}
	
	@GetMapping(path="/{userID}")
	public String getUser(@PathVariable String userID) {
		return "http Get request sent for userID : " + userID;
	}
	
	@PostMapping
	public String createUser() {
		return "http Post request sent";
	}
	
	@PutMapping
	public String updateUser() {
		return "http Put request sent";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "http Delete request sent";
	}

}
