package com.example.springdemo.dto;

import com.example.springdemo.entities.Medication;
import com.example.springdemo.entities.Patient;

import java.sql.Date;
import java.util.Objects;
import java.util.Set;

public class MedicationPlanDTO {
    private int idMedicationPlan;
    private Date startDate;
    private Date endDate;
    Patient Patient_idPatient;
    Set<Medication> medicationsList;

    public MedicationPlanDTO(int idMedicationPlan, Date startDate, Date endDate, Patient patient_idPatient, Set<Medication> medicationsList) {
        this.idMedicationPlan = idMedicationPlan;
        this.startDate = startDate;
        this.endDate = endDate;
        Patient_idPatient = patient_idPatient;
        this.medicationsList = medicationsList;
    }

    public MedicationPlanDTO() {}

    public MedicationPlanDTO(int idMedicationPlan, Patient patient_idPatient, Set<Medication> medicationsList) {
        this.idMedicationPlan = idMedicationPlan;
        Patient_idPatient = patient_idPatient;
        this.medicationsList = medicationsList;
    }

    public int getIdMedicationPlan() {
        return idMedicationPlan;
    }

    public void setIdMedicationPlan(int idMedicationPlan) {
        this.idMedicationPlan = idMedicationPlan;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Patient getPatient_idPatient() {
        return Patient_idPatient;
    }

    public void setPatient_idPatient(Patient patient_idPatient) {
        Patient_idPatient = patient_idPatient;
    }

    public Set<Medication> getMedicationsList() {
        return medicationsList;
    }

    public void setMedicationsList(Set<Medication> medicationsList) {
        this.medicationsList = medicationsList;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicationPlanDTO medPlanDTO = (MedicationPlanDTO) o;
        return Objects.equals(idMedicationPlan, medPlanDTO.idMedicationPlan) &&
                Objects.equals(startDate, medPlanDTO.startDate) &&
                Objects.equals(endDate, medPlanDTO.endDate) &&
                Objects.equals(Patient_idPatient, medPlanDTO.Patient_idPatient) &&
                Objects.equals(medicationsList, medPlanDTO.medicationsList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idMedicationPlan, startDate, endDate, Patient_idPatient, medicationsList);
    }



}
