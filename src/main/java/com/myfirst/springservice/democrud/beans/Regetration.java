package com.myfirst.springservice.democrud.beans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Regetration {
    
    private List<Student> studentRecords;
    
    private static Regetration stdregd = null;
    
    private Regetration() {
        Student ayush = Student.builder()
                .name("Ayush")
                .age(23)
                .RegistrationNumber("1").build();
        studentRecords = Collections.singletonList(ayush);
    }
    
    public static Regetration getInstance() {
        
        if (stdregd == null) {
            stdregd = new Regetration();
            return stdregd;
        } else {
            return stdregd;
        }
    }
    
    /*
    public void add(Student std) {
        studentRecords.add(std);
    }
    
    public String upDateStudent(Student std) {
        
        for(int i=0; i<studentRecords.size(); i++)
        {
            Student stdn = studentRecords.get(i);
            System.out.println(stdn.getRegistrationNumber());
            System.out.println(std.getRegistrationNumber());
            if(stdn.getRegistrationNumber().equals(std.getRegistrationNumber())) {
                studentRecords.set(i, std);//update the new record
                return "Update successful";
            }
        }
        
        return "Update un-successful";
        
    }
    
    public String deleteStudent(String registrationNumber) {
        
        for(int i=0; i<studentRecords.size(); i++)
        {
            Student stdn = studentRecords.get(i);
            if(stdn.getRegistrationNumber().equals(registrationNumber)) {
                studentRecords.remove(i);//update the new record
                return "Delete successful";
            }
        }
        
        return "Delete un-successful";
        
    }
    */
    public List<Student> getStudentRecords() {
        return studentRecords;
    }
}
