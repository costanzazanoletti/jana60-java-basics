package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // lista invitati
    String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
        "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

    // chiedo all'utente il nome
    System.out.print("Your name please: ");
    String input = scan.nextLine();

    // verifico se il nome è presente o no
    boolean found = false;
    // for (int i = 0; i < guests.length && !found; i++) {
    // System.out.println(guests[i]);
    // if (input.equalsIgnoreCase(guests[i])) {
    // found = true;
    // // break;
    // }
    // }
    int counter = 0;
    while (counter < guests.length && !found) {

      if (input.equalsIgnoreCase(guests[counter])) {
        found = true;
      }

      counter++;
    }

    // do un feedback all'utente
    if (found) {
      System.out.println("You're welcome");
    } else {
      System.out.println("You're not in the list");
    }

    // chiudo lo scanner
    scan.close();
  }

}
