
package com.mycompany.cwskinconsultation;
import javax.print.Doc;
import java.io.Serializable;
import java.util.ArrayList;

public class Doctor extends Person {
     static ArrayList<Doctor> doctors = new ArrayList<>();

     static ArrayList<Doctor> temporyDoctors = new ArrayList<>();
    
    private int medicalLicenceNumber;
    private String specialisation;

    public Doctor(int medicalLicenceNumber, String specialisation,
            String name, String surName, String dateOfBirth, int mobileNumber) {
        
        //calling the parent's constructor
        super(name, surName, dateOfBirth, mobileNumber);
        this.medicalLicenceNumber = medicalLicenceNumber;
        this.specialisation = specialisation;
    }
    
    //getters

    public int getMedicalLicenceNumber() {
        return medicalLicenceNumber;
    }

    public String getSpecialisation() {
        return specialisation;
    }
    
    //setters

    public void setMedicalLicenceNumber(int medicalLicenceNumber) {
        this.medicalLicenceNumber = medicalLicenceNumber;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }
    
    
    
}

