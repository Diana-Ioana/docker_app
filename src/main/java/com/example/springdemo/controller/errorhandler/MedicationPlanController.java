package com.example.springdemo.controller.errorhandler;

import com.example.springdemo.dto.MedicationPlanDTO;
import com.example.springdemo.entities.ApiResponse;
import com.example.springdemo.entities.MedicationPlan;
import com.example.springdemo.services.MedicationPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping(value = "/medicationplans")
public class MedicationPlanController {

    @Autowired
    private MedicationPlanService docService;

    @PostMapping
    public ApiResponse<MedicationPlan> saveUser(@RequestBody MedicationPlanDTO user){
        return new ApiResponse<>(HttpStatus.OK.value(), "MedicationPlanD saved successfully.",docService.insert(user));
    }

    @GetMapping
    public ApiResponse<List<MedicationPlan>> listUser(){
        return new ApiResponse<>(HttpStatus.OK.value(), "MedicationPlan list fetched successfully.",docService.findAll());
    }

    @GetMapping("/{id}")
    public ApiResponse<MedicationPlan> getOne(@PathVariable int id){
        return new ApiResponse<>(HttpStatus.OK.value(), "MedicationPlan fetched successfully.",docService.findMedicationPlanByIdMedicationPlan(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<MedicationPlanDTO> update(@RequestBody MedicationPlanDTO userDto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "MedicationPlan updated successfully.",docService.update(userDto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> deleteUser(@PathVariable int id) {
        docService.deleteUser(docService.findMedicationPlanByIdMedicationPlan(id));
        return new ApiResponse<>(HttpStatus.OK.value(), "MedicationPlan deleted successfully.", null);
    }


}
