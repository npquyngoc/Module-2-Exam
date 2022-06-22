package view;

import model.Student;

import java.util.Comparator;

public class SortByDiemTrungBinhESC implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o2.getDiemTrungBinh() > o1.getDiemTrungBinh()){
            return 1;
        }else if(o1.getDiemTrungBinh() == o2.getDiemTrungBinh()){
            return 0;
        }else{
            return -1;
        }
    }
}
