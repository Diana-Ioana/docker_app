package com.example.springdemo.dto.dtoVIEWS;

import com.example.springdemo.entities.Caregiver;

import java.sql.Date;

public class PatientViewDTO {
    private int idPatient;
    private String patientName;
    private String patientSurname;
    private String patientGender;
    private Date patientBirthdate;
    private String patientAddress;
    Caregiver Caregiver_idCaregiver;


    public PatientViewDTO(String patientName, String patientSurname, String patientGender, Date patientBirthdate, String patientAddress) {
        this.patientName = patientName;
        this.patientSurname = patientSurname;
        this.patientGender = patientGender;
        this.patientBirthdate = patientBirthdate;
        this.patientAddress = patientAddress;
    }


    public PatientViewDTO(int idPatient, String patientName, String patientSurname, String patientGender, Date patientBirthdate, String patientAddress, Caregiver caregiver_idCaregiver) {
        this.idPatient = idPatient;
        this.patientName = patientName;
        this.patientSurname = patientSurname;
        this.patientGender = patientGender;
        this.patientBirthdate = patientBirthdate;
        this.patientAddress = patientAddress;
        Caregiver_idCaregiver = caregiver_idCaregiver;
    }

    public PatientViewDTO(int idPatient, String patientName, String patientSurname, String patientGender, Date patientBirthdate, String patientAddress) {
        this.idPatient = idPatient;
        this.patientName = patientName;
        this.patientSurname = patientSurname;
        this.patientGender = patientGender;
        this.patientBirthdate = patientBirthdate;
        this.patientAddress = patientAddress;
    }

    public PatientViewDTO() {
    }

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

    public Caregiver getCaregiver_idCaregiver() {
        return Caregiver_idCaregiver;
    }

    public void setCaregiver_idCaregiver(Caregiver caregiver_idCaregiver) {
        Caregiver_idCaregiver = caregiver_idCaregiver;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }
}
