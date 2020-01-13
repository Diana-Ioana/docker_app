package com.example.springdemo.dto.dtoVIEWS;

import com.example.springdemo.entities.Caregiver;
import com.example.springdemo.entities.Doctor;
import com.example.springdemo.entities.Patient;

public class UserViewDTO {
    private int idUser;
    private Patient patient;
    private Caregiver caregiver;
    private Doctor doctor;

    public UserViewDTO(int idUser, Patient patient, Caregiver caregiver, Doctor doctor) {
        this.idUser = idUser;
        this.patient = patient;
        this.caregiver = caregiver;
        this.doctor = doctor;
    }

    public UserViewDTO() {
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
