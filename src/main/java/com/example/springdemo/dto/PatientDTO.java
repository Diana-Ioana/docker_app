package com.example.springdemo.dto;

import com.example.springdemo.entities.Caregiver;

import java.sql.Date;

public class PatientDTO {
    private int idPatient;
    private String patientName;
    private String patientSurname;
    private String patientGender;
    private Date patientBirthdate;
    private String patientAddress;
    private String patientEmail;
    private String patientPassword;
    Caregiver Caregiver_idCaregiver;



    public PatientDTO(int idPatient, Caregiver caregiver_idCaregiver) {
        this.idPatient = idPatient;
        Caregiver_idCaregiver = caregiver_idCaregiver;


    }


    public PatientDTO(int idPatient, String patientName, String patientSurname, String patientGender, Date patientBirthdate, String patientAddress, String patientEmail, String patientPassword, Caregiver caregiver_idCaregiver) {
        this.idPatient = idPatient;
        this.patientName = patientName;
        this.patientSurname = patientSurname;
        this.patientGender = patientGender;
        this.patientBirthdate = patientBirthdate;
        this.patientAddress = patientAddress;
        this.patientEmail = patientEmail;
        this.patientPassword = patientPassword;
        this.Caregiver_idCaregiver = caregiver_idCaregiver;
    }



    public Caregiver getCaregiver_idCaregiver() {
        return Caregiver_idCaregiver;
    }

    public void setCaregiver_idCaregiver(Caregiver caregiver_idCaregiver) {
        Caregiver_idCaregiver = caregiver_idCaregiver;
    }

    public PatientDTO() {}

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientSurname() {
        return patientSurname;
    }

    public void setPatientSurname(String patientSurname) {
        this.patientSurname = patientSurname;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public Date getPatientBirthdate() {
        return patientBirthdate;
    }

    public void setPatientBirthdate(Date patientBirthdate) {
        this.patientBirthdate = patientBirthdate;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public String getPatientPassword() {
        return patientPassword;
    }

    public void setPatientPassword(String patientPassword) {
        this.patientPassword = patientPassword;
    }

}
