package jana60;

public class BookStore {

  public static void main(String[] args) {
    // titolo
    String titolo = "9 algoritmi che hanno cambiato il futuro";
    String etichetta = "Titolo";

    System.out.println(etichetta + ": " + titolo);


    // formato
    boolean copertinaFlessibile = true;
    boolean formatoKindle = false;
    // data di pubblicazione
    short giornoPubblicazione = 1;
    short mesePubblicazione = 11;
    int annoPubblicazione = 2012;

    // autore
    String autore = "John McCormick";

    // rating
    float rating = 4.3f;
    int numeroDiVoti = 23;

    // descrizione
    String descrizione =
        "Quotidianamente, senza pensarci troppo, con i nostri strumenti tecnologici (potenti computer o eleganti dispositivi mobili), facciamo cose che possiamo definire straordinarie";

    // prezzo
    double prezzoFinale = 17.10;
    double prezzoConsigliato = 18.00;
    // String sconto = "5%";
    double sconto = 0.05;
    double scontoSulPrezzo = prezzoConsigliato * sconto;
    double prezzoFinaleScontato = prezzoConsigliato - scontoSulPrezzo;

    System.out.println("Prezzo consigliato: " + prezzoConsigliato + " euro");
    System.out.println("Scontato del " + sconto * 100 + "%");
    System.out.println("Meno " + scontoSulPrezzo + " euro");
    System.out.println("Prezzo finale: " + prezzoFinaleScontato + " euro");

    // ISBN
    String isbn = "978-8838787997";

    // dimensioni
    float altezza = 21.0f;
    float larghezza = 13.7f;
    float spessore = 1.7f;
    String dimensioniString = "Dimensioni: " + altezza + "x" + larghezza + "x" + spessore + "cm";
    System.out.println(dimensioniString);

  }

}

