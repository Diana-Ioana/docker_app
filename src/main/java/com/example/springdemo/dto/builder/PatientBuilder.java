package com.example.springdemo.dto.builder;

import com.example.springdemo.dto.PatientDTO;
import com.example.springdemo.entities.Patient;

public class PatientBuilder {

    public PatientBuilder(){}
    public static PatientDTO generateDTOFromEntity(Patient pat)
    {
        return new PatientDTO(pat.getIdPatient(),
                     pat.getPatientName(),
                    pat.getPatientSurname(),
                    pat.getPatientGender(),
                    pat.getPatientBirthdate(),
                    pat.getPatientAddress(),
                    pat.getPatientEmail(),
                    pat.getPatientPassword(),
                    pat.getCaregiver_idCaregiver());
    }
    public static Patient generateEntityFromDTO(PatientDTO pat)
    {
        return new Patient(pat.getIdPatient(),
                pat.getPatientName(),
                pat.getPatientSurname(),
                pat.getPatientGender(),
                pat.getPatientBirthdate(),
                pat.getPatientAddress(),
                pat.getPatientEmail(),
                pat.getPatientPassword(),
                pat.getCaregiver_idCaregiver());

    }

}
