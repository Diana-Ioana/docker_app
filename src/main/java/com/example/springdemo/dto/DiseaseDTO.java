package com.example.springdemo.dto;

import com.example.springdemo.entities.MedicalRecord;

import java.util.Date;

public class DiseaseDTO {
    private int idDisease;
    private String diseaseName;
    private Date diseaseDiagnosticDate;
    private String diseaseSimptoms;
    private MedicalRecord MedicalRecord_idMedicalRecord;

    public DiseaseDTO() {}

    public DiseaseDTO(int idDisease, String diseaseName, Date diseaseDiagnosticDate, String diseaseSimptoms, MedicalRecord medicalRecord_idMedicalRecord) {
        this.idDisease = idDisease;
        this.diseaseName = diseaseName;
        this.diseaseDiagnosticDate = diseaseDiagnosticDate;
        this.diseaseSimptoms = diseaseSimptoms;
        MedicalRecord_idMedicalRecord = medicalRecord_idMedicalRecord;
    }

    public int getIdDisease() {
        return idDisease;
    }

    public void setIdDisease(int idDisease) {
        this.idDisease = idDisease;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public Date getDiseaseDiagnosticDate() {
        return diseaseDiagnosticDate;
    }

    public void setDiseaseDiagnosticDate(Date diseaseDiagnosticDate) {
        this.diseaseDiagnosticDate = diseaseDiagnosticDate;
    }

    public String getDiseaseSimptoms() {
        return diseaseSimptoms;
    }

    public void setDiseaseSimptoms(String diseaseSimptoms) {
        this.diseaseSimptoms = diseaseSimptoms;
    }

    public MedicalRecord getMedicalRecord_idMedicalRecord() {
        return MedicalRecord_idMedicalRecord;
    }

    public void setMedicalRecord_idMedicalRecord(MedicalRecord medicalRecord_idMedicalRecord) {
        MedicalRecord_idMedicalRecord = medicalRecord_idMedicalRecord;
    }
}
