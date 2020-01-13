package com.example.springdemo.dto.builder;

import com.example.springdemo.dto.DiseaseDTO;
import com.example.springdemo.dto.MedicationDTO;
import com.example.springdemo.entities.Disease;
import com.example.springdemo.entities.Medication;

public class DiseaseBuilder {
    public DiseaseBuilder() {}
    public static DiseaseDTO generateDTOFromEntity(Disease pat)
    {
        return new DiseaseDTO(pat.getIdDisease(),
                pat.getDiseaseName(),
                pat.getDiseaseDiagnosticDate(),
                pat.getDiseaseSimptoms(),
                pat.getMedicalRecord_idMedicalRecord());
    }
    public static Disease generateEntityFromDTO(DiseaseDTO pat)
    {
        return new Disease(pat.getIdDisease(),
                pat.getDiseaseName(),
                pat.getDiseaseDiagnosticDate(),
                pat.getDiseaseSimptoms(),
                pat.getMedicalRecord_idMedicalRecord());
    }
}
