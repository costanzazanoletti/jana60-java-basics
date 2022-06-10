package jana60.array;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
  /*
   * Generiamo un array di 10 numeri casuali, compresi tra 1 e 100 Chiediamo all'utente di dirci un
   * numero (compreso tra 1 e 100) e verifichiamo se il numero è presente nell'array oppure no
   */

  public static void main(String[] args) {

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    // creo array di 10 numeri
    int[] numeri = new int[10];

    // assegno il valore alle posizioni dell'array
    for (int i = 0; i < numeri.length; i++) {
      numeri[i] = rand.nextInt(100) + 1; // random compreso tra 1 e 100
    }

    // chiedo all'utente un numero da 1 a 100
    int sceltaUtente;
    do {
      System.out.print("Dimmi un numero tra 1 e 100: ");
      sceltaUtente = scan.nextInt();
    } while (sceltaUtente < 1 || sceltaUtente > 100);

    // verifico se la scelta utente è presente nell'array
    // boolean trovato = false;
    // int counter = 0;
    // while (trovato == false && counter < numeri.length) {
    // if (numeri[counter] == sceltaUtente) {
    // trovato = true;
    // System.out.println("Hai vinto");
    // } else {
    // counter++;
    // }
    // }
    //
    // if (!trovato) {
    // System.out.println("Hai perso!");
    // }

    boolean trovato = false;
    for (int i = 0; i < numeri.length; i++) {
      if (numeri[i] == sceltaUtente) {
        System.out.println("Hai vinto");
        trovato = true;
      }
    }

    if (!trovato) {
      System.out.println("Hai perso");
    }

  }
}
