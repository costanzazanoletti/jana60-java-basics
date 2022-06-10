package jana60.array;

public class GiorniSettimana {

  public static void main(String[] args) {

    // String[] giorniSettimana = {"Lun","Mar","Mer","Gio","Ven","Sab","Dom"};

    String[] giorniSettimana = new String[7];

    giorniSettimana[0] = "Lun";
    giorniSettimana[1] = "Mar";
    giorniSettimana[2] = "Mer";
    giorniSettimana[3] = "Gio";
    giorniSettimana[4] = "Ven";
    giorniSettimana[5] = "Sab";
    giorniSettimana[6] = "Dom";

    int totaleGiorni = giorniSettimana.length;

    System.out.println("I giorni della settimana sono: " + totaleGiorni);
    System.out.println("Il primo giorno della settimana è: " + giorniSettimana[0]);
    System.out.println("L'ultimo giorno della settimana è: " + giorniSettimana[totaleGiorni - 1]);

    // System.out.println(giorniSettimana[0]);
    // System.out.println(giorniSettimana[1]);
    // System.out.println(giorniSettimana[2]);
    // System.out.println(giorniSettimana[3]);
    // System.out.println(giorniSettimana[4]);
    // System.out.println(giorniSettimana[5]);
    // System.out.println(giorniSettimana[6]);

    for (int index = 0; index < giorniSettimana.length; index++) {
      System.out.println(giorniSettimana[index]);
    }

    // System.out.println("Finito");


  }

}
