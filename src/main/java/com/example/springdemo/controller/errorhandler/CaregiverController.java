package com.example.springdemo.controller.errorhandler;

import com.example.springdemo.dto.CaregiverDTO;
import com.example.springdemo.entities.ApiResponse;
import com.example.springdemo.entities.Caregiver;
import com.example.springdemo.entities.Patient;
import com.example.springdemo.services.CaregiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/caregivers")
public class CaregiverController {
    @Autowired
    private CaregiverService docService;

    @PostMapping
    public ApiResponse<Caregiver> saveUser(@RequestBody CaregiverDTO user){
        return new ApiResponse<>(HttpStatus.OK.value(), "Caregiver saved successfully.",docService.insert(user));
    }

    @GetMapping
    public ApiResponse<List<Caregiver>> listUser(){
        return new ApiResponse<>(HttpStatus.OK.value(), "Caregivers list fetched successfully.",docService.findAll());
    }

    @GetMapping("/{id}")
    public ApiResponse<Caregiver> getOne(@PathVariable int id){
        return new ApiResponse<>(HttpStatus.OK.value(), "Caregiver fetched successfully.",docService.findCaregiverByIdCaregiver(id));
    }
//    @GetMapping("/{id}")
//    public ApiResponse<Patient> getPatients(@PathVariable int id){
//        return new ApiResponse<>(HttpStatus.OK.value(), "Caregiver fetched successfully.",docService.findAllPatientFroCaregiver(id));
//    }
    @PutMapping("/{id}")
    public ApiResponse<CaregiverDTO> update(@RequestBody CaregiverDTO userDto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "Caregiver updated successfully.",docService.update(userDto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> deleteUser(@PathVariable int id) {
        docService.deleteUser(docService.findCaregiverByIdCaregiver(id));
        return new ApiResponse<>(HttpStatus.OK.value(), "Caregiver deleted successfully.", null);
    }



}
