package jsnacks;

import java.util.Scanner;

/*
 * La distanza di Hamming tra due stringhe di uguale lunghezza è il numero di posizioni nelle quali
 * i caratteri corrispondenti sono diversi. Chiedi all'utente di dirti due parole e stampa la
 * distanza di Hamming.
 * 
 * 
 */
public class JSnack5 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String parola1;
    String parola2;
    // chiedo all'utente due parole di uguale lunghezza
    System.out.println("Inserisci due parole di uguale lunghezza");
    do {
      System.out.print("Parola 1: ");
      parola1 = scanner.nextLine();
      System.out.print("Parola 2: ");
      parola2 = scanner.nextLine();
      if (parola1.length() != parola2.length()) {
        System.out.println("Hanno lunghezza diversa. Riprova");
      }
    } while (parola1.length() != parola2.length());

    // verifico se sono lunghe uguali
    // if (parola1.length() == parola2.length()) {

    // dichiaro il contatore per la distanza di Hamming
    int distanzaHamming = 0;

    // converto le stringhe in array di caratteri
    char[] parola1Array = parola1.toCharArray();
    char[] parola2Array = parola2.toCharArray();

    // itero sugli array di caratteri e li confronto uno a uno
    for (int i = 0; i < parola1Array.length; i++) {
      if (parola1Array[i] != parola2Array[i]) {
        distanzaHamming++;
      }
    }

    System.out.println("La distanza di Hamming tra le due parole è " + distanzaHamming);


    // } else {
    // System.out.println(
    // "Le parole sono di lunghezza diversa. Non posso calcolare la distanza di Hamming");
    // }


    scanner.close();
  }

}
