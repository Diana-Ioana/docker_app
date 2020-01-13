package com.example.springdemo.controller.errorhandler;

import com.example.springdemo.dto.MedicationDTO;
import com.example.springdemo.entities.ApiResponse;
import com.example.springdemo.entities.Medication;
import com.example.springdemo.services.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping(value = "/medications")
public class MedicationController {
    @Autowired
    private MedicationService docService;

    @PostMapping
    public ApiResponse<Medication> saveUser(@RequestBody MedicationDTO user){
        return new ApiResponse<>(HttpStatus.OK.value(), "Medication saved successfully.",docService.insert(user));
    }

    @GetMapping
    public ApiResponse<List<Medication>> listUser(){
        return new ApiResponse<>(HttpStatus.OK.value(), "Medication list fetched successfully.",docService.findAll());
    }

    @GetMapping("/{id}")
    public ApiResponse<Medication> getOne(@PathVariable int id){
        return new ApiResponse<>(HttpStatus.OK.value(), "Medication fetched successfully.",docService.findMedicationByIdMedication(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<MedicationDTO> update(@RequestBody MedicationDTO userDto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "Medication updated successfully.",docService.update(userDto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> deleteUser(@PathVariable int id) {
        docService.deleteUser(docService.findMedicationByIdMedication(id));
        return new ApiResponse<>(HttpStatus.OK.value(), "Medication deleted successfully.", null);
    }

}
