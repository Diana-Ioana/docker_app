package com.example.springdemo.dto.builder;

import com.example.springdemo.dto.DoctorDTO;
import com.example.springdemo.dto.PatientDTO;
import com.example.springdemo.entities.Doctor;
import com.example.springdemo.entities.Patient;

public class DoctorBuilder {

    public DoctorBuilder(){}
    public static DoctorDTO generateDTOFromEntity(Doctor pat)
    {
        return new DoctorDTO(pat.getIdDoctor(),
                pat.getDoctorName(),
                pat.getDoctorSurname(),
                pat.getDoctorEmail(),
                pat.getDoctorPassword(),
                pat.getDoctorGender(),
                pat.getDoctorAddress());
    }
    public static Doctor generateEntityFromDTO(DoctorDTO pat)
    {
        return new Doctor(pat.getIdDoctor(),
                pat.getDoctorName(),
                pat.getDoctorSurname(),
                pat.getDoctorEmail(),
                pat.getDoctorPassword(),
                pat.getDoctorGender(),
                pat.getDoctorAddress());

    }
}
