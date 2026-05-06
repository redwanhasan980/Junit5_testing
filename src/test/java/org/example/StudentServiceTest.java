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
         boolean actualResult = testStudentList.isEmpty();
         assertTrue(actualResult);
     }
     @Test
     void setStudentTest()
     {

     }

}