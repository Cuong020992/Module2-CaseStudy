package model;

public class Doctor extends Person {
    private String positionDoctor;
    private int levelSalaryDoctor;

    public Doctor() {
    }


    public Doctor(String name, int age, String address, String gender, String phone, String positionDoctor, int levelSalaryDoctor) {
        super(name, age, address, gender, phone);
        this.positionDoctor = positionDoctor;
        this.levelSalaryDoctor = levelSalaryDoctor;
    }

    public Doctor(Person person, String positionDoctor, int levelSalaryDoctor) {
        super(person.getName(), person.getAge(), person.getAddress(), person.getGender(), person.getPhone());
        this.positionDoctor = positionDoctor;
        this.levelSalaryDoctor = levelSalaryDoctor;
    }

    public String getPositionDoctor() {
        return positionDoctor;
    }

    public void setPositionDoctor(String positionDoctor) {
        this.positionDoctor = positionDoctor;
    }

    public int getLevelSalaryDoctor() {
        return levelSalaryDoctor;
    }

    public void setLevelSalaryDoctor(int levelSalaryDoctor) {
        this.levelSalaryDoctor = levelSalaryDoctor;
    }

    @Override
    public String toString() {
        return "Bác sĩ{" +
                "Tên='" + super.getName() + '\'' +
                ", Tuổi=" + super.getAge() +
                ", Địa chỉ='" + super.getAddress() + '\'' +
                ", Giới tính=" + super.getGender() +
                ", Số điện thoại='" + super.getPhone() + '\'' +
                ", Vị trí='" + positionDoctor + '\'' +
                ", Cấp bậc lương='" + levelSalaryDoctor + '\'' +
                '}';
    }
}