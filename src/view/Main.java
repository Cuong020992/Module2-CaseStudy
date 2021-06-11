package view;

import java.util.Scanner;

public class Main {
   public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }

    public void inputInfomation(){
        System.out.println("nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("nhập giới tính: ");
        Boolean gender = scanner.nextBoolean();
        System.out.println("nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
    }
}
