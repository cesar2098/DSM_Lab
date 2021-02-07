/*Crear un programa en consola que me permita saber si dos números son divisibles entre sí, para saber si un número es divisible por otro se tiene que obtener el modulo y si este es cero entonces este número es divisible por el otro.*/

import java.util.Scanner;
public class Main{
  public static void main(String[] ar){
    double num1, num2, resultado;

    Scanner in = new Scanner(System.in);

    System.out.println("Ingrese el primer número");
    num1 = in.nextDouble();
    System.out.println("Ingrese el segundo número");
    num2 = in.nextDouble();

    resultado = num1 % num2;

    if(resultado == 0){
      System.out.println("El numero es divisible");
    }
    else{
      System.out.println("El numero no es divisible");
    }
  }
}