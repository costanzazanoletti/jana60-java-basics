package jana60;

import java.util.Scanner;

public class CompareAge {

  public static void main(String[] args) {
    /*
     * chiedere all'utente gli anni di due persone e comunicare quale delle due è più grande
     */

    int agePerson1;
    int agePerson2;
    Scanner scan = new Scanner(System.in);

    System.out.print("Inserisci età persona 1: ");
    agePerson1 = scan.nextInt();
    System.out.print("Inserisci età persona 2: ");
    agePerson2 = scan.nextInt();

    System.out.println("Età persona 1: " + agePerson1);
    System.out.println("Età persona 2: " + agePerson2);

    if (agePerson1 >= 0 && agePerson2 >= 0) {
      // persona 1 più grande
      if (agePerson1 > agePerson2) {
        System.out.println("persona 1 è più grande");
      } else if (agePerson1 < agePerson2) { // persona 2 più grande
        System.out.println("persona 2 è più grande");
      } else { // in tutti gli altri casi, cioè se sono uguali
        System.out.println("hanno la stessa età");
      }
    } else {
      System.out.println("Il valore dell'età non può essere negativo. Riprova.");
    }
    /*
     * casi di test: 1) persona1 25 anni, persona2 30 anni 2) persona1 30 anni, persona2 12 anni 3)
     * persona1 25 anni, persona2 25 anni
     */
    scan.close();
  }

}
