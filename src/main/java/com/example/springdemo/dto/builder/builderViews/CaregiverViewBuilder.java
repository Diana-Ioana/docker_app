package com.example.springdemo.dto.builder.builderViews;

import com.example.springdemo.dto.dtoVIEWS.CaregiverViewDTO;
import com.example.springdemo.entities.Caregiver;

public class CaregiverViewBuilder {
    public static CaregiverViewDTO generateDTOFromEntity(Caregiver person){
        return new CaregiverViewDTO(
                person.getIdCaregiver(),
                person.getCaregiverName(),
                person.getCaregiverSurname(),
                person.getCaregiverGender(),
                person.getCaregiverBirthdate(),
                person.getCaregiverAddress(),
                person.getPatientList()
        );
    }


    public static Caregiver generateEntityFromDTO(CaregiverViewDTO personViewDTO){
        return new Caregiver(
                personViewDTO.getIdCaregiver(),
                personViewDTO.getCaregiverName(),
                personViewDTO.getCaregiverSurname(),
                personViewDTO.getCaregiverGender(),
                personViewDTO.getCaregiverBirthdate(),
                personViewDTO.getCaregiverAddress(),
                personViewDTO.getPatientList()

        );
    }




}
