package com.example.springdemo.services;

import com.example.springdemo.dto.PatientDTO;
import com.example.springdemo.dto.builder.PatientBuilder;
import com.example.springdemo.dto.builder.builderViews.CaregiverViewBuilder;
import com.example.springdemo.dto.builder.builderViews.PatientViewBuilder;
import com.example.springdemo.dto.dtoVIEWS.CaregiverViewDTO;
import com.example.springdemo.dto.dtoVIEWS.PatientViewDTO;
import com.example.springdemo.entities.Caregiver;
import com.example.springdemo.entities.Patient;
import com.example.springdemo.errorhandler.ResourceNotFoundException;
import com.example.springdemo.repositories.CaregiverRepository;
import com.example.springdemo.repositories.DoctorRepository;
import com.example.springdemo.repositories.PatientRepository;
import com.example.springdemo.validators.PatientFieldValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class PatientService {

    PatientRepository patientRepository;
    CaregiverRepository caregiverRepository;

    @Autowired
    public PatientService(PatientRepository personRepository) {
        this.patientRepository = personRepository;
    }

    public List<Patient> getAllPatients(){return patientRepository.findAll();}
    public Patient create(Patient dc){return patientRepository.save(dc);}
    public void delete(Patient dc){ patientRepository.delete(dc);}

    public PatientViewDTO findPatientByIdPatient(Integer id){
        Optional<Patient> person  = patientRepository.findById(id);

        if (!person.isPresent()) {
            throw new ResourceNotFoundException("Patient", "user id", id);
        }
        return PatientViewBuilder.generateDTOFromEntity(person.get());
    }


    public List<PatientViewDTO> findAll(){
        List<Patient> persons = patientRepository.findAll();

        return persons.stream()
                .map(PatientViewBuilder::generateDTOFromEntity)
                .collect(Collectors.toList());
    }

//    public List<PatientViewDTO> findAllPatientFroCaregiver(PatientDTO person){
//        List<Patient> persons = patientRepository.findAllByCaregiver_idCaregiver(person.getCaregiver_idCaregiver());
//
//        return persons.stream()
//                .map(PatientViewBuilder::generateDTOFromEntity)
//                .collect(Collectors.toList());
//    }

    public Integer insert(PatientDTO personDTO) {

        PatientFieldValidator.validateInsertOrUpdate(personDTO);
            return patientRepository
                    .save(PatientBuilder.generateEntityFromDTO(personDTO))
                    .getIdPatient();

    }



    public Integer update(PatientDTO personDTO) {

        Optional<Patient> person = patientRepository.findById(personDTO.getIdPatient());
        if(!person.isPresent()){
            throw new ResourceNotFoundException("Person", "user id", Integer.toString(personDTO.getIdPatient()));
        }
        PatientFieldValidator.validateInsertOrUpdate(personDTO);

        return patientRepository.save(PatientBuilder.generateEntityFromDTO(personDTO)).getIdPatient();
    }

    public void deleteUser(PatientViewDTO personViewDTO){
        this.patientRepository.deleteById(personViewDTO.getIdPatient());
    }

}
