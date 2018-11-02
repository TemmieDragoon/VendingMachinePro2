package com.miku.Vending;
import java.util.*;

public class Main {

    static List<Item> items = new ArrayList<>();

    public static void main(String[] args) {
	// write your code here

        boolean VendingMachine = true;

        Scanner scan = new Scanner(System.in);
        String input = "";

        String[] commands = {"yes", "no", "help", "exit"};

        String[] orders = {"cola", "fanta", "water", "7up"};

        items.add(new Item("cola", 1.50));
        items.add(new Item("fanta", 1.50));


        while ( VendingMachine ) //VendingMachine == true
        {

            System.out.println("Would you like something to drink? Type: ");

            for (int i = 0; i < commands.length; i++) {
                System.out.println(" - " + commands[i]);
            }

            //INPUT CONTROL:
            boolean geldigeInput = false;
            while (geldigeInput == false)
            {
                input = scan.nextLine();
                input = input.toLowerCase();

                for(int i = 0; i < orders.length || i < commands.length; i++)                {
                    if(input.equals(orders[i]) || input.equals(commands[i]))
                    {
                        geldigeInput = true;
                        break; // Breek de huidige loop
                    }
                }
            }




            boolean Order = false;
            if( input.equals( orders[0])) //cola
            {
                if(isItem(input))
                {

                    if (getItem(input) == null) {
                        throw new NullPointerException();
                    }

                    //Order Complete
                    Order = true;
                }
            }
            else if( input.equals( orders[1])) //fanta
            {
                if(isItem(input)) {
                    //Order Complete

                    if (getItem(input) == null) {
                        throw new NullPointerException();
                    }

                    Order = true;
                }

            }
            else if( input.equals( orders[2])) //fanta
            {
                if(isItem(input)) {
                    //Order Complete

                    if (getItem(input) == null) {
                        throw new NullPointerException();
                    }

                    Order = true;
                }

            }
            else if( input.equals( orders[3])) //fanta
            {
                if(isItem(input)) {
                    //Order Complete

                    if (getItem(input) == null) {
                        throw new NullPointerException();
                    }

                    Order = true;
                }

            }
            else
            {
                //exit
                VendingMachine = false;
                continue; //Stopt de verdere code in de loop en gaat verder met de volgende iteratie

            }

            // Eind resultaat tonen

            System.out.println("Here is your " + input);
            System.out.println("Thanks for ordering " + "NULL");

            if(Order) {
                System.out.println("Thanks!");
            }
            else {
                System.out.println("Wrong input try again! Use: " + orders + "as input");
            }


        }

    }

    public static boolean isItem(String name) {
        for (Item item : items) {
            if (item.name.equalsIgnoreCase(name)) {
                return true;
            }
        }

        return false;
    }

    public static Item getItem(String name) {
        for (Item item : items) {
            if (item.name.equalsIgnoreCase(name)) {
                return item;
            }
        }

        return null;
    }
}
