package jana60.loops;

public class StampaNumeriPari {

  public static void main(String[] args) {
    // Per i numeri naturali fino a 100 stampa solo i numeri pari
    // e somma i numeri dispari

    int sommaDispari = 0;

    for (int i = 0; i <= 100; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      } else {
        sommaDispari += i; // sommaDispari = sommaDispari + i;
      }
    }

    int j = 0;
    for (int i = 0; i <= 100; i += 2) {
      System.out.println(i);
      if (i < 100) {
        j = i + 1;
        // System.out.println(j);
        sommaDispari += j;
      }
    }

    System.out.println("somma dispari " + sommaDispari);

  }

}
