package jana60.games;

import java.util.Scanner;

/*
 * Scrivi un programma che stampi i numeri da 1 a 100, ma per i multipli di 3 stampi Fizz al posto
 * del numero e per i multipli di 5 stampi Buzz. Per i numeri che sono sia multipli di 3 che di 5
 * stampi FizzBuzz
 */
public class FizzBuzz {

  public static void main(String[] args) {
    // stampare numeri da 1 a 100 -> ciclo for
    // e per ogni numero:
    // - se il numero è multiplo di 3 stampo Fizz -> %3
    // - invece se il numero è multiplo di 5 stampo Buzz -> %5
    // - invece se il numero è multiplo sia di 3 che di 5 stampo FizzBuzz

    Scanner scanner = new Scanner(System.in);

    //
    // int numero = 0;
    //
    //
    // while (numero < 1 || numero > 200) {
    // System.out.print("Inserisci un numero tra 1 e 200: ");
    // numero = scanner.nextInt();
    // if (numero < 1 || numero > 200) {
    // System.out.println("Numero non valido");
    // }
    //
    // }

    int numero;

    do {
      System.out.println("Inserisci un numero tra 1 e 200");
      numero = scanner.nextInt();
      if (numero < 1 || numero > 200) {
        System.out.println("Numero non valido");
      }
    } while (numero < 1 || numero > 200);



    for (int i = 1; i <= numero; i++) {
      if ((i % 3 == 0) && (i % 5 == 0)) {
        System.out.println("FizzBuzz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else {
        System.out.println(i);
      }

    }

    scanner.close();

  }

}
