package com.example.springdemo.controller.errorhandler;

import com.example.springdemo.dto.PatientDTO;
import com.example.springdemo.dto.builder.CaregiverBuilder;
import com.example.springdemo.dto.builder.PatientBuilder;
import com.example.springdemo.dto.builder.builderViews.CaregiverViewBuilder;
import com.example.springdemo.dto.builder.builderViews.PatientViewBuilder;
import com.example.springdemo.dto.dtoVIEWS.CaregiverViewDTO;
import com.example.springdemo.dto.dtoVIEWS.PatientViewDTO;
import com.example.springdemo.entities.ApiResponse;
import com.example.springdemo.entities.Caregiver;
import com.example.springdemo.entities.Patient;
import com.example.springdemo.services.CaregiverService;
import com.example.springdemo.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/caregiver_patient")
public class caregiver_patientController {
    @Autowired
    private CaregiverService careService;

    @Autowired
    private PatientService patService;
//
//    @GetMapping("/{id}")
//    public ApiResponse<Caregiver> getOne(@PathVariable int id){
//        return new ApiResponse<>(HttpStatus.OK.value(), "Caregiver fetched successfully.",careService.findCaregiverByIdCaregiver(id));
//    }
    @GetMapping("/{idCare}/{idPac}")
    public ApiResponse<Patient> getOne(@PathVariable int idCare,@PathVariable int idPat){
       PatientViewDTO pp= patService.findPatientByIdPatient(idPat);
        CaregiverViewDTO cc=careService.findCaregiverByIdCaregiver(idCare);
        pp.setCaregiver_idCaregiver(CaregiverViewBuilder.generateEntityFromDTO(cc));
        Patient pat=PatientViewBuilder.generateEntityFromDTO(pp);
        PatientDTO ppat= PatientBuilder.generateDTOFromEntity(pat);
        patService.update(ppat);
        return new ApiResponse<>(HttpStatus.OK.value(), "Patient fetched successfully.",patService.findPatientByIdPatient(ppat.getIdPatient()));
    }
//



}
