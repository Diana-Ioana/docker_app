package com.example.springdemo.dto;

import com.example.springdemo.entities.Disease;
import com.example.springdemo.entities.Patient;

import java.util.Set;

public class MedicalRecordDTO {
    private int idMedicalRecord;
    private Set<Disease> MedicalRecord_idMedicalRecord;
    private Patient patient;

    public MedicalRecordDTO() {}

    public MedicalRecordDTO(int idMedicalRecord, Set<Disease> medicalRecord_idMedicalRecord, Patient patient) {
        this.idMedicalRecord = idMedicalRecord;
        MedicalRecord_idMedicalRecord = medicalRecord_idMedicalRecord;
        this.patient = patient;
    }

    public int getIdMedicalRecord() {
        return idMedicalRecord;
    }

    public void setIdMedicalRecord(int idMedicalRecord) {
        this.idMedicalRecord = idMedicalRecord;
    }

    public Set<Disease> getMedicalRecord_idMedicalRecord() {
        return MedicalRecord_idMedicalRecord;
    }

    public void setMedicalRecord_idMedicalRecord(Set<Disease> medicalRecord_idMedicalRecord) {
        MedicalRecord_idMedicalRecord = medicalRecord_idMedicalRecord;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }


}
