package com.example.springdemo.repositories;

import com.example.springdemo.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaregiverRepository extends JpaRepository<Caregiver, Integer> {
    public List<Caregiver> findAll();
    public  Caregiver findCaregiverByIdCaregiver(int idCaregiver);
    public List<Patient>findPatientListByIdCaregiver(int idCaregiver);
}
