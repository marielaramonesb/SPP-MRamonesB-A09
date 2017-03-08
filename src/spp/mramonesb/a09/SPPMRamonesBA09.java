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
int matriz [][]=new int [99][99];
int matrizb [][]=new int [99][99];
Scanner keyboard=new Scanner (System.in);

    
//matriz1
System.out.println("ingresa la primera matriz");
int cont=keyboard.nextInt (); 
System.out.println("ingresa las filas de la primera matriz");
int cont2=keyboard.nextInt (); 
//matriz
for(int x=0;x<=cont;x++)
{
for(int y=0;y<=cont2;y++)
{
System.out.println("ingresa el valor en "+x+","+y);
int valor=keyboard.nextInt (); 
matriz [x][y]=valor;
}
  }

//matriz2
System.out.println("ingresa las columnas de la segunda matriz");
int cont3=keyboard.nextInt (); 
System.out.println("ingresa las filasde la segunda matriz");
int cont4=keyboard.nextInt (); 
//matriz 2
for(int x=0;x<=cont3;x++)
{
for(int y=0;y<=cont4;y++)
{
System.out.println("ingresa el valor en "+x+","+y);
int valor=keyboard.nextInt (); 
matrizb [x][y]=valor;
}
  }
//matriz1
for (int x=0;x<=cont;x++)//imprimiendo con el for
{
for (int y=0;y<=cont2;y++)//imprimiendo con el for
{
System.out.print(matriz[x][y]);
} 
System.out.println("\t");
}
System.out.println("es la matriz A");
//matriz 2 
for (int x=0;x<=cont3;x++)//imprimiendo con el for
{
for (int y=0;y<=cont4;y++)//imprimiendo con el for
{
System.out.print(matrizb[x][y]);
} 
System.out.println("\t");
}
System.out.println("es la matriz B");
//realizando suma de las 
for (int x=0;x<=cont3;x++)//imprimiendo con el for
{
for (int y=0;y<=cont4;y++)//imprimiendo con el for
{
int res=matriz[x][y]+matrizb[x][y];
System.out.print("\t"+res);
}
System.out.println("");
}
System.out.println("\t... es la matriz resultado");
}
}

