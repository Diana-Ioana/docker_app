package com.example.springdemo.repositories;

import com.example.springdemo.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicationPlanRepository extends JpaRepository<MedicationPlan, Integer> {
    public List<MedicationPlan> findAll();
    public MedicationPlan findMedicationPlanByIdMedicationPlan(int id);

}
