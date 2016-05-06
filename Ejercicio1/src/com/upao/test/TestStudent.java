
package com.upao.test;

import com.upao.ejercicio1.Student;

public class TestStudent 
{
    public static void main(String[] args) 
    {
        Student stu=new Student("maqui victoriano", "av.miraflores");
        
        Student[] GrupoEstudiantil=new Student[50];
        
        stu.addCoursesGrades("\npoo", 2);
        stu.addCoursesGrades("\npsicologia", 2);
        stu.addCoursesGrades("\nfisica ", 3);
        stu.addCoursesGrades("\nvida y obra de antenor orrego", 4);
        
        stu.printGrades();
        
        System.out.print("\nThe average grade is : "+
                    stu.getAverageGrade());
        System.out.println("\n");
    }
    
}
