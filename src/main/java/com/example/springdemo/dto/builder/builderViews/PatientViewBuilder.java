package com.example.springdemo.dto.builder.builderViews;

import com.example.springdemo.dto.dtoVIEWS.PatientViewDTO;
import com.example.springdemo.dto.dtoVIEWS.PatientViewDTO;
import com.example.springdemo.entities.Patient;
import com.example.springdemo.entities.Patient;

public class PatientViewBuilder {

    public static PatientViewDTO generateDTOFromEntity(Patient person){
        return new PatientViewDTO(
                person.getIdPatient(),
                person.getPatientName(),
                person.getPatientSurname(),
                person.getPatientGender(),
                person.getPatientBirthdate(),
                person.getPatientAddress(),
                person.getCaregiver_idCaregiver()
        );
    }

    public static Patient generateEntityFromDTO(PatientViewDTO personViewDTO){
        return new Patient(
                personViewDTO.getIdPatient(),
                personViewDTO.getPatientName(),
                personViewDTO.getPatientSurname(),
                personViewDTO.getPatientGender(),
                personViewDTO.getPatientBirthdate(),
                personViewDTO.getPatientAddress(),
                personViewDTO.getCaregiver_idCaregiver()
        );
    }



}
