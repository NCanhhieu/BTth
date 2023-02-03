
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class ETriangle extends Triangle {
    int edges;

    public ETriangle() {
    }

    public ETriangle(int edges) {
        this.edges = edges;
    }

    public ETriangle(int edges, int edgesA, int edgesB, int edgesC) {
        super(edgesA, edgesB, edgesC);
        this.edges = edges;
    }
    
    @Override
    public void Input(){
         Scanner sc = new Scanner(System.in);
         System.out.println("cạnh của tam giác đều: ");
         edges = sc.nextInt();
         
    }
    
    @Override
     public int Perimeter(){
        int P;
        P =  edges*3;
        return P;
    } 
     
     @Override
     public double Area(){
        double S;
        S= edges*edges*Math.sqrt (3)/4;
        return S;
    }
     
     @Override
      public void Display(){
        System.out.println(" Cạnh của tam giác là: "  + this.edges );

    }
}
