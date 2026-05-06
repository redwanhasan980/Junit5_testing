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
     @Test
    void getStudentbyIdTest()
     {
          Students s1= new Students(1,"ab");
          StudentService studentService = new StudentService();
          studentService.addStudent(s1);
          assertNull(studentService.getStudentById(2),"THere is a stu");
          assertNotNull(studentService.getStudentById(2));
     }
     @Test
    void getStudentByNameTest()
     {
         StudentService studentService = new StudentService();
         Students s = new Students(3,"red");
         studentService.addStudent(s);
         assertThrows(StudentNotFoundException.class, ()->{
             studentService.getStudentByName("red1");
         },"Student not fonnd exeception needed");
     }

}