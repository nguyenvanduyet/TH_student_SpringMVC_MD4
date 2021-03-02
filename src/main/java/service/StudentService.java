package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudentService{
    public static List<Student> students= new ArrayList<>();
    static {
        students.add(new Student(1,"thanh","hn",27));
        students.add(new Student(2,"Mung","nd",28));
        students.add(new Student(3,"Toan","tb",27));
        students.add(new Student(4,"Hieu","hn",28));
    }
    @Override
    public List<Student> findAll() {
        return students;
    }


    @Override
    public boolean update(int id, Student student) {
        students.set(id,student);
        return false;
    }

    @Override
    public boolean delete(int id) {
        students.remove(id);
        return false;
    }

    @Override
    public boolean createStudent(int id, Student student) {
        students.add(id,student);
        return false;
    }

    @Override
    public Student findById(int id) {
        return students.get(id);
    }

    @Override
    public List<Student> findByName(String name) {
        List<Student> studentList = new ArrayList<>();
        for (Student s:students) {
            if (s.getName().equals(name)){
                studentList.add(s);
            }
        }
        return studentList;
    }
}
