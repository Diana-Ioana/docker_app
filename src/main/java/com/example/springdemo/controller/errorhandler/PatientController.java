package com.example.springdemo.controller.errorhandler;

import com.example.springdemo.dto.PatientDTO;
import com.example.springdemo.dto.builder.builderViews.CaregiverViewBuilder;
import com.example.springdemo.entities.ApiResponse;
import com.example.springdemo.entities.Patient;
import com.example.springdemo.services.CaregiverService;
import com.example.springdemo.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/patients")
public class PatientController {

    @Autowired
    private CaregiverService careService;
    @Autowired
    private PatientService docService;

    @PostMapping
    public ApiResponse<Patient> saveUser(@RequestBody PatientDTO user){
        user.setCaregiver_idCaregiver(CaregiverViewBuilder.generateEntityFromDTO(careService.findCaregiverByIdCaregiver(1)));
        return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully.",docService.insert(user));
    }

    @GetMapping
    public ApiResponse<List<Patient>> listUser(){
        return new ApiResponse<>(HttpStatus.OK.value(), "User list fetched successfully.",docService.findAll());
    }

//    @GetMapping
//    public ApiResponse<List<Patient>> seeAll(@RequestBody PatientDTO userDto){
//        return new ApiResponse<>(HttpStatus.OK.value(), "User list fetched successfully.",docService.findAllPatientFroCaregiver(userDto));
//    }

    @GetMapping("/{id}")
    public ApiResponse<Patient> getOne(@PathVariable int id){
        return new ApiResponse<>(HttpStatus.OK.value(), "User fetched successfully.",docService.findPatientByIdPatient(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<PatientDTO> update(@RequestBody PatientDTO userDto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "User updated successfully.",docService.update(userDto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> deleteUser(@PathVariable int id) {
        docService.deleteUser(docService.findPatientByIdPatient(id));
        return new ApiResponse<>(HttpStatus.OK.value(), "User deleted successfully.", null);
    }




}
