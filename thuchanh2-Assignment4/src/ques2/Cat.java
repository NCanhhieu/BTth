/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ques2;

/**
 *
 * @author Admin
 */
public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }
    
     @Override
    public void input(){
        System.out.println("tên chó là:");
        super.input();
    }
    
    @Override
     public void sayHello(){
        System.out.println("Hi, I am a cat, my name is " + name);
    }
}
