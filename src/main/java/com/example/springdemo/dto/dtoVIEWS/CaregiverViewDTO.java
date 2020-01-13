package com.example.springdemo.dto.dtoVIEWS;

import com.example.springdemo.entities.Patient;

import java.util.Set;

public class CaregiverViewDTO {
    private int idCaregiver;
    private String caregiverName;
    private String caregiverSurname;
    private String caregiverGender;
    private String caregiverAddress;
    private String caregiverBirthdate;
    private Set<Patient> patientList;



    public CaregiverViewDTO(int idCaregiver, String caregiverName, String caregiverSurname, String caregiverGender, String caregiverAddress, String caregiverBirthdate, Set<Patient> patientList) {
        this.idCaregiver = idCaregiver;
        this.caregiverName = caregiverName;
        this.caregiverSurname = caregiverSurname;
        this.caregiverGender = caregiverGender;
        this.caregiverAddress = caregiverAddress;
        this.caregiverBirthdate = caregiverBirthdate;
        this.patientList = patientList;
    }

    public Set<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(Set<Patient> patientList) {
        this.patientList = patientList;
    }

    public CaregiverViewDTO(String caregiverName, String caregiverSurname, String caregiverGender, String caregiverAddress, String caregiverBirthdate) {
        this.caregiverName = caregiverName;
        this.caregiverSurname = caregiverSurname;
        this.caregiverGender = caregiverGender;
        this.caregiverAddress = caregiverAddress;
        this.caregiverBirthdate = caregiverBirthdate;
    }

    public CaregiverViewDTO() {
    }

    public int getIdCaregiver() {
        return idCaregiver;
    }

    public void setIdCaregiver(int idCaregiver) {
        this.idCaregiver = idCaregiver;
    }

    public CaregiverViewDTO(int idCaregiver, String caregiverName, String caregiverSurname, String caregiverGender, String caregiverAddress, String caregiverBirthdate) {
        this.idCaregiver = idCaregiver;
        this.caregiverName = caregiverName;
        this.caregiverSurname = caregiverSurname;
        this.caregiverGender = caregiverGender;
        this.caregiverAddress = caregiverAddress;
        this.caregiverBirthdate = caregiverBirthdate;
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
}
