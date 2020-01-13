package com.example.springdemo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Patient", schema = "mydbps")
public class Patient {
    /*
    `idPatient` INT NOT NULL AUTO_INCREMENT,
  `namePatient` VARCHAR(45) NULL,
  `surnamePatient` VARCHAR(45) NULL,
  `genderPatient` CHAR(3) NULL,
  `birthdatePatient` DATETIME(5) NULL,
  `addressPatient` VARCHAR(45) NULL,
  `Caregiver_idCaregiver` INT NOT NULL,
  `emailPatient` VARCHAR(45) NULL,
  `passwordPatient` VARCHAR(45) NULL,
   */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPatient", unique = true, nullable = false)
    private int idPatient;

    @Column(name = "patientName")
    private String patientName;

    @Column(name = "patientSurname")
    private String patientSurname;

    @Column(name = "patientGender")
    private String patientGender;

    @Column(name = "patientBirthdate")
    private Date patientBirthdate;

    @Column(name = "patientAddress")
    private String patientAddress;

    @Column(name = "patientEmail")
    private String patientEmail;

    @Column(name = "patientPassword")
    private String patientPassword;


    @ManyToOne
    @JoinColumn(name = "Caregiver_idCaregiver")
    Caregiver Caregiver_idCaregiver;

   /* @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "MedicalRecord_idMedicalRecord", referencedColumnName = "idMedicalRecord")
    private MedicalRecord medicalRecord;
*/

//
//     @OneToOne(mappedBy = "Patient",fetch = FetchType.EAGER)
//    private MedicationPlan medicationPlan;

    public Patient(int idPatient, Caregiver caregiver_idCaregiver) {
        this.idPatient = idPatient;
        Caregiver_idCaregiver = caregiver_idCaregiver;
    }


    public Patient(int idPatient, String patientName, String patientSurname, String patientGender, Date patientBirthdate, String patientAddress, String patientEmail, String patientPassword, Caregiver caregiver_idCaregiver) {
        this.idPatient = idPatient;
        this.patientName = patientName;
        this.patientSurname = patientSurname;
        this.patientGender = patientGender;
        this.patientBirthdate = patientBirthdate;
        this.patientAddress = patientAddress;
        this.patientEmail = patientEmail;
        this.patientPassword = patientPassword;
        Caregiver_idCaregiver = caregiver_idCaregiver;
    }


    public Patient(int idPatient, String patientName, String patientSurname, String patientGender, Date patientBirthdate, String patientAddress, Caregiver caregiver_idCaregiver) {
        this.idPatient = idPatient;
        this.patientName = patientName;
        this.patientSurname = patientSurname;
        this.patientGender = patientGender;
        this.patientBirthdate = patientBirthdate;
        this.patientAddress = patientAddress;
        Caregiver_idCaregiver = caregiver_idCaregiver;
    }

    public Patient(int idPatient, String patientName, String patientSurname, String patientGender, Date patientBirthdate, String patientAddress) {
        this.idPatient = idPatient;
        this.patientName = patientName;
        this.patientSurname = patientSurname;
        this.patientGender = patientGender;
        this.patientBirthdate = patientBirthdate;
        this.patientAddress = patientAddress;
    }

    public Patient() {
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

    public Caregiver getCaregiver_idCaregiver() {
        return Caregiver_idCaregiver;
    }

    public void setCaregiver_idCaregiver(Caregiver caregiver_idCaregiver) {
        Caregiver_idCaregiver = caregiver_idCaregiver;
    }
}
