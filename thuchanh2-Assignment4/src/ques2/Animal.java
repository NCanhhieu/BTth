/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ques2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Animal {
    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }
       public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên:");
        name = sc.nextLine();
    }
    public void sayHello(){
        System.out.println("Hi, I am animal, my name is " + name);
    }
    
    
}
