package com.example.springdemo.entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;
@Entity
@Table(name = "MedicationPlan", schema = "mydbps")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class MedicationPlan {
    /*One to Many mapping
     * idMedications
     * idPatient
     * Date of begining
     * Date of ending
     * IdMedPlan
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMedicationPlan", unique = true, nullable = false)
    private int idMedicationPlan;

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "endDate")
    private Date endDate;

    //    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "Patient_idPatient", referencedColumnName = "idPatient")
//    private Patient patient;
    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idPatient", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Patient patient;


    @JsonIgnore
    @OneToMany(mappedBy = "Medication_idMedication", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Set<Medication> medicationsList;

    public MedicationPlan(int idMedicationPlan, Date startDate, Date endDate, Patient patient, Set<Medication> medicationsList) {
        this.idMedicationPlan = idMedicationPlan;
        this.startDate = startDate;
        this.endDate = endDate;
        this.patient = patient;
        this.medicationsList = medicationsList;
    }

    public MedicationPlan() {
    }

    public int getIdMedicationPlan() {
        return idMedicationPlan;
    }

    public void setIdMedicationPlan(int idMedicationPlan) {
        this.idMedicationPlan = idMedicationPlan;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Patient getPatient_idPatient() {
        return patient;
    }

    public void setPatient_idPatient(Patient patient_idPatient) {
        patient = patient_idPatient;
    }

    public Set<Medication> getMedicationsList() {
        return medicationsList;
    }

    public void setMedicationsList(Set<Medication> medicationsList) {
        this.medicationsList = medicationsList;
    }
}
