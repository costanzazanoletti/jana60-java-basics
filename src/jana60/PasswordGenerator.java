package jana60;

import java.util.Scanner;

public class PasswordGenerator {

  public static void main(String[] args) {
    /*
     * Il programma deve fare quanto segue: salvare in opportune variabili il nome, cognome, colore
     * preferito e data di nascita di un utente suddivisa in giorno, mese e anno in numero generare
     * (e stampare a video) una password concatenando nome, cognome, colore preferito e somma di
     * giorno, mese e anno di nascita, separate dal carattere - Esempio: ho un utente che si chiama
     * Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta
     */

    // String nome = "Pierpaolo";
    // String cognome = "Forcina";
    // String colorePreferito = "blu";
    // int giornoDiNascita = 12;
    // int meseDiNascita = 5;
    // int annoDiNascita = 1994;

    String nome;
    String cognome;
    String colorePreferito;
    int giornoDiNascita;
    int meseDiNascita;
    int annoDiNascita;

    Scanner scan = new Scanner(System.in);

    System.out.print("Inserisci nome: ");
    nome = scan.nextLine();

    System.out.print("Inserisci cognome: ");
    cognome = scan.nextLine();

    System.out.print("Inserisci colore preferito: ");
    colorePreferito = scan.nextLine();

    System.out.print("Inserisci giorno di nascita: ");
    giornoDiNascita = scan.nextInt();

    System.out.print("Inserisci mese di nascita: ");
    meseDiNascita = scan.nextInt();

    System.out.print("Inserisci anno di nascita: ");
    annoDiNascita = scan.nextInt();

    int sommaDataDiNascita = giornoDiNascita + meseDiNascita + annoDiNascita;

    String password = nome + "-" + cognome + "-" + colorePreferito + "-" + sommaDataDiNascita;

    System.out.println(password);


    scan.close();

  }

}
