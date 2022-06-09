package jana60.loops;

import java.util.Scanner;

public class EsempioWhile {

  public static void main(String[] args) {
    /* chiedi all'utente un numero compreso tra 1 e 100 */

    Scanner scan = new Scanner(System.in);

    // boolean continuaAChiedere = true;

    int numero = 0;

    while (numero <= 0 || numero > 100) {
      System.out.println("Dimmi un numero tra 1 e 100");
      numero = scan.nextInt();

      // if (numero > 0 && numero <= 100) {
      // continuaAChiedere = false;
      // } else {
      // System.out.println("Hai inserito un numero errato");
      // }
    }

    System.out.println("Mi hai dato il numero " + numero);

    scan.close();

  }

}
