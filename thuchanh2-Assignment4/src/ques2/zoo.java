/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ques2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class zoo {
    ArrayList<Animal> list = new ArrayList<Animal>();
    int n;
    public zoo() {
    }
    
    public void addA(){
        Scanner sc = new Scanner(System.in);
        int i;
        i = sc.nextInt();
       
               switch(i){
                    case 1:
                         Animal newzoo = new Animal();
                        System.out.println("nhập tên thú:");
                         newzoo.input();
                        list.add(newzoo);
                        break;
                    case 2:
                        Cat cat = new Cat();
                        cat.input();
                        list.add(cat);
                        break;
                    case 3:
                        Dog dog = new Dog();   
                        dog.input();
                        list.add(dog);
                        break;
                    default:
                        System.out.println("vui lòng nhập từ 1 đến 3");
           }
    }
    
    public void removeA(String name){
       
        for ( int i = 0; i < list.size(); i++){
            Animal Temp =list.get(i);
            if(Temp.name.equalsIgnoreCase(name)){
                list.remove(i);
            }
                if(Temp.name.equalsIgnoreCase("")){
                    System.out.println("tên ko có để xóa");
            }
        } 
    }
    public void sayhello2(){
         System.out.println(" hiển thị các con vật");
        for(int i = 0; i < list.size(); i++){
            list.get(i).sayHello();
        }
    }
}
