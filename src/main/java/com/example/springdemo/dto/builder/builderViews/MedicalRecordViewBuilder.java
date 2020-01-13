package com.example.springdemo.dto.builder.builderViews;

import com.example.springdemo.dto.dtoVIEWS.MedicalRecordViewDTO;
import com.example.springdemo.entities.MedicalRecord;

public class MedicalRecordViewBuilder {

    public static MedicalRecordViewDTO generateDTOFromEntity(MedicalRecord person){
        return new MedicalRecordViewDTO(
                person.getIdMedicalRecord(),
                person.getMedicalRecord_idMedicalRecord(),
                person.getPatient()
        );
    }

    public static MedicalRecord generateEntityFromDTO(MedicalRecordViewDTO personViewDTO){
        return new MedicalRecord(
                personViewDTO.getIdMedicalRecord(),
                personViewDTO.getMedicalRecord_idMedicalRecord(),
                personViewDTO.getPatient()
        );
    }

}
