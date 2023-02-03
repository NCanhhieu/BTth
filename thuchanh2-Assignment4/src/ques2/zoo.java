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
    public boolean checkDifname(String a){
          for(int j = 0; j< list.size(); j++){
      Animal Temp =list.get(j);
      if(Temp.name.equals(a)){
          return false;
      }
    }  return true;
    }
    public void addA(){
        Scanner sc = new Scanner(System.in);
        int i;
        i = sc.nextInt();
       
               switch(i){
                    case 1 -> {
                        Animal newzoo = new Animal();
                        System.out.println("nhập tên thú:");
                        newzoo.input();
                        if(checkDifname(newzoo.name))
                        {list.add(newzoo);
                        break;
                        }  else {
                            System.out.println("tên bị trùng");
                        }
            }
                    case 2 -> {
                        Cat cat = new Cat();
                        cat.input();
                         if(checkDifname(cat.name))
                        {   list.add(cat);
                        break;
                        }  else {
                            System.out.println("tên bị trùng");
                        }
            }
                     
           
                    case 3 -> {
                        Dog dog = new Dog();   
                        dog.input();
                        if(checkDifname(dog.name))
                        {   list.add(dog);
                        break;
                        }  else {
                            System.out.println("tên bị trùng");
                        }
            }
                       
             
                    default -> System.out.println("vui lòng nhập từ 1 đến 3");
           }
    }
    
    public void removeA(String name){
       
        for ( int i = 0; i < list.size(); i++){
            Animal Temp =list.get(i);
            if(Temp.name.equalsIgnoreCase(name)){
                list.remove(i);
                break;
            }
                if(Temp.name.equalsIgnoreCase("")){
                    System.out.println("tên ko có để xóa");
                    break;
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
