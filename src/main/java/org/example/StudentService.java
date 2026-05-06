package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Students> studentslist = new ArrayList<>();
    public List<Students> getStudentslist () {
        return  this.studentslist;
    }
    public void addStudent(Students student) {
        this.studentslist.add(student);
    }
    public Students getStudentById(int id)
    {
        return studentslist.stream()
                .filter(students -> students.getId()==id)
                .findFirst()
                .orElse(null);
    }
    public Students getStudentByName(String name)
    {
       return studentslist.stream()
                .filter((students )-> students.getName().equals(name))
                .findFirst()
                .orElseThrow(()-> new StudentNotFoundException("Student not Found" + name));
    }
}
