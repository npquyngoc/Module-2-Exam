package view;

import thread.Exit;
import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

    public Menu() {
        startMenu();
    }

    public static void startMenu() {
        try {
            boolean flag = true;
            do {
                mainMenu();
                String num = scanner.nextLine();
                switch (num) {
                    case "1":
                        StudentView.showAll();
                        break;
                    case "2":
                        StudentView.add();
                        break;
                    case "3":
                        StudentView.update();
                        break;
                    case "4":
                        StudentView.remove();
                        break;
                    case "5":
                        MenuSort.option();
                        break;
                    case "0":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Nhập vào không hợp lệ, hãy thử lại!");
                        flag = false;
                }
            } while (flag);
        } catch (Exception e) {
            System.out.println("Nhập vào không hợp lệ, hãy thử lại!");
        }
    }


    public static void mainMenu() {

        System.out.print(
                "-------------------------------------------------------------------\n" +
                "                                                                   \n" +
                "                       QUẢN LÝ SINH VIÊN                           \n" +
                "                                                                   \n" +
                "                1. Hiển thị danh sách sinh viên                    \n" +
                "                2. Thêm sinh viên mới                              \n" +
                "                3. Cập nhật danh sách sinh viên                    \n" +
                "                4. Xóa sinh viên khỏi danh sách                    \n" +
                "                5. Hiển thị sắp xếp sinh viên                      \n" +
                "                6. Thoát chương trình                              \n" +
                "                                                                   \n" +
                "-------------------------------------------------------------------\n"
        );

        System.out.print("Chọn chức năng: ");
    }

    public static void exit() {
        Exit exit = new Exit();
        Thread thread1 = new Thread(exit);
        thread1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Bạn đã thoát khỏi chương trình thành công!");
        System.exit(2022);
    }

    public static void inputUpdate() {
        System.out.print(
                "-------------------------------------------------------------------\n" +
                "                                                                   \n" +
                "                                                                   \n" +
                "                   1. Cập nhật họ tên sinh viên                   \n" +
                "                   2. Cập nhật tuổi của sinh viên                 \n" +
                "                   3. Cập nhật giới tính sinh viên                \n" +
                "                   4. Cập nhật địa chỉ                            \n" +
                "                   5. Cập nhật điểm trung bình                    \n" +
                "                   6. Quay lại                                    \n" +
                "                                                                   \n" +
                "-------------------------------------------------------------------\n"
        );

        System.out.print("Chọn chức năng: ");
    }

    public static void removeConfirm() {
        System.out.print(
                "-------------------------------------------------------------------\n" +
                "                                                                    \n" +
                "                     BẠN CHẮC CHẮN MUỐN XÓA                         \n" +
                "                                                                    \n" +
                "                    1. Nhấn [y] để xác nhận xóa                    \n" +
                "                    2. Nhấn [c] để quay lại                        \n" +
                "                                                                    \n" +
                "-------------------------------------------------------------------\n"
        );

        System.out.print("Chọn chức năng: ");
    }
}