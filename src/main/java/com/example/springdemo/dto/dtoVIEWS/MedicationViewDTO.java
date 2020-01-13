package com.example.springdemo.dto.dtoVIEWS;

import com.example.springdemo.entities.MedicationPlan;

public class MedicationViewDTO {
    private int idmedication;
    private String medicationName;
    private String dosage;
    private String sideEffects;
    private int intakeIntervals;
    private MedicationPlan Medication_idMedication;


    public MedicationViewDTO(int idmedication, String medicationName, String dosage, String sideEffects, int intakeIntervals) {
        this.idmedication = idmedication;
        this.medicationName = medicationName;
        this.dosage = dosage;
        this.sideEffects = sideEffects;
        this.intakeIntervals = intakeIntervals;
    }

    public MedicationViewDTO(int idmedication, String medicationName, String dosage, String sideEffects, int intakeIntervals, MedicationPlan medication_idMedication) {
        this.idmedication = idmedication;
        this.medicationName = medicationName;
        this.dosage = dosage;
        this.sideEffects = sideEffects;
        this.intakeIntervals = intakeIntervals;
        Medication_idMedication = medication_idMedication;
    }

    public MedicationViewDTO(String medicationName, String dosage, String sideEffects, int intakeIntervals) {
        this.medicationName = medicationName;
        this.dosage = dosage;
        this.sideEffects = sideEffects;
        this.intakeIntervals = intakeIntervals;
    }

    public MedicationViewDTO() {
    }

    public MedicationPlan getMedication_idMedication() {
        return Medication_idMedication;
    }

    public void setMedication_idMedication(MedicationPlan medication_idMedication) {
        Medication_idMedication = medication_idMedication;
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
}
