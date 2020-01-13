package com.example.springdemo.services;

import com.example.springdemo.dto.MedicationPlanDTO;
import com.example.springdemo.dto.builder.MedicationPlanBuilder;
import com.example.springdemo.dto.builder.builderViews.MedicationPlanViewBuilder;
import com.example.springdemo.dto.dtoVIEWS.MedicationPlanViewDTO;
import com.example.springdemo.entities.MedicationPlan;
import com.example.springdemo.errorhandler.ResourceNotFoundException;
import com.example.springdemo.repositories.MedicationPlanRepository;
import com.example.springdemo.validators.MedicationPlanFieldValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class MedicationPlanService {

    MedicationPlanRepository medicationPlanRepo;


    @Autowired
    public MedicationPlanService(MedicationPlanRepository personRepository) {
        this.medicationPlanRepo = personRepository;
    }

    public List<MedicationPlan> getAllMedicationPlans(){return medicationPlanRepo.findAll();}
    public MedicationPlan create(MedicationPlan dc){return medicationPlanRepo.save(dc);}
    public void delete(MedicationPlan dc){ medicationPlanRepo.delete(dc);}

    public MedicationPlanViewDTO findMedicationPlanByIdMedicationPlan(Integer id){
        Optional<MedicationPlan> person  = medicationPlanRepo.findById(id);

        if (!person.isPresent()) {
            throw new ResourceNotFoundException("Person", "user id", id);
        }
        return MedicationPlanViewBuilder.generateDTOFromEntity(person.get());
    }


    public List<MedicationPlanViewDTO> findAll(){
        List<MedicationPlan> persons = medicationPlanRepo.findAll();

        return persons.stream()
                .map(MedicationPlanViewBuilder::generateDTOFromEntity)
                .collect(Collectors.toList());
    }

    public Integer insert(MedicationPlanDTO personDTO) {

        MedicationPlanFieldValidator.validateInsertOrUpdate(personDTO);

        return medicationPlanRepo
                .save(MedicationPlanBuilder.generateEntityFromDTO(personDTO))
                .getIdMedicationPlan();
    }

    public Integer update(MedicationPlanDTO personDTO) {

        Optional<MedicationPlan> person = medicationPlanRepo.findById(personDTO.getIdMedicationPlan());
        if(!person.isPresent()){
            throw new ResourceNotFoundException("Person", "user id", Integer.toString(personDTO.getIdMedicationPlan()));
        }
        MedicationPlanFieldValidator.validateInsertOrUpdate(personDTO);

        return medicationPlanRepo.save(MedicationPlanBuilder.generateEntityFromDTO(personDTO)).getIdMedicationPlan();
    }

    public void deleteUser(MedicationPlanViewDTO personViewDTO){
        this.medicationPlanRepo.deleteById(personViewDTO.getIdMedicationPlan());
    }

}
