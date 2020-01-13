package com.example.springdemo.dto.dtoVIEWS;

public class DoctorViewDTO {
    private int idDoctor;
    private String doctorName;
    private String doctorSurname;
    private String doctorGender;
    private String doctorAddress;


    public DoctorViewDTO(String doctorName, String doctorSurname, String doctorGender, String doctorAddress) {
        this.doctorName = doctorName;
        this.doctorSurname = doctorSurname;
        this.doctorGender = doctorGender;
        this.doctorAddress = doctorAddress;
    }

    public DoctorViewDTO(int idDoctor, String doctorName, String doctorSurname, String doctorGender, String doctorAddress) {
        this.idDoctor = idDoctor;
        this.doctorName = doctorName;
        this.doctorSurname = doctorSurname;
        this.doctorGender = doctorGender;
        this.doctorAddress = doctorAddress;
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

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }
}
