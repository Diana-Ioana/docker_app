package com.example.springdemo.dto;

import java.util.Objects;

public class DoctorDTO {
    private int idDoctor;
    private String doctorName;
    private String doctorSurname;
    private String doctorEmail;
    private String doctorPassword;
    private String doctorGender;
    private String doctorAddress;

    public DoctorDTO(int idDoctor, String doctorName, String doctorSurname, String doctorEmail, String doctorPassword, String doctorGender, String doctorAddress) {
        this.idDoctor = idDoctor;
        this.doctorName = doctorName;
        this.doctorSurname = doctorSurname;
        this.doctorEmail = doctorEmail;
        this.doctorPassword = doctorPassword;
        this.doctorGender = doctorGender;
        this.doctorAddress = doctorAddress;
    }

    public DoctorDTO(int idDoctor, String doctorName, String doctorEmail, String doctorPassword) {
        this.idDoctor = idDoctor;
        this.doctorName = doctorName;
        this.doctorEmail = doctorEmail;
        this.doctorPassword = doctorPassword;
    }



    public DoctorDTO() {}

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoctorDTO personDTO = (DoctorDTO) o;
        return Objects.equals(idDoctor, personDTO.idDoctor) &&
                Objects.equals(doctorName, personDTO.doctorName) &&
                Objects.equals(doctorSurname, personDTO.doctorSurname) &&
                Objects.equals(doctorEmail, personDTO.doctorEmail) &&
                Objects.equals(doctorGender, personDTO.doctorGender) &&
                Objects.equals(doctorAddress, personDTO.doctorAddress) &&
                Objects.equals(doctorPassword, personDTO.doctorPassword);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idDoctor, doctorName, doctorSurname, doctorEmail, doctorPassword,doctorGender, doctorAddress);
    }

    @Override
    public String toString() {
        return "DoctorDTO{" +
                "idDoctor=" + idDoctor +
                ", doctorName='" + doctorName + '\'' +
                ", doctorSurname='" + doctorSurname + '\'' +
                ", doctorEmail='" + doctorEmail + '\'' +
                ", doctorPassword='" + doctorPassword + '\'' +
                ", doctorGender='" + doctorGender + '\'' +
                ", doctorAddress='" + doctorAddress + '\'' +
                '}';
    }
}
