package jana60.loops;

public class EsempiCicloFor {

  public static void main(String[] args) {
    int variabile;
    // stampare i primi 10 numeri naturali (da 1 a 10)
    // for (int i = 1; i <= 10; i++) {
    // System.out.println(i);
    // }

    // for (int i = 0; i < 10; i++) {
    // System.out.print("iterazione " + i);
    // int numero = i + 1;
    // System.out.println(" - numero " + numero);
    // }



    // incrementare il contatore di 2
    // for (int i = 1; i <= 10; i = i + 2) {
    // System.out.println(i);
    // }

    boolean flag = true;
    for (int i = 10; (i >= 0 && flag == true); i--) {
      System.out.println(i);
      if (i == 3) {
        flag = false;
      }
    }
  }

}
