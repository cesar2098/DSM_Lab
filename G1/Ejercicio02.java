/*Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.*/

import java.util.Scanner;
public class Main{
  public static void main(String[] ar){
    Scanner teclado = new Scanner(System.in);
    int cont = 1, mayores = 0, menores = 0;
    float nota, suma = 0, promedio;

    while (cont <= 10){
      System.out.println("Ingrese la nota: "+cont);
      nota = teclado.nextFloat();
      suma = suma + nota;
      if(nota>=7){
        mayores++;
      }
      else{
        menores++;
      }
      cont++;
    }

    promedio = suma / 10;
    System.out.print("El promedio del alumno es:");
    System.out.println(promedio);
    System.out.print("El alumno tiene notas mayores:");
    System.out.println(mayores);
    System.out.print("El alumno tiene notas menores:");
    System.out.println(menores);
  }
}