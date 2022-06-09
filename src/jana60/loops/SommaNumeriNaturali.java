package jana60.loops;

public class SommaNumeriNaturali {

  public static void main(String[] args) {
    // Stampiamo a video la somma dei primi 10 numeri naturali

    int somma = 0;

    for (int i = 1; i < 11; i++) {
      System.out.println(i);
      somma = somma + i; // somma = 1 + 2
      System.out.println("Somma corrente " + somma);
    }

    System.out.println("La somma dei primi 10 numeri è " + somma);

  }

}
