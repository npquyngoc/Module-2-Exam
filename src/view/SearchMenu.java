package view;

import model.Student;
import service.StudentService;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class SearchMenu {
    static Scanner scanner = new Scanner(System.in);
    static StudentView studentView = new StudentView();
    static StudentService studentService = new StudentService();

    public static void searchMenu() {
        boolean isChoice = true;
        int choice = -1;
        do {
            System.out.print(
                    "-------------------------------------------------------------------\n" +
                    "                                                                   \n" +
                    "                      TÌM KIẾN NHÂN VIÊN                           \n" +
                    "                                                                   \n" +
                    "                     1. Tìm kiếm theo mã sinh viên                 \n" +
                    "                     2. Tìm kiếm theo tên                          \n" +
                    "                     3. Tìm kiếm theo giới tính                    \n" +
                    "                     4. Tìm kiếm theo điểm trung bình              \n" +
                    "                     6. Quay lại                                   \n" +
                    "                                                                   \n" +
                    "-------------------------------------------------------------------\n"
            );

            System.out.print("Chọn chức năng: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
            }
            switch (choice) {
                case 1:
                    searchById();
                    break;
                case 2:
                    searchByName();
                    break;
                case 3:
                    searchByGioiTinh();
                    break;
                case 4:
                    searchByDiemTrungBinh();
                    break;
                case 0:
                    Menu.mainMenu();
                    isChoice = false;
                    break;
                default: System.out.println("Nhập vào không hợp lệ, hãy thử lại!");
            }

        } while (isChoice);
    }

    public static void searchByDiemTrungBinh() {
        List<Student> studentList = studentService.getItem();
        int count = 0;
        System.out.println();
        System.out.print("Nhập số điểm trung bình cần tìm kiếm : ");
        try {
            int search = Integer.parseInt(scanner.nextLine());
            System.out.println("Kết quả :  '" + search + "' là : ");
            System.out.printf("%-20s %-30s %-10s %-10s %-20s %-15s", "Mã sinh viên", "Họ tên", "Tuổi", "Giới tính", "Địa chỉ", "Điểm trung bình");
            for (Student student : studentList) {
                if (student.getDiemTrungBinh() == search) {
                    count++;
                    System.out.printf("%-20s %-30s %-10s %-10s %-20s %-15s\n", student.getStudentID(), student.getTen(), student.getTuoi(), student.getGioiTinh(), student.getDiaChi(), student.getDiemTrungBinh());
                }
            }
            showReturnSearch(count);
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("Nhập vào không hợp lệ, hãy thử lại!");
            searchByDiemTrungBinh();
        }
    }

    public static void searchById() {
        List<Student> studentList = studentService.getItem();
        int count = 0;
        System.out.println();
        System.out.print("Nhập mã sinh viên cần tìm kiếm : ");
        try {
            int search = Integer.parseInt(scanner.nextLine());
            System.out.println("Kết quả :  '" + search + "' là : ");
            System.out.printf("%-20s %-30s %-10s %-10s %-20s %-15s", "Mã sinh viên", "Họ tên", "Tuổi", "Giới tính", "Địa chỉ", "Điểm trung bình");
            for (Student student :studentList) {
                if (student.getStudentID() == search) {
                    count++;
                    System.out.printf("%-20s %-30s %-10s %-10s %-20s %-15s\n", student.getStudentID(), student.getTen(), student.getTuoi(), student.getGioiTinh(), student.getDiaChi(), student.getDiemTrungBinh());
                }
            }
            showReturnSearch(count);

        } catch (Exception e) {
            System.out.println("Nhập vào không hợp lệ, hãy thử lại!");
        }
    }

    public static void searchByName() {
        List<Student> studentList = studentService.getItem();
        int count = 0;
        System.out.println();
        System.out.print("Nhập tên sinh viên cần tìm kiếm : ");
        String search = scanner.nextLine();
        System.out.println("Kết quả tìm kiếm của từ khóa '" + search + "' là : ");
        search = search.toLowerCase();
        System.out.printf("%-20s %-30s %-10s %-10s %-20s %-15s", "Mã sinh viên", "Họ tên", "Tuổi", "Giới tính", "Địa chỉ", "Điểm trung bình");
        for (Student student : studentList) {
            if (student.getTen().toLowerCase().contains(search)) {
                count++;
                System.out.printf("%-20s %-30s %-10s %-10s %-20s %-15s\n", student.getStudentID(), student.getTen(), student.getTuoi(), student.getGioiTinh(), student.getDiaChi(), student.getDiemTrungBinh());
            }
        }
        showReturnSearch(count);
    }

    public static void searchByGioiTinh() {
        List<Student> studentList = studentService.getItem();
        int count = 0;
        System.out.println();
        System.out.print("Nhập giới tính cần tìm kiếm : ");
        try {
            String search = scanner.nextLine();
            System.out.println("Kết quả :  '" + search + "' là : ");
            search = search.toLowerCase();
            System.out.printf("%-20s %-30s %-10s %-10s %-20s %-15s", "Mã sinh viên", "Họ tên", "Tuổi", "Giới tính", "Địa chỉ", "Điểm trung bình");
            for (Student student : studentList) {
                if (student.getGioiTinh().toLowerCase().contains(search)) {
                    count++;
                    System.out.printf("%-20s %-30s %-10s %-10s %-20s %-15s\n", student.getStudentID(), student.getTen(), student.getTuoi(), student.getGioiTinh(), student.getDiaChi(), student.getDiemTrungBinh());
                }
            }
            showReturnSearch(count);
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("Nhập vào không hợp lệ, hãy thử lại!");
            searchByDiemTrungBinh();
        }
    }

    public static void showReturnSearch(int count) {
        System.out.println("Có '" + count + "' sản phẩm được tìm thấy!");
        char press = ' ';
        boolean isChoice;
        System.out.println();
        do {
            System.out.print("Nhấn 'c' để về menu tìm kiếm! ➨ ");
            try {
                press = scanner.nextLine().charAt(0);
            } catch (Exception e) {
                press = ' ';
            }
            switch (press) {
                case 'r':
                case 'c': {
                    SearchMenu.searchMenu();
                    isChoice = false;
                    break;
                }
                default:
                    isChoice = true;
            }
        } while (isChoice);
    }
}
