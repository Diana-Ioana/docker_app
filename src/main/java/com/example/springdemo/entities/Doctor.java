package com.example.springdemo.entities;
import javax.persistence.*;

@Entity
@Table(name="Doctor",schema="mydbps")
public class Doctor {
    /*
    * CREATE TABLE IF NOT EXISTS `ds`.`Doctor` (
  `idDoctor` INT NOT NULL AUTO_INCREMENT,
  `nameDoctor` VARCHAR(45) NULL,
  `surnameDoctor` VARCHAR(45) NULL,
  `genderDoctor` CHAR(3) NULL,
  `addressDoctor` VARCHAR(45) NULL,
  `emailDoctor` VARCHAR(45) NULL,
  `passwordDoctor` VARCHAR(45) NULL,
  PRIMARY KEY (`idDoctor`))
ENGINE = InnoDB;
         */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDoctor", unique=true ,nullable = false)
    private int idDoctor;

    @Column(name="doctorName")
    private String doctorName;

    @Column(name="doctorSurname")
    private String doctorSurname;

    @Column(name="doctorEmail")
    private String doctorEmail;

    @Column(name="doctorPassword")
    private String doctorPassword;

    @Column(name="doctorGender")
    private String doctorGender;

    @Column(name="doctorAddress")
    private String doctorAddress;


    public Doctor(int idDoctor, String doctorName, String doctorSurname, String doctorEmail, String doctorPassword) {
        this.idDoctor = idDoctor;
        this.doctorName = doctorName;
        this.doctorSurname = doctorSurname;
        this.doctorEmail = doctorEmail;
        this.doctorPassword = doctorPassword;
    }

    public Doctor(int idDoctor, String doctorName, String doctorSurname, String doctorEmail, String doctorPassword, String doctorGender, String doctorAddress) {
        this.idDoctor = idDoctor;
        this.doctorName = doctorName;
        this.doctorSurname = doctorSurname;
        this.doctorEmail = doctorEmail;
        this.doctorPassword = doctorPassword;
        this.doctorGender = doctorGender;
        this.doctorAddress = doctorAddress;
    }

    public Doctor() {}


    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorSurname() {
        return doctorSurname;
    }

    public void setDoctorSurname(String doctorSurname) {
        this.doctorSurname = doctorSurname;
    }

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail;
    }

    public String getDoctorPassword() {
        return doctorPassword;
    }

    public void setDoctorPassword(String doctorPassword) {
        this.doctorPassword = doctorPassword;
    }

    public String getDoctorGender() {
        return doctorGender;
    }

    public void setDoctorGender(String doctorGender) {
        this.doctorGender = doctorGender;
    }

    public String getDoctorAddress() {
        return doctorAddress;
    }

    public void setDoctorAddress(String doctorAddress) {
        this.doctorAddress = doctorAddress;
    }
}
