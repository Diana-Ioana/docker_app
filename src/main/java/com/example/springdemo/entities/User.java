package com.example.springdemo.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name="User",schema="mydbps")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUser", unique=true ,nullable = false)
    private int idUser;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "patientEmail", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Patient patient;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "caregiverEmail", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Caregiver caregiver;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "doctorEmail", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Doctor doctor;

    public User(int idDisease, Patient patient, Caregiver caregiver, Doctor doctor) {
        this.idUser = idDisease;
        this.patient = patient;
        this.caregiver = caregiver;
        this.doctor = doctor;
    }

    public User() {
    }

    public int getIdUser() {
        return idUser;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Caregiver getCaregiver() {
        return caregiver;
    }

    public void setCaregiver(Caregiver caregiver) {
        this.caregiver = caregiver;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
