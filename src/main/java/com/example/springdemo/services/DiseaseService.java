package com.example.springdemo.services;

import com.example.springdemo.dto.DiseaseDTO;
import com.example.springdemo.dto.builder.DiseaseBuilder;
import com.example.springdemo.dto.builder.builderViews.DiseaseViewBuilder;
import com.example.springdemo.dto.dtoVIEWS.DiseaseViewDTO;
import com.example.springdemo.entities.Disease;
import com.example.springdemo.errorhandler.ResourceNotFoundException;
import com.example.springdemo.repositories.DiseaseRepository;
import com.example.springdemo.validators.DiseaseFieldValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class DiseaseService {

    DiseaseRepository DiseaseRepo;

    @Autowired
    public DiseaseService(DiseaseRepository personRepository) {
        this.DiseaseRepo = personRepository;
    }

    public List<Disease> getAllDiseases(){return DiseaseRepo.findAll();}
    public Disease create(Disease dc){return DiseaseRepo.save(dc);}
    public void delete(Disease dc){ DiseaseRepo.delete(dc);}

    public DiseaseViewDTO findDiseaseByIdDisease(Integer id){
        Optional<Disease> person  = DiseaseRepo.findById(id);

        if (!person.isPresent()) {
            throw new ResourceNotFoundException("Person", "user id", id);
        }
        return DiseaseViewBuilder.generateDTOFromEntity(person.get());
    }


    public List<DiseaseViewDTO> findAll(){
        List<Disease> persons = DiseaseRepo.findAll();

        return persons.stream()
                .map(DiseaseViewBuilder::generateDTOFromEntity)
                .collect(Collectors.toList());
    }

    public Integer insert(DiseaseDTO personDTO) {

        DiseaseFieldValidator.validateInsertOrUpdate(personDTO);

        return DiseaseRepo
                .save(DiseaseBuilder.generateEntityFromDTO(personDTO))
                .getIdDisease();
    }

    public Integer update(DiseaseDTO personDTO) {

        Optional<Disease> person = DiseaseRepo.findById(personDTO.getIdDisease());
        if(!person.isPresent()){
            throw new ResourceNotFoundException("Person", "user id", Integer.toString(personDTO.getIdDisease()));
        }
        DiseaseFieldValidator.validateInsertOrUpdate(personDTO);

        return DiseaseRepo.save(DiseaseBuilder.generateEntityFromDTO(personDTO)).getIdDisease();
    }

    public void deleteUser(DiseaseViewDTO personViewDTO){
        this.DiseaseRepo.deleteById(personViewDTO.getIdDisease());
    }

}
