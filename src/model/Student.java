package model;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private long studentID;
    private String ten;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;
    private double diemTrungBinh;

    public Student() {
    }

    public Student(String record) {
        String[] fields = record.split(",");
        studentID = Integer.parseInt(fields[0]);
        ten = fields[1];
        tuoi = Integer.parseInt(fields [2]);
        gioiTinh = fields[3];
        diaChi = fields[4];
        diemTrungBinh = Double.parseDouble(fields[5]);
    }

    public Student(long studentID, String ten, int tuoi, String gioiTinh, String diaChi, double diemTrungBinh) {
        this.studentID = studentID;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.diemTrungBinh = diemTrungBinh;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return studentID +
                "," + ten +
                "," + tuoi +
                "," + gioiTinh +
                "," + diaChi +
                "," + diemTrungBinh;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.getStudentID() - o2.getStudentID());
    }
}
