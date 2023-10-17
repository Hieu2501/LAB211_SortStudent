/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import model.Student;

/**
 *
 * @author Admin
 */
public class StudentManagement {
    
    public List<Student> sortStudent(List<Student> list) {
        Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        return list;
    }
    
    public void display(List<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("------------Student " + (i + 1) + "-------------");
            System.out.println(list.get(i));
        }
    }
}
