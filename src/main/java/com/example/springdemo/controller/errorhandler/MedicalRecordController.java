package com.example.springdemo.controller.errorhandler;

import com.example.springdemo.dto.MedicalRecordDTO;
import com.example.springdemo.entities.ApiResponse;
import com.example.springdemo.entities.MedicalRecord;
import com.example.springdemo.services.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping(value = "/medicalrecords")
public class MedicalRecordController {
    @Autowired
    private MedicalRecordService docService;

    @PostMapping
    public ApiResponse<MedicalRecord> saveUser(@RequestBody MedicalRecordDTO user){
        return new ApiResponse<>(HttpStatus.OK.value(), "MedicalRecord saved successfully.",docService.insert(user));
    }

    @GetMapping
    public ApiResponse<List<MedicalRecord>> listUser(){
        return new ApiResponse<>(HttpStatus.OK.value(), "MedicalRecord list fetched successfully.",docService.findAll());
    }

    @GetMapping("/{id}")
    public ApiResponse<MedicalRecord> getOne(@PathVariable int id){
        return new ApiResponse<>(HttpStatus.OK.value(), "MedicalRecord fetched successfully.",docService.findMedicalRecordByIdMedicalRecord(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<MedicalRecordDTO> update(@RequestBody MedicalRecordDTO userDto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "MedicalRecord updated successfully.",docService.update(userDto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> deleteUser(@PathVariable int id) {
        docService.deleteUser(docService.findMedicalRecordByIdMedicalRecord(id));
        return new ApiResponse<>(HttpStatus.OK.value(), "MedicalRecord deleted successfully.", null);
    }


}
