package jsnacks;

import java.util.Scanner;

/*
 * Chiedi all'utente di inserire un numero, se è pari stampa il numero, se è dispari stampa il
 * numero successivo
 */
public class JSnack2 {

  public static void main(String[] args) {
    // chiedi un numero
    Scanner scan = new Scanner(System.in);
    System.out.print("Dimmi un numero: ");
    int num = scan.nextInt();

    // se è pari stampa numero
    if (num % 2 == 0) {
      System.out.println(num);
    } else {// altrimenti stampa numero successivo
      System.out.println(++num);
    }


    scan.close();
  }

}
