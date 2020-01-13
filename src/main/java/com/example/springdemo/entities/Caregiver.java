package com.example.springdemo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="Caregiver",schema="mydbps")
public class Caregiver {
    /**
     *`idCaregiver` INT NOT NULL AUTO_INCREMENT,
     *   `nameCaregiver` VARCHAR(45) NULL,
     *   `surnameCaregiver` VARCHAR(45) NULL,
     *   `genderCaregver` CHAR(3) NULL,
     *   `addressCaregiver` VARCHAR(45) NULL,
     *   `birthdateCaregiver` DATETIME(5) NULL,
     *   `emailCaregiver` VARCHAR(45) NULL,
     *   `passwordCaregiver` VARCHAR(45) NULL,
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCaregiver", unique=true, nullable = false)
    private int idCaregiver;

    @Column(name="caregiverName")
    private String caregiverName;

    @Column(name="caregiverSurname")
    private String caregiverSurname;

    @Column(name="caregiverGender")
    private String caregiverGender;

    @Column(name="caregiverAddress")
    private String caregiverAddress;

    @Column(name="caregiverBirthdate")
    private String caregiverBirthdate;

    @Column(name="caregiverEmail")
    private String caregiverEmail;

    @Column(name="caregiverPassword")
    private String caregiverPassword;

    @JsonIgnore
    @OneToMany(mappedBy = "Caregiver_idCaregiver", cascade = CascadeType.ALL,fetch= FetchType.LAZY)
    private Set<Patient> patientList;

    public Caregiver(int idCaregiver, Set<Patient> patientList) {
        this.idCaregiver = idCaregiver;
        this.patientList = patientList;
    }

    public Caregiver(int idCaregiver, String caregiverName, String caregiverSurname, String caregiverGender, String caregiverAddress, String caregiverBirthdate, Set<Patient> patientList) {
        this.idCaregiver = idCaregiver;
        this.caregiverName = caregiverName;
        this.caregiverSurname = caregiverSurname;
        this.caregiverGender = caregiverGender;
        this.caregiverAddress = caregiverAddress;
        this.caregiverBirthdate = caregiverBirthdate;
        this.patientList = patientList;
    }

    public Caregiver(int idCaregiver, String caregiverName, String caregiverSurname, String caregiverGender, String caregiverAddress, String caregiverBirthdate, String caregiverEmail, String caregiverPassword, Set<Patient> patientList) {
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

    public Caregiver() {}

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
