package model;

import model.Person;

public class PreventiveDoctor extends Person {
    private String positionPreventiveDoctor;
    private int levelSalaryPreventiveDoctor;

    public PreventiveDoctor(){
    }

    public PreventiveDoctor(String name, int age, String address, String gender, String phone, String positionPreventiveDoctor, int levelSalaryPreventiveDoctor) {
        super(name, age, address, gender, phone);
        this.positionPreventiveDoctor = positionPreventiveDoctor;
        this.levelSalaryPreventiveDoctor = levelSalaryPreventiveDoctor;
    }

    public PreventiveDoctor(Person person, String positionDoctor, int levelSalaryDoctor) {
        super(person.getName(), person.getAge(), person.getAddress(), person.getGender(), person.getPhone());
        this.positionPreventiveDoctor = positionPreventiveDoctor;
        this.levelSalaryPreventiveDoctor = levelSalaryPreventiveDoctor;
    }

    public String getPositionPreventiveDoctor() {
        return positionPreventiveDoctor;
    }

    public void setPositionPreventiveDoctor(String positionPreventiveDoctor) {
        this.positionPreventiveDoctor = positionPreventiveDoctor;
    }

    public int getLevelSalaryPreventiveDoctor() {
        return levelSalaryPreventiveDoctor;
    }

    public void setLevelSalaryPreventiveDoctor(int levelSalaryPreventiveDoctor) {
        this.levelSalaryPreventiveDoctor = levelSalaryPreventiveDoctor;
    }

    @Override
    public String toString() {
        return "Bác sĩ{" +
                "Tên='" + super.getName() + '\'' +
                ", Tuổi=" + super.getAge() +
                ", Địa chỉ='" + super.getAddress() + '\'' +
                ", Giới tính=" + super.getGender() +
                ", Số điện thoại='" + super.getPhone() + '\'' +
                ", Vị trí='" + positionPreventiveDoctor + '\'' +
                ", Cấp bậc lương='" + levelSalaryPreventiveDoctor + '\'' +
                '}';
    }
}
