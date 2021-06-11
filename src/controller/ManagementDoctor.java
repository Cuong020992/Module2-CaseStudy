package controller;

import model.Doctor;

import java.util.ArrayList;
import java.util.List;

public class ManagementDoctor {
    List<Doctor> doctorList;

    public ManagementDoctor(List<Doctor> doctorList) {
        this.doctorList = new ArrayList<>();
    }

    public void showDoctor(){
        for (Doctor doctor : doctorList) {
            System.out.println(doctor.toString());
        }
    }
    public void addDoctor(){

    }
}
