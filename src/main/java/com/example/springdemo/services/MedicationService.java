package com.example.springdemo.services;

import com.example.springdemo.dto.MedicationDTO;
import com.example.springdemo.dto.builder.MedicationBuilder;
import com.example.springdemo.dto.builder.builderViews.MedicationViewBuilder;
import com.example.springdemo.dto.dtoVIEWS.MedicationViewDTO;
import com.example.springdemo.entities.Medication;
import com.example.springdemo.errorhandler.ResourceNotFoundException;
import com.example.springdemo.repositories.MedicationRepository;
import com.example.springdemo.validators.MedicationFieldValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class MedicationService {

    MedicationRepository medicationRepo;

    @Autowired
    public MedicationService(MedicationRepository personRepository) {
        this.medicationRepo = personRepository;
    }

    public List<Medication> getAllMedications(){return medicationRepo.findAll();}
    public Medication create(Medication dc){return medicationRepo.save(dc);}
    public void delete(Medication dc){ medicationRepo.delete(dc);}

    public MedicationViewDTO findMedicationByIdMedication(Integer id){
        Optional<Medication> person  = medicationRepo.findById(id);

        if (!person.isPresent()) {
            throw new ResourceNotFoundException("Person", "user id", id);
        }
        return MedicationViewBuilder.generateDTOFromEntity(person.get());
    }


    public List<MedicationViewDTO> findAll(){
        List<Medication> persons = medicationRepo.findAll();

        return persons.stream()
                .map(MedicationViewBuilder::generateDTOFromEntity)
                .collect(Collectors.toList());
    }

    public Integer insert(MedicationDTO personDTO) {

        MedicationFieldValidator.validateInsertOrUpdate(personDTO);

        return medicationRepo
                .save(MedicationBuilder.generateEntityFromDTO(personDTO))
                .getIdmedication();
    }

    public Integer update(MedicationDTO personDTO) {

        Optional<Medication> person = medicationRepo.findById(personDTO.getIdmedication());
        if(!person.isPresent()){
            throw new ResourceNotFoundException("Person", "user id", Integer.toString(personDTO.getIdmedication()));
        }
        MedicationFieldValidator.validateInsertOrUpdate(personDTO);

        return medicationRepo.save(MedicationBuilder.generateEntityFromDTO(personDTO)).getIdmedication();
    }

    public void deleteUser(MedicationViewDTO personViewDTO){
        this.medicationRepo.deleteById(personViewDTO.getIdmedication());
    }





}
