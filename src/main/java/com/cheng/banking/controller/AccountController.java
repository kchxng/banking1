package com.cheng.banking.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
    @GetMapping
    public String getAllUser() {
        return "All bank accounts";
    }
    // @GetMapping("/all")
	// public ResponseEntity<List<Account>> getAllUser(){
	// 	List<Account> user=userService.getAllUser();
	// 	return new ResponseEntity<>(user,HttpStatus.OK);
	// }
}
