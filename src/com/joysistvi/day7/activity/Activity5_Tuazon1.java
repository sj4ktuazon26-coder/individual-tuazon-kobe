package com.joysistvi.day7.activity;

import java.util.Scanner;

public class Activity5_Tuazon1 {
  public static void main(String[] args) {
    loadInit();
    Scanner scanner = new Scanner(System.in);

    while(true) {
      System.out.println("Dial *143# to access Globe Services");

      System.out.print("Enter USSD Code: ");
      String ussd_code = scanner.nextLine();

      if(!ussd_code.equals("*143#")) {
        showError("Invalid USSD Code. Try again.");
        continue;
      }

      System.out.println();

      System.out.println("* Load Registration *");
      System.out.println("[1] Go+");
      System.out.println("[2] Go");
      System.out.println("[3] GoEXTRA");
      System.out.println("[4] UNLI 5G");
      System.out.println("[5] ALLNET");
      System.out.print("Enter a choice: ");

      System.out.println();

      System.out.println("*** Go+ Promos ***");
      System.out.println("[1] Go+99");
      System.out.println("[2] Go+129");
      System.out.println("[3] Go+149");
      System.out.print("Enter a choice: ");

      System.out.println();

      System.out.println("*** Go+99 Promo ***");
      System.out.println("-> Get 8 GB for all sites + 8GB");
      System.out.println("[1] Subscribe");
      System.out.println("[2] Exit");
      System.out.print("Enter a choice: ");

      break;
    }

    scanner.close();
  }

  private static void loadInit() {

  }

  private static void showError(String err_mess) {
    System.out.println("Error: " + err_mess);
  }
}
