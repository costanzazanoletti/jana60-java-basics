package jsnacks;

import java.util.Arrays;
import java.util.Random;

/*
 * Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
 */
public class JSnack4 {

  public static void main(String[] args) {
    // Creo un Random
    Random rand = new Random();

    // creo un array di 50 elementi
    int[] numeri = new int[50];

    for (int i = 0; i < numeri.length; i++) {
      numeri[i] = rand.nextInt(101);
    }
    System.out.println(Arrays.toString(numeri));

    int somma = 0;
    for (int i = 0; i < numeri.length; i++) {
      // solo se l'indice è dispari somma
      if (i % 2 != 0) {
        somma += numeri[i];
      }
    }

    System.out.println("La somma degli elementi in posizione dispari è " + somma);
  }

}
