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
}
