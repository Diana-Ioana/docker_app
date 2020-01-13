package com.example.springdemo.dto;

import com.example.springdemo.entities.MedicationPlan;

import java.util.Objects;

public class MedicationDTO {
    private int idmedication;
    private String medicationName;
    private String dosage;
    private String sideEffects;
    private int intakeIntervals;
    MedicationPlan Medication_idMedication;

    public MedicationDTO(int idmedication, String medicationName, String dosage, String sideEffects, int intakeIntervals, MedicationPlan medication_idMedication) {
        this.idmedication = idmedication;
        this.medicationName = medicationName;
        this.dosage = dosage;
        this.sideEffects = sideEffects;
        this.intakeIntervals = intakeIntervals;
        Medication_idMedication = medication_idMedication;
    }

    public MedicationDTO() {
    }

    public int getIdmedication() {
        return idmedication;
    }

    public void setIdmedication(int idmedication) {
        this.idmedication = idmedication;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }

    public int getIntakeIntervals() {
        return intakeIntervals;
    }

    public void setIntakeIntervals(int intakeIntervals) {
        this.intakeIntervals = intakeIntervals;
    }

    public MedicationPlan getMedication_idMedication() {
        return Medication_idMedication;
    }

    public void setMedication_idMedication(MedicationPlan medication_idMedication) {
        Medication_idMedication = medication_idMedication;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
       MedicationDTO medDTO = (MedicationDTO) o;
        return Objects.equals(idmedication, medDTO.idmedication) &&
                Objects.equals(medicationName, medDTO.medicationName) &&
                Objects.equals(dosage, medDTO.dosage) &&
                Objects.equals(sideEffects, medDTO.sideEffects) &&
                Objects.equals(intakeIntervals, medDTO.intakeIntervals) &&
                Objects.equals(Medication_idMedication, medDTO.Medication_idMedication) ;
    }

    @Override
    public int hashCode() {

        return Objects.hash(idmedication, medicationName, dosage, sideEffects, intakeIntervals,Medication_idMedication);
    }


}
