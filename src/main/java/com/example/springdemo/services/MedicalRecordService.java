package com.example.springdemo.services;

import com.example.springdemo.dto.MedicalRecordDTO;
import com.example.springdemo.dto.builder.MedicalRecordBuilder;
import com.example.springdemo.dto.builder.builderViews.MedicalRecordViewBuilder;
import com.example.springdemo.dto.dtoVIEWS.MedicalRecordViewDTO;
import com.example.springdemo.entities.MedicalRecord;
import com.example.springdemo.errorhandler.ResourceNotFoundException;
import com.example.springdemo.repositories.MedicalRecordRepository;
import com.example.springdemo.validators.MedicalRecordFieldValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class MedicalRecordService {

    MedicalRecordRepository MedicalRecordRepo;

    @Autowired
    public MedicalRecordService(MedicalRecordRepository personRepository) {
        this.MedicalRecordRepo = personRepository;
    }

    public List<MedicalRecord> getAllMedicalRecords(){return MedicalRecordRepo.findAll();}
    public MedicalRecord create(MedicalRecord dc){return MedicalRecordRepo.save(dc);}
    public void delete(MedicalRecord dc){ MedicalRecordRepo.delete(dc);}

    public MedicalRecordViewDTO findMedicalRecordByIdMedicalRecord(Integer id){
        Optional<MedicalRecord> person  = MedicalRecordRepo.findById(id);

        if (!person.isPresent()) {
            throw new ResourceNotFoundException("Person", "user id", id);
        }
        return MedicalRecordViewBuilder.generateDTOFromEntity(person.get());
    }


    public List<MedicalRecordViewDTO> findAll(){
        List<MedicalRecord> persons = MedicalRecordRepo.findAll();

        return persons.stream()
                .map(MedicalRecordViewBuilder::generateDTOFromEntity)
                .collect(Collectors.toList());
    }

    public Integer insert(MedicalRecordDTO personDTO) {

        MedicalRecordFieldValidator.validateInsertOrUpdate(personDTO);

        return MedicalRecordRepo
                .save(MedicalRecordBuilder.generateEntityFromDTO(personDTO))
                .getIdMedicalRecord();
    }

    public Integer update(MedicalRecordDTO personDTO) {

        Optional<MedicalRecord> person = MedicalRecordRepo.findById(personDTO.getIdMedicalRecord());
        if(!person.isPresent()){
            throw new ResourceNotFoundException("Person", "user id", Integer.toString(personDTO.getIdMedicalRecord()));
        }
        MedicalRecordFieldValidator.validateInsertOrUpdate(personDTO);

        return MedicalRecordRepo.save(MedicalRecordBuilder.generateEntityFromDTO(personDTO)).getIdMedicalRecord();
    }

    public void deleteUser(MedicalRecordViewDTO personViewDTO){
        this.MedicalRecordRepo.deleteById(personViewDTO.getIdMedicalRecord());
    }


}


