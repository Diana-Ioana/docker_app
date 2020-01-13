package com.example.springdemo.services;

import com.example.springdemo.dto.DoctorDTO;
import com.example.springdemo.dto.builder.DoctorBuilder;
import com.example.springdemo.dto.builder.builderViews.DoctorViewBuilder;
import com.example.springdemo.dto.dtoVIEWS.DoctorViewDTO;
import com.example.springdemo.entities.Doctor;
import com.example.springdemo.errorhandler.ResourceNotFoundException;
import com.example.springdemo.repositories.DoctorRepository;
import com.example.springdemo.validators.DoctorFieldValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DoctorService {

    DoctorRepository doctorRepo;

    @Autowired
    public DoctorService(DoctorRepository personRepository) {
        this.doctorRepo = personRepository;
    }

    public List<Doctor> getAllDoctors(){return doctorRepo.findAll();}
    public Doctor create(Doctor dc){return doctorRepo.save(dc);}
    public void delete(Doctor dc){ doctorRepo.delete(dc);}

    public DoctorViewDTO findDoctorByIdDoctor(Integer id){
        Optional<Doctor> person  = doctorRepo.findById(id);

        if (!person.isPresent()) {
            throw new ResourceNotFoundException("Person", "user id", id);
        }
        return DoctorViewBuilder.generateDTOFromEntity(person.get());
    }


    public List<DoctorViewDTO> findAll(){
        List<Doctor> persons = doctorRepo.findAll();

        return persons.stream()
                .map(DoctorViewBuilder::generateDTOFromEntity)
                .collect(Collectors.toList());
    }

    public Integer insert(DoctorDTO personDTO) {

        DoctorFieldValidator.validateInsertOrUpdate(personDTO);

        return doctorRepo
                .save(DoctorBuilder.generateEntityFromDTO(personDTO))
                .getIdDoctor();
    }

    public Integer update(DoctorDTO personDTO) {

        Optional<Doctor> person = doctorRepo.findById(personDTO.getIdDoctor());
        if(!person.isPresent()){
            throw new ResourceNotFoundException("Person", "user id", Integer.toString(personDTO.getIdDoctor()));
        }
        DoctorFieldValidator.validateInsertOrUpdate(personDTO);

        return doctorRepo.save(DoctorBuilder.generateEntityFromDTO(personDTO)).getIdDoctor();
    }

    public void deleteUser(DoctorViewDTO personViewDTO){
        this.doctorRepo.deleteById(personViewDTO.getIdDoctor());
    }



}
