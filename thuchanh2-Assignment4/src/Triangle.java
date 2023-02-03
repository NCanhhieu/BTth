
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Triangle {
    int edgesA;
    int edgesB;
    int edgesC;
    public Triangle() {
    }

    public Triangle(int edgesA, int edgesB, int edgesC) {
        this.edgesA = edgesA;
        this.edgesB = edgesB;
        this.edgesC = edgesC;
    }
    
    public void Input(){
         Scanner sc = new Scanner(System.in);
         System.out.println("nhập 3 cạnh");
         System.out.println("cạnh A");
         edgesA = sc.nextInt();
         System.out.println("cạnh B");
         edgesB = sc.nextInt();
         System.out.println("cạnh C");
         edgesC = sc.nextInt();
    }
    
    public int Perimeter(){
        int P;
        P =  edgesA +  edgesB +  edgesC;
        return P;
    } 
    public double Area(){
        double S;
        S= Math.sqrt (Perimeter()*(Perimeter()-edgesA)*(Perimeter()-edgesB)*(Perimeter()-edgesC) );
        return S;
    }
    
    public void Display(){
        System.out.println(" Cạnh của tam giác là: "  + this.edgesA + " , " + this.edgesB + " , " + this.edgesC );
      
    }
}
