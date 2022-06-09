package jana60.loops;

import java.util.Scanner;

public class SommaNumeriNaturali {

  public static void main(String[] args) {
    // Stampiamo a video la somma dei primi x numeri naturali
    // dove x ce lo dice l'utente

    Scanner scan = new Scanner(System.in);
    System.out.print("Inserisci fino a quale numero (al massimo 100): ");

    int numeri = scan.nextInt();

    if (numeri <= 100 && numeri > 0) {
      int somma = 0;
      for (int i = 1; i <= numeri; i++) {
        System.out.println(i);
        somma = somma + i; // somma = 1 + 2
        // System.out.println("Somma corrente " + somma);
      }
      System.out.println("La somma dei primi " + numeri + " numeri è " + somma);
    } else {
      System.out.println("Valore non valido: deve essere compreso tra 1 e 100!");
    }

    scan.close();
  }

}
