/*Escribir un programa que pida ingresar coordenadas (x,y) que representan puntos en el plano.
Informar cuántos puntos se han ingresado en el primer, segundo, tercer y cuarto cuadrante. Al comenzar el programa se pide que se ingrese la cantidad de puntos a procesar.*/

import java.util.Scanner;
public class Main{
  public static void main(String[] ar){
    Scanner teclado = new Scanner(System.in);
    
    int coordenada1, coordenada2, n, cont = 1;
    int plano1 = 0, plano2 = 0, plano3 = 0, plano4 = 0;

    System.out.println("Cantidad de coordenadas a ingresar ");
    n = teclado.nextInt();

    while(cont <= n){
      System.out.println("Ingrese coordenada "+cont+" en X");
      coordenada1 = teclado.nextInt();

      System.out.println("Ingrese coordenada "+cont+" en Y");
      coordenada2 = teclado.nextInt();
      
      if(coordenada1 > 0 && coordenada2 > 0) {plano1++;}
      if(coordenada1 < 0 && coordenada2 > 0){plano2++;}
      if(coordenada1 < 0 && coordenada2 < 0){plano3++;}
      if(coordenada1 > 0 && coordenada2 < 0){plano4++;}

      cont++;
    }


    System.out.print("Cantidad de coordenadas en el cuadrante 1: ");
    System.out.println(plano1);

    System.out.print("Cantidad de coordenadas en el cuadrante 2: ");
    System.out.println(plano2);

    System.out.print("Cantidad de coordenadas en el cuadrante 3: ");
    System.out.println(plano3);

    System.out.print("Cantidad de coordenadas en el cuadrante 4: ");
    System.out.println(plano4);
  }
}