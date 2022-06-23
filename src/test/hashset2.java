/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;

class student 
{
    int rollno;
    String name,address;
    
    student(int rollno,String name,String address)
    {
        this.rollno=rollno;
        this.name=name;
        this.address=address;
    }
     
}

public class hashset2
{
    public static void main(String args[])
    {
        student s1=new student(1,"harsh rana","barauli");
        student s2=new student(2,"virat","delhi");
        
        HashSet<student> h=new HashSet();
        h.add(s1);
        h.add(s2);
        
        for(student var:h)
        {
            System.out.println(var.rollno+" "+var.name+" "+var.address);
        }
    }
    
}
