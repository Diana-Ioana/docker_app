package com.example.springdemo.dto.builder.builderViews;

import com.example.springdemo.dto.dtoVIEWS.DoctorViewDTO;
import com.example.springdemo.entities.Doctor;

public class DoctorViewBuilder {

    public static DoctorViewDTO generateDTOFromEntity(Doctor person){
        return new DoctorViewDTO(
                person.getIdDoctor(),
                person.getDoctorName(),
                person.getDoctorSurname(),
                person.getDoctorGender(),
                person.getDoctorAddress()
                );
    }

    public static Doctor generateEntityFromDTO(DoctorViewDTO personViewDTO){
        return new Doctor(
                personViewDTO.getIdDoctor(),
                personViewDTO.getDoctorName(),
                personViewDTO.getDoctorSurname(),
                personViewDTO.getDoctorGender(),
                personViewDTO.getDoctorAddress()
            );
    }
}
