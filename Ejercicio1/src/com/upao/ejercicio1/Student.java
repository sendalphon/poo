package com.upao.ejercicio1;



public class Student 
{
    private String name;
    private String address;
    private  int numCourse;
    private String[]courses;
    private int[]grades;
    
    private static final int MAX_COURSE=20;
    
    public  Student(String name,String address)
    {
        this.name=name;
        this.address=address;
        
        courses=new String[MAX_COURSE];
        grades=new int[MAX_COURSE];
        
        numCourse=0;
    }

    public int getNumCourse() {
        return numCourse;
    }

    public void setNumCourse(int numCourse) {
        this.numCourse = numCourse;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setNumCourses(int numCourse) 
    {
        this.numCourse = numCourse;
    }
    
    public void addCoursesGrades(String course,int grade)
    {
        courses[numCourse]=course;
        grades[numCourse]=grade;
        ++numCourse;
    }
    
    public void printGrades()
    {
        System.out.println(this);
        for (int i = 0; i < numCourse; i++) {
            System.out.println(""+courses[i]+":"+grades[i]);
        }
        System.out.println();
    }
    public double getAverageGrade()
    {
        int sumprom=0;
        for (int i = 0; i < numCourse; i++) {
            sumprom+=grades[i];
        }
        return (double)sumprom/numCourse;
    }
    public void qtyinstock(int qtyinstock)
    {
    }

    @Override
    public String toString() {
        return "Student: " + "name=" + name + ", address=" + address;
    }
    
    
}
