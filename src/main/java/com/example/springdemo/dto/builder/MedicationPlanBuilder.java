package com.example.springdemo.dto.builder;

import com.example.springdemo.dto.MedicationDTO;
import com.example.springdemo.dto.MedicationPlanDTO;
import com.example.springdemo.entities.Medication;
import com.example.springdemo.entities.MedicationPlan;

public class MedicationPlanBuilder {
    public MedicationPlanBuilder() {}
    public static MedicationPlanDTO generateDTOFromEntity(MedicationPlan pat)
    {
        return new MedicationPlanDTO(pat.getIdMedicationPlan(),
                pat.getStartDate(),
                pat.getEndDate(),
                pat.getPatient_idPatient(),
                pat.getMedicationsList());
    }
    public static MedicationPlan generateEntityFromDTO(MedicationPlanDTO pat)
    {
        return new MedicationPlan(pat.getIdMedicationPlan(),
                pat.getStartDate(),
                pat.getEndDate(),
                pat.getPatient_idPatient(),
                pat.getMedicationsList());
    }



}
