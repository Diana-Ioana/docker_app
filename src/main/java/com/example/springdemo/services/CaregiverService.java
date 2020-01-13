package com.example.springdemo.services;

import com.example.springdemo.dto.CaregiverDTO;
import com.example.springdemo.dto.PatientDTO;
import com.example.springdemo.dto.builder.CaregiverBuilder;
import com.example.springdemo.dto.builder.builderViews.CaregiverViewBuilder;
import com.example.springdemo.dto.builder.builderViews.PatientViewBuilder;
import com.example.springdemo.dto.dtoVIEWS.CaregiverViewDTO;
import com.example.springdemo.dto.dtoVIEWS.PatientViewDTO;
import com.example.springdemo.entities.Caregiver;
import com.example.springdemo.entities.Patient;
import com.example.springdemo.errorhandler.ResourceNotFoundException;
import com.example.springdemo.repositories.CaregiverRepository;
import com.example.springdemo.repositories.PatientRepository;
import com.example.springdemo.validators.CaregiverFieldValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CaregiverService {

    CaregiverRepository caregiverRepository;
    PatientRepository patientRepository;
    @Autowired
    public CaregiverService(CaregiverRepository personRepository) {
        this.caregiverRepository = personRepository;
    }

    public List<Caregiver> getAllCaregivers(){return caregiverRepository.findAll();}
    public Caregiver create(Caregiver dc){return caregiverRepository.save(dc);}
    public void delete(Caregiver dc){ caregiverRepository.delete(dc);}

    public CaregiverViewDTO findCaregiverByIdCaregiver(Integer id){
        Optional<Caregiver> person  = caregiverRepository.findById(id);

        if (!person.isPresent()) {
            throw new ResourceNotFoundException("Caregiver", "user id", id);
        }
        return CaregiverViewBuilder.generateDTOFromEntity(person.get());
    }


    public List<CaregiverViewDTO> findAll(){
        List<Caregiver> persons = caregiverRepository.findAll();

        return persons.stream()
                .map(CaregiverViewBuilder::generateDTOFromEntity)
                .collect(Collectors.toList());
    }
    public List<PatientViewDTO> findAllPatientFroCaregiver(int care){

        List<Patient> persons = caregiverRepository.findPatientListByIdCaregiver(care);

        return persons.stream()
                .map(PatientViewBuilder::generateDTOFromEntity)
                .collect(Collectors.toList());
    }

    public Integer insert(CaregiverDTO personDTO) {

       // CaregiverFieldValidator.validateInsertOrUpdate(personDTO);
            return caregiverRepository
                    .save(CaregiverBuilder.generateEntityFromDTO(personDTO))
                    .getIdCaregiver();

    }

    public Integer update(CaregiverDTO personDTO) {

        Optional<Caregiver> person = caregiverRepository.findById(personDTO.getIdCaregiver());
        if(!person.isPresent()){
            throw new ResourceNotFoundException("Person", "user id", Integer.toString(personDTO.getIdCaregiver()));
        }
        CaregiverFieldValidator.validateInsertOrUpdate(personDTO);

        return caregiverRepository.save(CaregiverBuilder.generateEntityFromDTO(personDTO)).getIdCaregiver();
    }

    public void deleteUser(CaregiverViewDTO personViewDTO){
        this.caregiverRepository.deleteById(personViewDTO.getIdCaregiver());
    }



}
