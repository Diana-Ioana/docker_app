package com.example.springdemo.dto.builder;

import com.example.springdemo.dto.CaregiverDTO;
import com.example.springdemo.dto.MedicationDTO;
import com.example.springdemo.entities.Caregiver;
import com.example.springdemo.entities.Medication;

public class MedicationBuilder {

    public MedicationBuilder() {}
    public static MedicationDTO generateDTOFromEntity(Medication pat)
    {
        return new MedicationDTO(pat.getIdmedication(),
                pat.getMedicationName(),
                pat.getDosage(),
                pat.getSideEffects(),
                pat.getIntakeIntervals(),
                pat.getMedication_idMedication());
    }
    public static Medication generateEntityFromDTO(MedicationDTO pat)
    {
        return new Medication(pat.getIdmedication(),
                pat.getMedicationName(),
                pat.getDosage(),
                pat.getSideEffects(),
                pat.getIntakeIntervals(),
                pat.getMedication_idMedication());
    }


}
