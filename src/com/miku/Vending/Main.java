package com.miku.Vending;
import java.util.*;

public class Main {

    static List<Item> items = new ArrayList<>();

    public static void main(String[] args) {
        // write your code here

        boolean VendingMachine = true;

        Scanner scan = new Scanner(System.in);
        String input = "";
        //Arrays
        String[] commands = {"yes", "no", "help"};
        String[] orders = {"help", "cola", "fanta", "water", "7up"};

        //String
        String Drinks = "What would you like to drink?";
        String MainQuestion = "Would you like something to drink? Type: ";


        items.add(new Item("cola", 1.50));
        items.add(new Item("fanta", 1.50));


        while (VendingMachine) //VendingMachine == true
        {

            System.out.println(MainQuestion);

            for (int i = 0; i < commands.length; i++) {
                System.out.println(" - " + commands[i]);
            }

            //INPUT CONTROL:
            boolean geldigeInput = false;
            while (geldigeInput == false) {
                input = scan.nextLine();
                input = input.toLowerCase();

                if (input.equals(commands[0])) {
                    System.out.println(Drinks);
                    geldigeInput = true;

                } else if (input.equals(commands[1])) {
                    geldigeInput = true;
                    VendingMachine = false;
                    System.out.println("chose no");

                } else if (input.equals(commands[2])) {
                    System.out.println(Arrays.toString(commands));
                    geldigeInput = false;


                }
                continue;

            }


            boolean order = false;
            while (order == false) {
                input = scan.nextLine();
                input = input.toLowerCase();

                if (input.equals(orders[0])) {
                    order = false;
                    System.out.println(Arrays.toString(commands));


                } else if (input.equals(orders[1])) {
                    order = true;
                    System.out.println("Here is your " + input);
                    System.out.println("Thanks for ordering " + "NULL");


                } else if (input.equals(orders[2])) {
                    order = true;
                    System.out.println("Here is your " + input);
                    System.out.println("Thanks for ordering " + "NULL");


                } else if (input.equals(orders[3])) {
                    order = true;
                    System.out.println("Here is your " + input);
                    System.out.println("Thanks for ordering " + "NULL");


                } else if (input.equals(orders[4])) {
                    order = true;
                    System.out.println("Here is your " + input);
                    System.out.println("Thanks for ordering " + "NULL");


                }
            }
        }
    }
}