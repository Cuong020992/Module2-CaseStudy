package model;

public class Nurse extends Person {
    private String levelNurse;

    public Nurse() {
    }

    public Nurse(String levelNurse) {
        this.levelNurse = levelNurse;
    }

    public Nurse(String name, int age, String address, boolean gender, String phone, String levelNurse) {
        super(name, age, address, gender, phone);
        this.levelNurse = levelNurse;
    }

    public String getLevelNurse() {
        return levelNurse;
    }

    public void setLevelNurse(String levelNurse) {
        this.levelNurse = levelNurse;
    }

    @Override
    public String toString() {
        return "model.Nurse{" +
                "levelNurse='" + levelNurse + '\'' +
                '}';
    }
}
