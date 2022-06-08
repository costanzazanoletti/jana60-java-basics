package jana60.games;

import java.util.Random;
import java.util.Scanner;

public class PariDispari {

  public static void main(String[] args) {
    // utente sceglie pari o dispari
    // utente sceglie un numero da 0 a 5
    // computer estrae un numero random da 0 a 5
    // si sommano i numeri
    // se la somma è pari: se utente ha scelto pari -> utente vince, altrimenti vince computer
    // se la somma è dispari: se utente ha scelto dispari -> utente vince, altrimenti vince computer

    Scanner scan = new Scanner(System.in);

    boolean sceltaUtentePari;
    boolean puoiProcedere = true;

    // utente sceglie pari o dispari
    System.out.println("Scegli pari o dispari?");
    String scelta = scan.nextLine();

    // scelta è uguale a "pari"?
    if (scelta.equalsIgnoreCase("pari")) {
      sceltaUtentePari = true;
    } else if (scelta.equalsIgnoreCase("dispari")) {
      sceltaUtentePari = false;
    } else {
      System.out.println("Scelta non valida");
      puoiProcedere = false;
      sceltaUtentePari = false;
    }

    if (puoiProcedere) {
      // Utente tira un numero tra 0 e 5
      System.out.println("Procediamo");
      System.out.println("Tira un numero tra 0 e 5");
      int numeroUtente = scan.nextInt();



      // se il numero è valido procedo
      if (numeroUtente >= 0 && numeroUtente <= 5) {
        // Computer tira un numero tra 0 e 5
        Random randomGenerator = new Random();
        int numeroComputer = randomGenerator.nextInt(6);
        System.out.print("Hai scelto " + numeroUtente);
        System.out.println(" e computer ha scelto " + numeroComputer);
        // Sommo i due numeri
        int somma = numeroUtente + numeroComputer;
        if ((somma % 2) == 0) { // somma pari
          if (sceltaUtentePari) {
            System.out.println("Hai vinto");
          } else {
            System.out.println("Ha vinto il computer");
          }
        } else { // somma dispari
          if (!sceltaUtentePari) {
            System.out.println("Hai vinto");
          } else {
            System.out.println("Ha vinto il computer");
          }
        }
      }
      // se il numero non è valido mando un messaggio di errore
      else {
        System.out.println("Numero non valido");
      }

    }

    // chiudo lo scanner
    scan.close();
  }

}
