package com.example.springdemo.dto.builder;

import com.example.springdemo.dto.CaregiverDTO;
import com.example.springdemo.dto.DoctorDTO;
import com.example.springdemo.entities.Caregiver;
import com.example.springdemo.entities.Doctor;
import com.example.springdemo.entities.Patient;

import java.util.Set;

public class CaregiverBuilder {
    public CaregiverBuilder() {}
    public static CaregiverDTO generateDTOFromEntity(Caregiver pat)
    {
        return new CaregiverDTO(pat.getIdCaregiver(),
                pat.getCaregiverName(),
                pat.getCaregiverSurname(),
                pat.getCaregiverGender(),
                pat.getCaregiverAddress(),
                pat.getCaregiverBirthdate(),
                pat.getCaregiverEmail(),
                pat.getCaregiverPassword(),
                pat.getPatientList());
    }
    public static Caregiver generateEntityFromDTO(CaregiverDTO pat)
    {
        return new Caregiver(pat.getIdCaregiver(),
                pat.getCaregiverName(),
                pat.getCaregiverSurname(),
                pat.getCaregiverGender(),
                pat.getCaregiverAddress(),
                pat.getCaregiverBirthdate(),
                pat.getCaregiverEmail(),
                pat.getCaregiverPassword(),
                 pat.getPatientList());
    }


}
