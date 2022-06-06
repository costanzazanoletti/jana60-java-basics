package jana60;

public class SistemiOperativi {

  public static void main(String[] args) {
    int macUsers = 3;
    int windowsUsers = 20;

    // double macUsers = 3.0;
    // double windowsUsers = 20.0;

    System.out.println("MAC Users: " + macUsers);
    System.out.println("Windows Users: " + windowsUsers);

    int totaleUtenti = macUsers + windowsUsers;
    // double totaleUtenti = macUsers + windowsUsers;

    System.out.println("Totale: " + totaleUtenti);

    double percMac = (double) macUsers * 100.0 / (double) totaleUtenti;
    double percWindows = (double) windowsUsers * 100.0 / (double) totaleUtenti;

    System.out.println("Percentuale Mac: " + percMac);
    System.out.println("Percentuale Windows: " + percWindows);
  }

}
