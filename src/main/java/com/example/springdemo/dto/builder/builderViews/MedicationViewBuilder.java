package com.example.springdemo.dto.builder.builderViews;

import com.example.springdemo.dto.dtoVIEWS.MedicationViewDTO;
import com.example.springdemo.entities.Medication;

public class MedicationViewBuilder {
    public static MedicationViewDTO generateDTOFromEntity(Medication person){
        return new MedicationViewDTO(
                person.getIdmedication(),
                person.getMedicationName(),
                person.getDosage(),
                person.getSideEffects(),
                person.getIntakeIntervals(),
                person.getMedication_idMedication()

        );
    }

    public static Medication generateEntityFromDTO(MedicationViewDTO personViewDTO){
        return new Medication(
                personViewDTO.getIdmedication(),
                personViewDTO.getMedicationName(),
                personViewDTO.getDosage(),
                personViewDTO.getSideEffects(),
                personViewDTO.getIntakeIntervals(),
                personViewDTO.getMedication_idMedication()
        );
    }


}
