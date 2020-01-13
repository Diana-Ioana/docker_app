package com.example.springdemo.dto.builder.builderViews;

import com.example.springdemo.dto.dtoVIEWS.MedicationPlanViewDTO;
import com.example.springdemo.entities.MedicationPlan;

public class MedicationPlanViewBuilder {

    public static MedicationPlanViewDTO generateDTOFromEntity(MedicationPlan person){
        return new MedicationPlanViewDTO(
                person.getIdMedicationPlan(),
                person.getEndDate(),
                person.getStartDate(),
                person.getPatient_idPatient(),
                person.getMedicationsList()

        );
    }

    public static MedicationPlan generateEntityFromDTO(MedicationPlanViewDTO personViewDTO){
        return new MedicationPlan(
                personViewDTO.getIdMedicationPlan(),
                personViewDTO.getEndDate(),
                personViewDTO.getStartDate(),
                personViewDTO.getPatient_idPatient(),
                personViewDTO.getMedicationsList()
        );
    }
}
