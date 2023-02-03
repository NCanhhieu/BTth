package ques2;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Demo2 {
    public static void main(String[] args) {
       //khai báo mảng kiểu dữ liệu cha thì được gán các đối tượng kiểu con
        ArrayList<Animal> list = new ArrayList();
        Animal a = new Animal("Animal A");
        Cat c = new Cat("cat 1");
        Dog d = new Dog("Dog 1");
        list.add(a);
        list.add(c);
        list.add(d);
        System.out.println(" hiển thị các con vật");
        for(int i = 0; i < list.size(); i++){
            list.get(i).sayHello();
        }
     //đây là liên kết động - khi chương trình đang chạy 
     // nó mới tìm hiểu thằng thứ i
    }
    
    
}
