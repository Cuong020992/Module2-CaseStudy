package controller;

import model.Doctor;
import model.PreventiveDoctor;

import java.util.ArrayList;
import java.util.List;

public class MangamentPreventiveDoctor {
    List<PreventiveDoctor> preventiveDoctors;

    public MangamentPreventiveDoctor() {
        this.preventiveDoctors = new ArrayList<>();
    }


    public void showpreventiveDoctor() {
        for (PreventiveDoctor preventiveDoctors : preventiveDoctors) {
            System.out.println(preventiveDoctors.toString());
        }
    }

    public void addpreventiveDoctor(PreventiveDoctor preventiveDoctor) {
        this.preventiveDoctors.add(preventiveDoctor);
    }
}
