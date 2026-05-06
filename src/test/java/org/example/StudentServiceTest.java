package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest
{
     @Test
    void getStudentTest()
     {
          StudentService studentService = new StudentService();
          Students s1 = new Students(5, "Nirob");

         List<Students> testStudentList = studentService.getStudentslist();
         studentService.addStudent(s1);
         boolean actualResult = testStudentList.isEmpty();
         //assertTrue(actualResult);
//         assertTrue(()->actualResult);
       // assertTrue(actualResult,"There are students");
         assertTrue(actualResult);
     }
     @Test
     void getStudentTestFalse()
     {
       StudentService studentService = new StudentService();
       Students s2 =new Students(10,"jawad");
      // studentService.addStudent(s2);
       boolean actualResult= studentService.getStudentslist().isEmpty();
       assertFalse(actualResult);
     }

}