package jana60;

public class EserciziOperatoriRelazionali {
  public static void main(String[] args) {

    int x = 7;
    int y = 5;

    if (x == y) {
      System.out.println("x uguale a y");
      // altro codice
    } else if (x < y) {
      System.out.println("x minore di y");
    } else {
      System.out.println("x maggiore di y");
    }

    System.out.println("arrivederci");


    if (!(x == y)) {
      System.out.println("x non è uguale a y");
    }

    if (x != y && x > 10) {
      // entro nell'if
    }


  }

}
