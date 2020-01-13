package com.example.springdemo.dto.builder.builderViews;

import com.example.springdemo.dto.dtoVIEWS.UserViewDTO;
import com.example.springdemo.entities.User;

public class UserViewBuilder {
    public static UserViewDTO generateDTOFromEntity(User person){
        return new UserViewDTO(
                person.getIdUser(),
                person.getPatient(),
                person.getCaregiver(),
                person.getDoctor()
        );
    }

    public static User generateEntityFromDTO(UserViewDTO personViewDTO){
        return new User(
                personViewDTO.getIdUser(),
                personViewDTO.getPatient(),
                personViewDTO.getCaregiver(),
                personViewDTO.getDoctor()
        );
    }

}
