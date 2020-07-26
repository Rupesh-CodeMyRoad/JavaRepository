package edu.broadwasy.firstspringdemo.controller;

/*
this cass is used to make simple rest api
using @RestController
 */

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
/*
versioning in api
 */
@RequestMapping("/api/v1")             //universal versioning garni tarika sabaima yehi endpoint hunxa
public class MyFirstController {

/*
Value in request mapping denotes url
Method in request mapping denotes the HTTP method
*/

@RequestMapping(value = "student",method = RequestMethod.GET)
    public String testStudent(){
    return "Hello Guys";
}

/*
Direct ways for Get method rest
 */
@GetMapping("student/create")
    public String  createStudent(){
    return " no data was sent!!";
}

/*
Standard way
*/

 /*
 Question mark in ResponseEntity denotes it accept all type of class as response
 same like -->> List<?> student == generics
  */
 @GetMapping("student/sample")
    public ResponseEntity<?> getStudent(){
    String responsedata = " this is the response entity sample";
    return new ResponseEntity<>(responsedata,null, HttpStatus.OK);
}
}
