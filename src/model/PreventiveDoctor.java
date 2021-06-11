package model;

import model.Person;

public class PreventiveDoctor extends Person {
    private String positionPreventiveDoctor;
    private String levelSalaryPreventiveDoctor;

    public PreventiveDoctor(){
    }

    public PreventiveDoctor(String positionPreventiveDoctor, String levelSalaryPreventiveDoctor) {
        this.positionPreventiveDoctor = positionPreventiveDoctor;
        this.levelSalaryPreventiveDoctor = levelSalaryPreventiveDoctor;
    }

    public PreventiveDoctor(String name, int age, String address, boolean gender, String phone, String positionPreventiveDoctor, String levelSalaryPreventiveDoctor) {
        super(name, age, address, gender, phone);
        this.positionPreventiveDoctor = positionPreventiveDoctor;
        this.levelSalaryPreventiveDoctor = levelSalaryPreventiveDoctor;
    }

    public String getPositionPreventiveDoctor() {
        return positionPreventiveDoctor;
    }

    public void setPositionPreventiveDoctor(String positionPreventiveDoctor) {
        this.positionPreventiveDoctor = positionPreventiveDoctor;
    }

    public String getLevelSalaryPreventiveDoctor() {
        return levelSalaryPreventiveDoctor;
    }

    public void setLevelSalaryPreventiveDoctor(String levelSalaryPreventiveDoctor) {
        this.levelSalaryPreventiveDoctor = levelSalaryPreventiveDoctor;
    }

    @Override
    public String toString() {
        return "model.PreventiveDoctor{" +
                "positionPreventiveDoctor='" + positionPreventiveDoctor + '\'' +
                ", levelSalaryPreventiveDoctor='" + levelSalaryPreventiveDoctor + '\'' +
                '}';
    }
}
