package com.example.springdemo.controller.errorhandler;

import com.example.springdemo.dto.DiseaseDTO;
import com.example.springdemo.entities.ApiResponse;
import com.example.springdemo.entities.Disease;
import com.example.springdemo.services.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping(value = "/diseases")
public class DiseaseController {
    @Autowired
    private DiseaseService docService;

    @PostMapping
    public ApiResponse<Disease> saveUser(@RequestBody DiseaseDTO user){
        return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully.",docService.insert(user));
    }

    @GetMapping
    public ApiResponse<List<Disease>> listUser(){
        return new ApiResponse<>(HttpStatus.OK.value(), "User list fetched successfully.",docService.findAll());
    }

    @GetMapping("/{id}")
    public ApiResponse<Disease> getOne(@PathVariable int id){
        return new ApiResponse<>(HttpStatus.OK.value(), "User fetched successfully.",docService.findDiseaseByIdDisease(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<DiseaseDTO> update(@RequestBody DiseaseDTO userDto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "User updated successfully.",docService.update(userDto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> deleteUser(@PathVariable int id) {
        docService.deleteUser(docService.findDiseaseByIdDisease(id));
        return new ApiResponse<>(HttpStatus.OK.value(), "User deleted successfully.", null);
    }

}
