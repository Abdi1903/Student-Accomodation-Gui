/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uweaccomodationsystem.model;

/**
 *
 * @author callumjones
 */
public class Student {
    
    private String studentName;
    private int studentID;
    
    public Student(String studentName, int studentID)
    {
        this.studentName = studentName;
        this.studentID = studentID;
    }
    
    public String getStudentName() 
    {
        return studentName;
}
    
    public int getStudentID()
    {
        return studentID;
    }
    
}
