package com.example.springdemo.controller.errorhandler;

import com.example.springdemo.dto.UserDTO;
import com.example.springdemo.entities.ApiResponse;
import com.example.springdemo.entities.User;
import com.example.springdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService docService;

    @PostMapping
    public ApiResponse<User> saveUser(@RequestBody UserDTO user){
        return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully.",docService.insert(user));
    }

    @GetMapping
    public ApiResponse<List<User>> listUser(){
        return new ApiResponse<>(HttpStatus.OK.value(), "User list fetched successfully.",docService.findAll());
    }

    @GetMapping("/{id}")
    public ApiResponse<User> getOne(@PathVariable int id){
        return new ApiResponse<>(HttpStatus.OK.value(), "User fetched successfully.",docService.findUserByIdUser(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<UserDTO> update(@RequestBody UserDTO userDto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "User updated successfully.",docService.update(userDto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> deleteUser(@PathVariable int id) {
        docService.deleteUser(docService.findUserByIdUser(id));
        return new ApiResponse<>(HttpStatus.OK.value(), "User deleted successfully.", null);
    }



}
