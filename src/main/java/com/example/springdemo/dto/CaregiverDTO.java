package com.example.springdemo.dto;

import com.example.springdemo.entities.Patient;

import java.util.Set;

public class CaregiverDTO {
    private int idCaregiver;
    private String caregiverName;
    private String caregiverSurname;
    private String caregiverGender;
    private String caregiverAddress;
    private String caregiverBirthdate;
    private String caregiverEmail;
    private String caregiverPassword;
    private Set<Patient> patientList;

    public CaregiverDTO(int idCaregiver, String caregiverName, String caregiverEmail, String caregiverPassword) {
        this.idCaregiver = idCaregiver;
        this.caregiverName = caregiverName;
        this.caregiverEmail = caregiverEmail;
        this.caregiverPassword = caregiverPassword;
    }


    public CaregiverDTO(int idCaregiver, String caregiverName, String caregiverSurname, String caregiverGender, String caregiverAddress, String caregiverBirthdate, String caregiverEmail, String caregiverPassword, Set<Patient> patientList) {
        this.idCaregiver = idCaregiver;
        this.caregiverName = caregiverName;
        this.caregiverSurname = caregiverSurname;
        this.caregiverGender = caregiverGender;
        this.caregiverAddress = caregiverAddress;
        this.caregiverBirthdate = caregiverBirthdate;
        this.caregiverEmail = caregiverEmail;
        this.caregiverPassword = caregiverPassword;
        this.patientList = patientList;
    }

    public CaregiverDTO() {}

    public int getIdCaregiver() {
        return idCaregiver;
    }

    public void setIdCaregiver(int idCaregiver) {
        this.idCaregiver = idCaregiver;
    }

    public String getCaregiverName() {
        return caregiverName;
    }

    public void setCaregiverName(String caregiverName) {
        this.caregiverName = caregiverName;
    }

    public String getCaregiverSurname() {
        return caregiverSurname;
    }

    public void setCaregiverSurname(String caregiverSurname) {
        this.caregiverSurname = caregiverSurname;
    }

    public String getCaregiverGender() {
        return caregiverGender;
    }

    public void setCaregiverGender(String caregiverGender) {
        this.caregiverGender = caregiverGender;
    }

    public String getCaregiverAddress() {
        return caregiverAddress;
    }

    public void setCaregiverAddress(String caregiverAddress) {
        this.caregiverAddress = caregiverAddress;
    }

    public String getCaregiverBirthdate() {
        return caregiverBirthdate;
    }

    public void setCaregiverBirthdate(String caregiverBirthdate) {
        this.caregiverBirthdate = caregiverBirthdate;
    }

    public String getCaregiverEmail() {
        return caregiverEmail;
    }

    public void setCaregiverEmail(String caregiverEmail) {
        this.caregiverEmail = caregiverEmail;
    }

    public String getCaregiverPassword() {
        return caregiverPassword;
    }

    public void setCaregiverPassword(String caregiverPassword) {
        this.caregiverPassword = caregiverPassword;
    }

    public Set<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(Set<Patient> patientList) {
        this.patientList = patientList;
    }
}
