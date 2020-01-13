package com.example.springdemo.repositories;

import com.example.springdemo.dto.PatientDTO;
import com.example.springdemo.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
    public List<Patient> findAll();
    public Patient findPatientByIdPatient(int id);
    //public List<Patient> findAllByCaregiver_idCaregiver(PatientDTO care);

}
