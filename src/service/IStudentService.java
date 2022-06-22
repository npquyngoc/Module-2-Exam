package service;

import model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getItem();

    void addItem(Student newStudent);

    void update(Student newStudent);

    void remove(long id);

    boolean exists(int id);

    Student getStudentByID(int studentID);
}
