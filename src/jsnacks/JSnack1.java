package jsnacks;

import java.util.Scanner;

/*
 * Il software deve chiedere per 5 volte all’utente di inserire un numero. Il programma stampa la
 * somma di tutti i numeri inseriti. Esegui questo programma in due versioni, con il for e con il
 * while.
 */
public class JSnack1 {

  public static void main(String[] args) {
    // chiedere all'utente per 5 volte un numero
    Scanner scan = new Scanner(System.in);

    int sum = 0;

    // for (int i = 0; i < 5; i++) {
    // System.out.print("Dimmi un numero: ");
    // sum += scan.nextInt();
    // }

    int count = 0;
    while (count < 5) {
      System.out.print("Dimmi un numero: ");
      sum += scan.nextInt();
      count++;
    }

    System.out.println("La somma è " + sum);
    scan.close();
  }

}
