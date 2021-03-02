package service;

import model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    boolean update(int id, Student student);

    boolean delete(int id);

    boolean createStudent(int id, Student student);

    Student findById(int id);
    List<Student> findByName(String name);


}
