package com.example.springdemo.dto.builder.builderViews;

import com.example.springdemo.dto.dtoVIEWS.DiseaseViewDTO;
import com.example.springdemo.entities.Disease;

public class DiseaseViewBuilder {

    public static DiseaseViewDTO generateDTOFromEntity(Disease person){
        return new DiseaseViewDTO(
                person.getIdDisease(),
                person.getDiseaseName(),
                person.getDiseaseDiagnosticDate(),
                person.getDiseaseSimptoms(),
                person.getMedicalRecord_idMedicalRecord()

        );
    }

    public static Disease generateEntityFromDTO(DiseaseViewDTO personViewDTO){
        return new Disease(
                personViewDTO.getIdDisease(),
                personViewDTO.getDiseaseName(),
                personViewDTO.getDiseaseDiagnosticDate(),
                personViewDTO.getDiseaseSimptoms(),
                personViewDTO.getMedicalRecord_idMedicalRecord()

        );
    }
}
