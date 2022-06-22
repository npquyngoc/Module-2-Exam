package view;

import model.Student;

import java.util.Comparator;

public class SortByDiemTrungBinhASC implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        if(o1.getDiemTrungBinh() > o2.getDiemTrungBinh()){
            return 1;
        }else if(o1.getDiemTrungBinh() == o2.getDiemTrungBinh()){
            return 0;
        }else{
            return -1;
        }
    }
}
