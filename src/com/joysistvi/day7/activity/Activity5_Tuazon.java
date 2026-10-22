package com.joysistvi.day7.activity;

import java.util.Scanner;

public class Activity5_Tuazon {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    String ussdCode;

    // 1. Dial the USSD Code
    System.out.println("Dial *143# to access Globe Services");

    do {
      System.out.print("Enter USSD Code: ");
      ussdCode = scanner.nextLine();

      if (!ussdCode.equals("*143#")) {
        System.out.println("Invalid USSD Code. Please try again.\n");
      }

    } while (!ussdCode.equals("*143#"));

    // 2. Display Main Menu
    showMainMenu();
  }

  // Main Menu
  public static void showMainMenu() {

    System.out.println("\n        * Load Registration *");
    System.out.println("    [1] Go+");
    System.out.println("    [2] Go");
    System.out.println("    [3] GoEXTRA");
    System.out.println("    [4] UNLI 5G");
    System.out.println("    [5] ALLNET");
    System.out.print("Enter a choice: ");

    int choice = getChoice();

    switch (choice) {
      case 1:
        showPromoMenu("Go+", new String[]{
          "Go+99", "Go+129", "Go+149"
        });
        break;

      case 2:
        showPromoMenu("Go", new String[]{
          "Go50", "Go90", "Go120"
        });
        break;

      case 3:
        showPromoMenu("GoEXTRA", new String[]{
          "GoEXTRA99", "GoEXTRA129", "GoEXTRA149"
        });
        break;

      case 4:
        showPromoMenu("UNLI 5G", new String[]{
          "UNLI 5G 99", "UNLI 5G 149", "UNLI 5G 199"
        });
        break;

      case 5:
        showPromoMenu("ALLNET", new String[]{
          "ALLNET99", "ALLNET149", "ALLNET199"
        });
        break;

      default:
        System.out.println("Invalid choice. Please restart the program.");
    }
  }

  // Promo Sub-menu
  public static void showPromoMenu(String category, String[] promos) {

    System.out.println("\n        *** " + category + " Promos ***");

    for (int i = 0; i < promos.length; i++) {
      System.out.println("    [" + (i + 1) + "] " + promos[i]);
    }

    System.out.print("Enter a choice: ");

    int choice = getChoice();

    if (choice >= 1 && choice <= promos.length) {
      showPromoDetails(promos[choice - 1]);
    } else {
      System.out.println("Invalid choice. Please restart the program.");
    }
  }

  // Promo Details Menu
  public static void showPromoDetails(String promoName) {

    System.out.println("\n        *** " + promoName + " Promo ***");
    System.out.println("-> Get 8 GB for all sites + 8GB");
    System.out.println("    [1] Subscribe");
    System.out.println("    [2] Exit");
    System.out.print("Enter a choice: ");

    int choice = getChoice();

    switch (choice) {
      case 1:
        System.out.println(
          "\nYou are now subscribed to " + promoName
        );
        break;

      case 2:
        System.out.println("Exiting load registration...");
        break;

      default:
        System.out.println("Invalid choice. Exiting program...");
    }
  }

  // Get and validate numeric input
  public static int getChoice() {

    try {
      return Integer.parseInt(scanner.nextLine());
    } catch (NumberFormatException e) {
      return -1;
    }
  }
}

