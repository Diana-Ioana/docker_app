package com.example.springdemo.dto.dtoVIEWS;

import com.example.springdemo.entities.Medication;
import com.example.springdemo.entities.Patient;

import java.sql.Date;
import java.util.Set;

public class MedicationPlanViewDTO {
    private int idMedicationPlan;
    private Date startDate;
    private Date endDate;
    Patient Patient_idPatient;
    Set<Medication> medicationsList;

    public MedicationPlanViewDTO(Date startDate, Date endDate, Patient patient_idPatient, Set<Medication> medicationsList) {
        this.startDate = startDate;
        this.endDate = endDate;
        Patient_idPatient = patient_idPatient;
        this.medicationsList = medicationsList;
    }

    public MedicationPlanViewDTO(int idMedicationPlan, Date startDate, Date endDate, Patient patient_idPatient, Set<Medication> medicationsList) {
        this.idMedicationPlan = idMedicationPlan;
        this.startDate = startDate;
        this.endDate = endDate;
        Patient_idPatient = patient_idPatient;
        this.medicationsList = medicationsList;
    }

    public MedicationPlanViewDTO() {
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
}
