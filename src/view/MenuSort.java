package view;

import model.Student;
import service.StudentService;

import java.util.List;
import java.util.Scanner;

public class MenuSort {
    private static Scanner scanner = new Scanner(System.in);
    static StudentView studentView = new StudentView();
    static StudentService studentService = new StudentService();
    static List<Student> studentList;

    public MenuSort() {
        studentList = studentService.getItem();
    }
    public static void sortMenu() {
        System.out.print(
                "-------------------------------------------------------------------\n" +
                "                                                                    \n" +
                "             SẮP XẾP SINH VIÊN THEO ĐIỂM TRUNG BÌNH                 \n" +
                "                                                                    \n" +
                "                [1. Hiển thị sắp xếp điểm trung bình                \n" +
                "                [0. Quay lại                                        \n" +
                "                                                                    \n" +
                "-------------------------------------------------------------------\n"
        );
        System.out.print("➨ \t");
    }
    public static void option() {
        boolean flag = true;
        int choice;
        do {
            sortMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    showSortByDiemTrungBinh();
                    break;
                case 0:
                    Menu.mainMenu();
                    break;
                default:
                    System.out.println("Nhập vào không hợp lệ, hãy thử lại!");
                    flag = false;
            }
        } while (!flag);
    }

    public static void showSortByDiemTrungBinh() {
        boolean flag = true;
        int choice;
        do {
            System.out.print(
                    "-------------------------------------------------------------------\n" +
                    "                                                                   \n" +
                    "                        SẮP XẾP ĐIỂM TRUNG BÌNH                    \n" +
                    "                                                                   \n" +
                    "                [1] Sắp xếp điểm trung bình tăng dần               \n" +
                    "                [2] Sắp xếp điểm trung bình giảm dần               \n" +
                    "                [0] Quay lại                                       \n" +
                    "                                                                   \n" +
                    "-------------------------------------------------------------------\n"
            );
            System.out.print("Chọn chức năng:");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        List<Student> studentList = studentService.getItem();
                        System.out.println("Sắp xếp điểm trung bình tăng dần");
                        SortByDiemTrungBinhASC sortByDiemTrungBinhASC = new SortByDiemTrungBinhASC();
                        studentList.sort(sortByDiemTrungBinhASC);
                        studentView.show(studentList);
                        option();
                        break;
                    case 2:
                        List<Student> studentsList = studentService.getItem();
                        System.out.println("Sắp xếp điểm trung bình giảm dần");
                        SortByDiemTrungBinhESC sortByDiemTrungBinhESC = new SortByDiemTrungBinhESC();
                        studentsList.sort(sortByDiemTrungBinhESC);
                        studentView.show(studentsList);
                        option();
                        break;
                    case 0:
                        Menu.mainMenu();
                        break;
                    default:
                        System.out.println("Chọn lại !");
                        flag = false;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } while (!flag);

    }
}