package com.example.springdemo.dto.builder;

import com.example.springdemo.dto.UserDTO;
import com.example.springdemo.dto.dtoVIEWS.UserViewDTO;
import com.example.springdemo.entities.User;

public class UserBuilder {
    public static UserViewDTO generateDTOFromEntity(User person){
        return new UserViewDTO(
                person.getIdUser(),
                person.getPatient(),
                person.getCaregiver(),
                person.getDoctor()
        );
    }

    public static User generateEntityFromDTO(UserDTO personViewDTO){
        return new User(
                personViewDTO.getIdUser(),
                personViewDTO.getPatient(),
                personViewDTO.getCaregiver(),
                personViewDTO.getDoctor()
        );
    }


}
