package jana60.biglietteria;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Il programma dovrà chiedere all’utente il numero di chilometri che vuole percorrere e l’età del
 * passeggero. Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio,
 * secondo queste regole: il prezzo del biglietto è definito in base ai km (0.21 € al km) va
 * applicato uno sconto del 20% per i minorenni va applicato uno sconto del 40% per gli over 65
 */
public class CalcolaBiglietto {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    DecimalFormat df = new DecimalFormat("#0.00€");

    // costanti
    double costoAlKm = 0.21;
    double percScontoMinorenni = 0.20;
    double percScontoOver65 = 0.40;

    // variabili
    int etaPasseggero;
    double kmDaPercorrere;


    System.out.print("Inserire l'età del passeggero: ");
    etaPasseggero = scanner.nextInt();

    System.out.print("Inserire il numero di km: ");
    kmDaPercorrere = scanner.nextDouble();

    // calcolo del prezzo base
    double prezzoBase = costoAlKm * kmDaPercorrere;
    double prezzoFinale = prezzoBase;

    // calcolo dello sconto
    if (etaPasseggero < 18) {
      double scontoMinorenni = prezzoBase * percScontoMinorenni;
      prezzoFinale = prezzoBase - scontoMinorenni;
      System.out.println("Hai diritto allo sconto minorenni");
    } else if (etaPasseggero >= 65) {
      double scontoOver65 = prezzoBase * percScontoOver65;
      prezzoFinale = prezzoBase - scontoOver65;
      System.out.println("Hai diritto allo sconto over 65");
    }

    System.out.println("Il prezzo del biglietto è: " + df.format(prezzoFinale));

    // chiudo lo scanner
    scanner.close();
  }

}
