package com.example.springdemo.services;

import com.example.springdemo.dto.UserDTO;
import com.example.springdemo.dto.builder.UserBuilder;
import com.example.springdemo.dto.builder.builderViews.UserViewBuilder;
import com.example.springdemo.dto.dtoVIEWS.UserViewDTO;
import com.example.springdemo.entities.User;
import com.example.springdemo.errorhandler.ResourceNotFoundException;
import com.example.springdemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class UserService {

    UserRepository UserRepo;

    @Autowired
    public UserService(UserRepository personRepository) {
        this.UserRepo = personRepository;
    }

    public List<User> getAllUsers(){return UserRepo.findAll();}
    public User create(User dc){return UserRepo.save(dc);}
    public void delete(User dc){ UserRepo.delete(dc);}

    public UserViewDTO findUserByIdUser(Integer id){
        Optional<User> person  = UserRepo.findById(id);

        if (!person.isPresent()) {
            throw new ResourceNotFoundException("Person", "user id", id);
        }
        return UserViewBuilder.generateDTOFromEntity(person.get());
    }


    public List<UserViewDTO> findAll(){
        List<User> persons = UserRepo.findAll();

        return persons.stream()
                .map(UserViewBuilder::generateDTOFromEntity)
                .collect(Collectors.toList());
    }

    public Integer insert(UserDTO personDTO) {

        return UserRepo
                .save(UserBuilder.generateEntityFromDTO(personDTO))
                .getIdUser();
    }

    public Integer update(UserDTO personDTO) {

        Optional<User> person = UserRepo.findById(personDTO.getIdUser());
        if(!person.isPresent()){
            throw new ResourceNotFoundException("Person", "user id", Integer.toString(personDTO.getIdUser()));
        }
        return UserRepo.save(UserBuilder.generateEntityFromDTO(personDTO)).getIdUser();
    }

    public void deleteUser(UserViewDTO personViewDTO){
        this.UserRepo.deleteById(personViewDTO.getIdUser());
    }

}
