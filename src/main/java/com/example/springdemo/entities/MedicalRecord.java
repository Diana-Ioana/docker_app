package com.example.springdemo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="MedicalRecord",schema="mydbps")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMedicalRecord", unique=true ,nullable = false)
    private int idMedicalRecord;

    @JsonIgnore
    @OneToMany(mappedBy = "MedicalRecord_idMedicalRecord",cascade = CascadeType.ALL,fetch= FetchType.LAZY)
    private Set<Disease>MedicalRecord_idMedicalRecord;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "Patient_idPatient", referencedColumnName = "idPatient")
//    private Patient patient;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idPatient", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Patient patient;


    public MedicalRecord(int idMedicalRecord, Set<Disease> diseases, Patient patient) {
        this.idMedicalRecord = idMedicalRecord;
        this.MedicalRecord_idMedicalRecord = diseases;
        this.patient = patient;
    }

    public MedicalRecord() {
    }

    public Set<Disease> getMedicalRecord_idMedicalRecord() {
        return MedicalRecord_idMedicalRecord;
    }

    public void setMedicalRecord_idMedicalRecord(Set<Disease> medicalRecord_idMedicalRecord) {
        MedicalRecord_idMedicalRecord = medicalRecord_idMedicalRecord;
    }

    public int getIdMedicalRecord() {
        return idMedicalRecord;
    }

    public void setIdMedicalRecord(int idMedicalRecord) {
        this.idMedicalRecord = idMedicalRecord;
    }

    public Set<Disease> getDiseases() {
        return MedicalRecord_idMedicalRecord;
    }

    public void setDiseases(Set<Disease> diseases) {
        this.MedicalRecord_idMedicalRecord = diseases;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
