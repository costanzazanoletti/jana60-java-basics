package jsnacks;

import java.util.Random;

/*
 * Generatore di “nomi cognomi” casuali: prendendo una lista di nomi e una lista di cognomi, genera
 * una falsa lista di 3 invitati.
 */
public class JSnack3 {

  public static void main(String[] args) {
    Random rand = new Random();
    // lista di nomi
    String[] nomi = {"Mario", "Emma", "Piero", "Giulia", "Martina", "Alessandro"};
    // lista di cognomi
    String[] cognomi = {"Bianchi", "Rossi", "Gnonto", "Marrone", "Verdi"};

    // lista di invitati
    String[] fake = new String[3];

    // in ogni posizione della lista metto un nome fake
    for (int i = 0; i < fake.length; i++) {
      // ad ogni iterazione creo un nome fake
      // creo un indice casuale tra 0 e la lunghezza dell'array nomi
      int index = rand.nextInt(nomi.length);
      // prendo l'elemento dell'array nomi
      String nomeCasuale = nomi[index];
      // genero un indice casuale tra 0 e la lunghezza dell'array cognomi
      index = rand.nextInt(cognomi.length);
      // prendo l'elemento dell'array cognomi
      String cognomeCasuale = cognomi[index];

      // metto il nome fake alla posizione corrente
      fake[i] = nomeCasuale + " " + cognomeCasuale;
      System.out.println(fake[i]);
    }

  }

}
