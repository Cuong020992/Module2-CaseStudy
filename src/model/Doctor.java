package model;

public class Doctor extends Person {
    private String positionDoctor;
    private String levelSalaryDoctor;

    public Doctor() {
    }

    public Doctor(String positionDoctor, String levelSalaryDoctor) {
        this.positionDoctor = positionDoctor;
        this.levelSalaryDoctor = levelSalaryDoctor;
    }

    public Doctor(String name, int age, String address, boolean gender, String phone, String positionDoctor, String levelSalaryDoctor) {
        super(name, age, address, gender, phone);
        this.positionDoctor = positionDoctor;
        this.levelSalaryDoctor = levelSalaryDoctor;
    }

    public String getPositionDoctor() {
        return positionDoctor;
    }

    public void setPositionDoctor(String positionDoctor) {
        this.positionDoctor = positionDoctor;
    }

    public String getLevelSalaryDoctor() {
        return levelSalaryDoctor;
    }

    public void setLevelSalaryDoctor(String levelSalaryDoctor) {
        this.levelSalaryDoctor = levelSalaryDoctor;
    }

    @Override
    public String toString() {
        return "model.Doctor{" +
                "positionDoctor='" + positionDoctor + '\'' +
                ", levelSalaryDoctor='" + levelSalaryDoctor + '\'' +
                '}';
    }
}