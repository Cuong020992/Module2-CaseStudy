package view;

import controller.ManagementDoctor;
import controller.ManagementPerson;
import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ManagementPerson managementPerson = new ManagementPerson();
    public static ManagementDoctor managementDoctor = new ManagementDoctor();

    public static void main(String[] args) {
        String choice;
        do {
            menu();
            choice = scanner.nextLine();
            switch (choice) {
                case "1": {
                    System.out.println("Chọn loại nhân sự bạn muốn thêm ");
                    System.out.println("Nhấn a: để thêm thông tin bác sĩ");
                    System.out.println("Nhấn b: để thêm thông tin bác sĩ dự phòng");
                    System.out.println("Nhấn c: để thêm thông tin y tá");
                    System.out.println("Nhấn d: để thêm thông tin bệnh nhân");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            addDoctor();

                        }
                        break;
                        case "b": {
                            addPreventiveDoctor();
                        }
                        break;
                        case "c": {
                            addNurse();
                        }
                        break;
                        case "d": {
                            addPatient();
                        }
                        break;
                        default:{
                            System.out.println("Nhập sai! Yêu cầu nhập lại!");
                        }
                        break;
                    }
                }
                break;
                case "2": {
                    System.out.println("Chọn loại danh sách bạn muốn hiển thị");
                    System.out.println("Nhấn a: Hiển thị danh sách bác sĩ");
                    System.out.println("Nhấn b: Hiển thị danh sách bác sĩ dự phòng");
                    System.out.println("Nhấn c: Hiển thị danh sách y tá");
                    System.out.println("Nhấn d: Hiển thị danh sách bệnh nhân");
                    System.out.println("Nhấn e: Hiển thị danh sách tất cả nhân sự trong bệnh viện");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.println("hiển thị danh sách bác sĩ");
                            managementDoctor.showDoctor();
                        }
                        break;
                        case "b": {
//                            addDoctor();
                        }
                        break;
                        case "c": {
//                            addDoctor();
                        }
                        break;
                        case "d": {
//                            addDoctor();
                        }
                        break;
                        case "e": {
                            System.out.println("hiển thị danh sách");
                            Person person = new Person();
                            managementPerson.showListPerson(person);
                        }
                        break;
                        default: {
                            System.out.println("Yêu cầu nhập lại");
                        }
                    }
                }
                break;
                case "3": {

                }
                break;
                case "4": {

                }
                break;
                case "5": {

                }
                break;
                case "6": {

                }
                break;
                case "7": {

                }
                break;
                case "8": {

                }
                break;
                case "9": {

                }
                break;
                case "10": {

                }
                break;
                default: {
                    System.out.println("Yêu cầu nhập lại");
                }
                break;
            }
        } while (!choice.equals("9"));
    }

    //thêm thông tin chung để không cần viết lại nhiều lần
    public static Person inputInfomation() {
        System.out.println("nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        Person inputPerson = new Person(name, age, address, gender, phoneNumber);
        return inputPerson;
    }

    //thêm bác sĩ
    public static void addDoctor() {
        System.out.println("Nhập thông tin bác sĩ");
        Person person = inputInfomation();
        System.out.println("nhập vị trí: ");
        String positionDoctor = scanner.nextLine();
        System.out.println("nhập cấp bậc lương: ");
        int levelSalaryDoctor = scanner.nextInt();
        Doctor doctor = new Doctor(person, positionDoctor, levelSalaryDoctor);
        managementPerson.addPerson(doctor);
        managementDoctor.addDoctor(doctor);
    }

    //thêm bác sĩ dự phòng
    public static void addPreventiveDoctor() {
        System.out.println("Nhập thông tin bác sĩ dự phòng");
        Person person = inputInfomation();
        System.out.println("nhập vị trí: ");
        String positionPreventiveDoctor = scanner.nextLine();
        System.out.println("nhập cấp bậc lương: ");
        int levelSalaryPreventiveDoctor = scanner.nextInt();
        PreventiveDoctor preventiveDoctor = new PreventiveDoctor(person, positionPreventiveDoctor, levelSalaryPreventiveDoctor);
        managementPerson.addPerson(preventiveDoctor);
    }

    //thêm y tá
    public static void addNurse() {
        System.out.println("Nhập thông tin y tá");
        Person person = inputInfomation();
        System.out.println("nhập cấp bậc lương: ");
        int levelNurse = scanner.nextInt();
        Nurse nurse = new Nurse(person, levelNurse);
        managementPerson.addPerson(nurse);
    }

    //thêm bệnh nhân
    public static void addPatient(){
        System.out.println("Nhập thông tin bệnh nhân");
        Person person = inputInfomation();
        System.out.println("nhập tên bệnh mắc phải");
        String diseases = scanner.nextLine();
        System.out.println("nhập trạng thái bệnh nhân");
        String status = scanner.nextLine();
        System.out.println("nhập chiều cao");
        double height = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("nhập cân nặng");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("nhập số ngày nhập viện");
        int daysInHospital = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập loại phòng bệnh");
        String typeRoom = scanner.nextLine();
        System.out.println("nhập số phòng");
        int idRoom = scanner.nextInt();
        Patient patient = new Patient(person,diseases,status,height,weight,daysInHospital,typeRoom,idRoom);
        managementPerson.addPerson(patient);
    }

    private static void menu() {
        System.out.println("");
        System.out.println("--Menu--");
        System.out.println("---------------------------");
        System.out.println("1. Thêm nhân sự");
        System.out.println("2. Hiển thị danh sách nhân sự");
        System.out.println("3. Tìm kiếm nhân sự");
        System.out.println("4. Sắp xếp nhân sự");
        System.out.println("5. Sửa thông tin nhân sự");
        System.out.println("6. Xóa thông tin nhân sự");
        System.out.println("7. Lưu vào file CSV");
        System.out.println("8. Đọc file nhân sự");
        System.out.println("9. Thoát");
        System.out.println("---------------------------");
        System.out.println("");
        System.out.print("nhập lựa chọn của bạn: ");
        System.out.println("");
    }

}
