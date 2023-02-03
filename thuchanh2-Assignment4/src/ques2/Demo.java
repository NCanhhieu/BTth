package ques2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Demo {
    public static void Show(Animal a) {
        a.sayHello();  // đa hình , cùng  1 lệnh truyền sang các thằng khác
    }
    public static void main(String[] args) {
        Animal a = new Animal("Animal A");
        Cat c = new Cat("cat 1");
        Dog d = new Dog("Dog 1");
        // đa dạng - cùng 1 lệnh nhưng hành xử khác nhau
        //tùy vào đối tượng truyền cho nó mà kết quả khác nhau
         Show(a);
         Show(c);
        Show(d);
       
    }
}
