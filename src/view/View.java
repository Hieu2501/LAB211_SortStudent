/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Admin
 */
import common.Library;
import java.util.ArrayList;

/**
 *
 * @author ACER
 * @param <T>
 */
public abstract class View<T> {

    protected String title;
    Library l = new Library();

    public View() {
    }

    public View(String td) {
        title = td;
    }

    public void display() {
        System.out.println(title);
    }


    public abstract void execute();

    public void run() {
        display();
        execute();
    }
}