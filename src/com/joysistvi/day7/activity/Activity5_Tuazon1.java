package com.joysistvi.day7.activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Activity5_Tuazon1 {
  public static void main(String[] args) {
    final List<Load> LOADS = loadInit();
    Scanner scanner = new Scanner(System.in);
    int input = 0;
    int load = 0;
    int loadmenu = 0;

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
      for(int i = 0; i < LOADS.size(); i++) {
        System.out.println("[" + (i+1) + "] " + LOADS.get(i).getName());
      }
      System.out.print("Enter a choice: ");
      input = scanner.nextInt();

      if(input > LOADS.size() || input < 1) {
        showError("Invalid Choice.\nTerminating...");
        break;
      }

      load = input;

      System.out.println();

      System.out.println("*** " + LOADS.get(load).getName() + " Promos ***");
      for(int i = 0; i <= LOADS.get(load).getLoadMenus().size(); i++) {
        System.out.println("[" + (i+1) + "] " + LOADS.get(load).getLoadMenus().get(i).getName());
      }
      System.out.print("Enter a choice: ");
      input = scanner.nextInt();

      if(input > LOADS.get(load).getLoadMenus().size() || input < 1) {
        showError("Invalid Choice.\nTerminating...");
        break;
      }

      loadmenu = input;

      System.out.println();

      System.out.println("*** " + LOADS.get(load).getLoadMenus().get(loadmenu).getName() + " Promo ***");
      System.out.println("-> " + LOADS.get(load).getLoadMenus().get(loadmenu).getDescription());
      System.out.println("[1] Subscribe");
      System.out.println("[2] Exit");
      System.out.print("Enter a choice: ");
      input = scanner.nextInt();

      if(input == 2) {
        System.out.println("You are now subscribed to " + LOADS.get(load).getLoadMenus().get(loadmenu).getName());
      } else if(input == 1) {
        System.out.println("Exiting...");
      } else {
        showError("Invalid Choice.\nTerminating...");
      }

      break;
    }

    scanner.close();
  }

  private static List<Load> loadInit() {
    List<Load> loads = new ArrayList<>();

    List<LoadMenu> go_plus_loadmenus = new ArrayList<>();
    go_plus_loadmenus.add(new LoadMenu("Go+99", "Get 8 GB for all sites + 8GB"));
    go_plus_loadmenus.add(new LoadMenu("Go+129", "Get 8 GB for all sites + 8GB"));
    go_plus_loadmenus.add(new LoadMenu("Go+149", "Get 8 GB for all sites + 8GB"));

    List<LoadMenu> go_loadmenus = new ArrayList<>();
    go_loadmenus.add(new LoadMenu("Go50", "Get 8 GB for all sites + 8GB"));
    go_loadmenus.add(new LoadMenu("Go90", "Get 8 GB for all sites + 8GB"));
    go_loadmenus.add(new LoadMenu("Go120", "Get 8 GB for all sites + 8GB"));

    List<LoadMenu> go_extra_loadmenus = new ArrayList<>();
    go_extra_loadmenus.add(new LoadMenu("GoEXTRA99", "Get 8 GB for all sites + 8GB"));
    go_extra_loadmenus.add(new LoadMenu("GoEXTRA129", "Get 8 GB for all sites + 8GB"));
    go_extra_loadmenus.add(new LoadMenu("GoEXTRA149", "Get 8 GB for all sites + 8GB"));

    List<LoadMenu> unli_5g_loadmenus = new ArrayList<>();
    unli_5g_loadmenus.add(new LoadMenu("UNLI 5G 99", "Get 8 GB for all sites + 8GB"));
    unli_5g_loadmenus.add(new LoadMenu("UNLI 5G 149", "Get 8 GB for all sites + 8GB"));
    unli_5g_loadmenus.add(new LoadMenu("UNLI 5G 199", "Get 8 GB for all sites + 8GB"));

    List<LoadMenu> allnet_loadmenus = new ArrayList<>();
    allnet_loadmenus.add(new LoadMenu("ALLNET99", "Get 8 GB for all sites + 8GB"));
    allnet_loadmenus.add(new LoadMenu("ALLNET149", "Get 8 GB for all sites + 8GB"));
    allnet_loadmenus.add(new LoadMenu("ALLNET199", "Get 8 GB for all sites + 8GB"));

    loads.add(new Load("Go+", go_plus_loadmenus));
    loads.add(new Load("Go", go_loadmenus));
    loads.add(new Load("GoEXTRA", go_extra_loadmenus));
    loads.add(new Load("UNLI 5G", unli_5g_loadmenus));
    loads.add(new Load("ALLNET", allnet_loadmenus));

    return loads;
  }

  private static void showError(String err_mess) {
    System.out.println("Error: " + err_mess);
  }
}

class Load {
  private String name;
  private List<LoadMenu> loadMenus;

  public Load(String name, List<LoadMenu> loadMenus) {
    this.name = name;
    this.loadMenus = loadMenus;
  }

  public String getName() { return name; }
  public List<LoadMenu> getLoadMenus() { return loadMenus; }
}

class LoadMenu {
  private String name;
  private String description;

  public LoadMenu(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public String getName() { return name; }
  public String getDescription() { return description; }
}