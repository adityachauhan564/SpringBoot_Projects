package com.jbdl63.digitalLibrary.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbdl63.digitalLibrary.Model.Book;
import com.jbdl63.digitalLibrary.Model.User;
import com.jbdl63.digitalLibrary.Service.UserService;

@RestController
@RequestMapping(value = "/v1/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> addNewUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.addNewUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/{userName}")
    public ResponseEntity<List<Book>> findAllBooksIssuedToUser(@PathVariable String userName) {
        return new ResponseEntity<>(userService.findAllBooksIssuedToUser(userName), HttpStatus.OK);
    }
}



 // >> Old code 
//@RestController
//@RequestMapping(value = "/v1/users", produces = MediaType.APPLICATION_JSON_VALUE)
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @PostMapping
//    public ResponseEntity<User> addNewUser(@RequestBody User user) {
//        return new ResponseEntity<>(userService.addNewUser(user), HttpStatus.CREATED);
//    }
//
//    @GetMapping("/{userName}")
//    
//    
//    public ResponseEntity<List<User>> findAllBooksIssuedToUser(@PathVariable("userName") String userName) {
//   
//       return new ResponseEntity<>(userService.findAllBooksIssuedToUser(userName), HttpStatus.OK);
//        
//        
//       // return new ResponseEntity<List<User>>(userService.findAllBooksIssuedToUser(userName), HttpStatus.OK);
//
//        
//    }
//
//}