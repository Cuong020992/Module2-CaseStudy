package model;

public class Nurse extends Person {
    private int levelNurse;

    public Nurse() {
    }

    public Nurse(int levelNurse) {
        this.levelNurse = levelNurse;
    }

    public Nurse(String name, int age, String address, String gender, String phone, int levelNurse) {
        super(name, age, address, gender, phone);
        this.levelNurse = levelNurse;
    }

    public Nurse(Person person, int levelNurse) {
        super(person.getName(), person.getAge(), person.getAddress(), person.getGender(), person.getPhone());
        this.levelNurse = levelNurse;
    }

    public int getLevelNurse() {
        return levelNurse;
    }

    public void setLevelNurse(int levelNurse) {
        this.levelNurse = levelNurse;
    }

    @Override
    public String toString() {
        return "Y tá{" +
                "Tên='" + super.getName() + '\'' +
                ", Tuổi=" + super.getAge() +
                ", Địa chỉ='" + super.getAddress() + '\'' +
                ", Giới tính=" + super.getGender() +
                ", Số điện thoại='" + super.getPhone() + '\'' +
                ", Cấp bậc lương='" + levelNurse + '\'' +
                '}';
    }
}
