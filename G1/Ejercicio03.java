/*Desarrollar un programa que permita cargar n números enteros y luego nos informe cuántos valores fueron pares y cuántos impares.*/

import java.util.Scanner;
public class Main{
  public static void main(String[] ar){
    Scanner teclado = new Scanner(System.in);
    
    int n, cont = 1, numero, par = 0, impar = 0;

    System.out.println("Cantidad de números a ingresar ");
    n = teclado.nextInt();

    while(cont <= n){
      System.out.println("Ingrese el número: "+cont);
      numero = teclado.nextInt();

      if(numero % 2 == 0)
      {
        par++;
      }
      else{impar++;}
      cont++;
    }
    System.out.print("Números pares:");
    System.out.println(par);

    System.out.print("Números impares:");
    System.out.println(impar);
  }
}