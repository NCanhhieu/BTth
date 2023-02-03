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
public class Main {
    public static void main(String[] args) {
        zoo list = new zoo();
         String s;
        
        Scanner sc = new Scanner(System.in);
   
        do{//nhập thú,  mỗi lần nhập xong thì trả lời có tiếp hay không  
         System.out.println("nhập từ 1 đến 3");
        System.out.println("1- animal, 2- cat, 3- dog");
        list.addA();
        
          System.out.println("có Tiếp tục?(c/k)");
            s = sc.nextLine(); //nhập một chuỗi hoặc 1 ký tự
        }while(s.equalsIgnoreCase("c")); //nếu chuỗi vừa nhập bằng c hoặc C thì quay lại nhập tiếp, ngược lại thì thoát khỏi vòng lặp
        list.sayhello2();
        String S;
        System.out.println("xóa con :");
        S = sc.nextLine();
        list.removeA(S);
        list.sayhello2();
    }
}
