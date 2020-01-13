package com.example.springdemo.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Disease",schema="mydbps")
public class Disease {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDisease", unique=true ,nullable = false)
    private int idDisease;

    @Column(name="diseaseName")
    private String diseaseName;

    @Column(name="diseaseDiagnosticDate")
    private Date diseaseDiagnosticDate;

    @Column(name="diseaseSimptoms")
    private String diseaseSimptoms;

    @ManyToOne
    @JoinColumn(name="MedicalRecord_idMedicalRecord")
    private MedicalRecord MedicalRecord_idMedicalRecord;

    public Disease() {
    }

    public Disease(int idDisease, String diseaseName, Date diseaseDiagnosticDate, String diseaseSimptoms, MedicalRecord medicalRecord) {
        this.idDisease = idDisease;
        this.diseaseName = diseaseName;
        this.diseaseDiagnosticDate = diseaseDiagnosticDate;
        this.diseaseSimptoms = diseaseSimptoms;
        this.MedicalRecord_idMedicalRecord = medicalRecord;
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

    public void setMedicalRecord_idMedicalRecord(MedicalRecord medicalRecord) {
        this.MedicalRecord_idMedicalRecord = medicalRecord;
    }
}
