package com.example.springdemo.dto.builder;

import com.example.springdemo.dto.MedicalRecordDTO;
import com.example.springdemo.dto.MedicationPlanDTO;
import com.example.springdemo.entities.MedicalRecord;
import com.example.springdemo.entities.MedicationPlan;

public class MedicalRecordBuilder {
    public MedicalRecordBuilder() {}
    public static MedicalRecordDTO generateDTOFromEntity(MedicalRecord pat)
    {
        return new MedicalRecordDTO(pat.getIdMedicalRecord(),
                pat.getMedicalRecord_idMedicalRecord(),
                pat.getPatient());
    }
    public static MedicalRecord generateEntityFromDTO(MedicalRecordDTO pat)
    {
        return new MedicalRecord(pat.getIdMedicalRecord(),
                pat.getMedicalRecord_idMedicalRecord(),
                pat.getPatient());
    }

}
