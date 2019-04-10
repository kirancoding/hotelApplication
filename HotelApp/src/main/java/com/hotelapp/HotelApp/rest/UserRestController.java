package com.hotelapp.HotelApp.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hotelapp.HotelApp.entity.User;
import com.hotelapp.HotelApp.service.UserService;

@RestController
@RequestMapping("/api")
public class UserRestController {
 
	private UserService userService;;

	public UserRestController() {

	}

	@Autowired
	public UserRestController(UserService userService) {
		this.userService = userService;
	}
	
	
	
//	@PostMapping("/users/{email}/{userName}/{userPhone}/{userpassword}")
//	public String register(@PathVariable String email,@PathVariable String userName,@PathVariable long userPhone,@PathVariable String userpassword) {
//		System.out.println(email+" "+userName);
//		return userService.register(email, userName, userPhone, userpassword);	
//	}
	@PostMapping("/user")
    public ResponseEntity create(@Valid @RequestBody User user) {
        return ResponseEntity.ok(userService.register(user));
    }
	
	
	
	
	
	
	
}
