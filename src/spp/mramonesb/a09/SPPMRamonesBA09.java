/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.mramonesb.a09;
import java.util.Scanner;
/**
 *
 * @author marielaramonesbalvoa
 */
public class SPPMRamonesBA09 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
int size = insertartamaño();
        int [][] A = arreglo ("A", size);
        int [][] B = arreglo ("B", size);
        
        sumamatriz (A,B);
       
    }
    public static int insertartamaño(){
        Scanner keyboard = new Scanner (System.in);
        boolean flag;
        int A = 0;
        do{
            try{
                System.out.println("Ingresa tamaño del arreglo: ");
                A = keyboard.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println("ERROR");
                keyboard.next();
                flag = true;
            }
        }
        while (flag);
        return A;
    }
    public static int solicitarentero(){
        Scanner keyboard = new Scanner (System.in);
        boolean flag;
        int A = 0;
        do{
            try{
                System.out.println("Ingresa un entero: ");
                A= keyboard.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println("Error");
                keyboard.next();
                flag = true;
            }
        }
        while (flag);
        return A;
    }
    public static int [][] arreglo (String A, int tamaño){
        int [][]arreglo = new int [tamaño][tamaño];
        System.out.println("Arreglo: " + A);
        for (int i = 0; i < arreglo.length; i++){
        for (int j = 0; j < arreglo[i].length; j++){
        arreglo [i][j] = solicitarentero();
        }
        }
        return arreglo;
    }
    //realizar la suma de matrices en un metodo
    
    public static int [][] sumamatriz (int [][]A, int[][]B){
        int [][] R = new int [A.length] [A.length];
        System.out.println("Suma: ");
        for (int i = 0; i < A.length; i++){
        for (int j = 0; j < A[i].length; j++){
        R[i][j] = A[i][j] + B[i][j];
        System.out.println("["+R[i][j]+"]");   
    }
        System.out.println("");   
    }
        return R; 
    }
    
    
}