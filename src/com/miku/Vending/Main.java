package com.miku.Vending;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        // write your code here

        boolean running = true;

        Scanner scan = new Scanner(System.in);
        String input = "";
        //Arrays
        String[] commands = {"yes", "no", "help"};
        String[] orders = {"help", "cola", "fanta", "water", "7up"};
        String[] food = {"help", "twix", "milka", "oreo", "kitkat", "bueno"};

        //String
        String Drinks = "What would you like to drink?";
        String MainQuestion = "Would you like something to drink? Type: ";
        String DrinksWhat = "So what would you like to drink?";
        String FoodQuestion = "Would you like something to eat?";
        String Food= "What would you like to eat?";
        String FoodWhat= "So what would you like to eat?";


        while (running) //running == true
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

                    boolean order = false;
                    while (order == false) {
                        input = scan.nextLine();
                        input = input.toLowerCase();

                        if (input.equals(orders[0])) {
                            order = false;
                            System.out.println(Arrays.toString(orders));
                            System.out.println(DrinksWhat);


                        } else if (input.equals(orders[1])) {
                            order = true;
                            System.out.println("Here is your " + input);
                            System.out.println("         __                              ___   __        .ama     ,\n" +
                                    "      ,d888a                          ,d88888888888ba.  ,88\"I)   d\n" +
                                    "     a88']8i                         a88\".8\"8)   `\"8888:88  \" _a8'\n" +
                                    "   .d8P' PP                        .d8P'.8  d)      \"8:88:baad8P'\n" +
                                    "  ,d8P' ,ama,   .aa,  .ama.g ,mmm  d8P' 8  .8'        88):888P'\n" +
                                    " ,d88' d8[ \"8..a8\"88 ,8I\"88[ I88' d88   ]IaI\"        d8[         \n" +
                                    " a88' dP \"bm8mP8'(8'.8I  8[      d88'    `\"         .88          \n" +
                                    ",88I ]8'  .d'.8     88' ,8' I[  ,88P ,ama    ,ama,  d8[  .ama.g\n" +
                                    "[88' I8, .d' ]8,  ,88B ,d8 aI   (88',88\"8)  d8[ \"8. 88 ,8I\"88[\n" +
                                    "]88  `888P'  `8888\" \"88P\"8m\"    I88 88[ 8[ dP \"bm8m88[.8I  8[\n" +
                                    "]88,          _,,aaaaaa,_       I88 8\"  8 ]P'  .d' 88 88' ,8' I[\n" +
                                    "`888a,.  ,aadd88888888888bma.   )88,  ,]I I8, .d' )88a8B ,d8 aI\n" +
                                    "  \"888888PP\"'        `8\"\"\"\"\"\"8   \"888PP'  `888P'  `88P\"88P\"8m\"");
                            running = false;


                        } else if (input.equals(orders[2])) {
                            order = true;
                            System.out.println("Here is your " + input);
                            System.out.println("───────────────────────────────────\n" +
                                    "─────────█████████████████─────────\n" +
                                    "──────████░░░░░░░░░░░░░░░████──────\n" +
                                    "────███░░░░░░░░░░░░░░░░░░░░░███────\n" +
                                    "───██░░░░░░░░░░░░░░░░░░░░░░░░░██───\n" +
                                    "──██░░░░░░░░▄███▄░░░░░░░░░░░░░░██──\n" +
                                    "─██░░░░░░░▄███████▄░░░░░▄▄░░░░░░██─\n" +
                                    "██░░░░░▄▄███████████░░░▄██▄░░░░░░██\n" +
                                    "█░░░░░░░▀████████▀░░░██████░███▄░░█\n" +
                                    "█░░░▄██▄░░▀▀▀░░░░░░░░░▀███░░░███▄░█\n" +
                                    "█░▄█████░░░░░▀██▄█████░░██░▄█████▌█\n" +
                                    "█░███▀▀░▄██▄░░░██▀░░▀██░██░██░▀██▌█\n" +
                                    "█▐███░░░▀████▄░██░░░░██░██░██░░██▌█\n" +
                                    "█▐███▄░░░░████░██░░░░██░██░▀██▄▐█░█\n" +
                                    "█▐█████░▄█████░██▌░░▐██░██░░░░░░░░█\n" +
                                    "█▐███▀░▄██▀███░██▌░▄███░█░░░░░░░░░█\n" +
                                    "█░███░░██░░▀██░███░▀██▀░░░░░░░░░░░█\n" +
                                    "█░░██░░███▄░▀█░██▀░░░░░░░░░░░░░░░░█\n" +
                                    "██░██░░▀████░▀░░░░░░░░░░░░░░░░░░░██\n" +
                                    "─██░▀░░░░▀▀░░░░░░░░░░░░░░░░░░░░░██─\n" +
                                    "──██░░░░░░░░░░░░░░░░░░░░░░░░░░░██──\n" +
                                    "───██░░░░░░░░░░░░░░░░░░░░░░░░░██───\n" +
                                    "────██░░░░░░░░░░░░░░░░░░░░░░░██────\n" +
                                    "─────███░░░░░░░░░░░░░░░░░░░███─────\n" +
                                    "───────████░░░░░░░░░░░░░████───────\n" +
                                    "──────────███████████████──────────\n" +
                                    "───────────────────────────────────");
                            running = false;


                        } else if (input.equals(orders[3])) {
                            order = true;
                            System.out.println("Here is your " + input);
                            System.out.println("                                ,d                          \n" +
                                    "                                88                          \n" +
                                    "8b      db      d8 ,adPPYYba, MM88MMM ,adPPYba, 8b,dPPYba,  \n" +
                                    "`8b    d88b    d8' \"\"     `Y8   88   a8P_____88 88P'   \"Y8  \n" +
                                    " `8b  d8'`8b  d8'  ,adPPPPP88   88   8PP\"\"\"\"\"\"\" 88          \n" +
                                    "  `8bd8'  `8bd8'   88,    ,88   88,  \"8b,   ,aa 88          \n" +
                                    "    YP      YP     `\"8bbdP\"Y8   \"Y888 `\"Ybbd8\"' 88   ");
                            running = false;


                        } else if (input.equals(orders[4])) {
                            order = true;
                            System.out.println("Here is your " + input);
                            System.out.println("11111111111111111111111111111111¶¶¶¶¶1 \n" +
                                    "1111111111111111111111111111111¶1__1¶¶¶ \n" +
                                    "111111111111111111111111111111¶1_____1¶¶ \n" +
                                    "11111111111111111111111111111¶1_111___1¶¶ \n" +
                                    "1111111111111111111111111111¶1_1¶¶¶11_1¶¶ \n" +
                                    "111111111111111111111111111¶1___1¶¶¶¶_1¶¶ \n" +
                                    "11111111111111111111111111¶1______1¶¶_1¶¶ \n" +
                                    "1111111111111111111111111¶¶¶11______1_¶¶¶¶¶¶¶\n" +
                                    "11111111111111¶111111111¶¶¶¶¶111______¶¶¶¶¶¶¶\n" +
                                    "1111111111111¶¶¶1111111¶¶___¶¶¶11______1¶¶¶¶¶\n" +
                                    "11111111111¶¶¶¶¶¶11111¶¶_____1¶¶¶11______1¶¶\n" +
                                    "1111111111¶¶___¶¶1111¶¶11______¶¶¶¶11___1¶¶¶\n" +
                                    "111111111¶¶____1¶¶11¶¶¶¶111______¶¶¶11_1¶¶¶\n" +
                                    "11111111¶¶______1¶¶¶1_1¶¶111______1¶¶¶1¶¶¶\n" +
                                    "1111111¶¶________1¶1____¶¶¶111______11¶¶¶\n" +
                                    "111111¶¶________11_______1¶¶¶11______¶¶¶\n" +
                                    "11111¶¶_________1¶¶1_______¶¶¶¶¶___1¶¶¶\n" +
                                    "1111¶¶__________¶¶¶¶¶1_______¶¶1_¶1¶¶¶\n" +
                                    "111¶¶1_________1¶¶¶¶¶¶¶1_________1¶¶¶\n" +
                                    "11¶¶1______¶¶1_1¶¶¶¶¶¶¶¶1________1¶¶\n" +
                                    "1¶¶1______¶¶¶¶_1¶¶¶¶¶¶¶¶¶¶1_____¶¶¶¶\n" +
                                    "1¶¶______¶¶¶1¶¶_1¶¶¶¶¶¶¶¶¶¶¶111¶¶¶¶¶\n" +
                                    "1¶¶_____¶¶¶111¶¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                                    "1¶¶____1¶¶11111¶¶_1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                                    "11¶¶___¶¶1111111¶¶_11¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                                    "111¶¶_1¶¶11111111¶¶____¶¶¶¶¶¶¶\n" +
                                    "1111¶¶1¶¶111111111¶¶_______¶¶¶¶\n" +
                                    "11111¶¶¶1111111111¶¶________¶¶¶¶\n" +
                                    "111111¶¶11111111111¶¶_________¶¶¶¶¶\n" +
                                    "11111111111111111111¶¶__________¶¶¶\n" +
                                    "111111111111111111111¶¶________¶¶¶\n" +
                                    "1111111111111111111111¶¶______¶¶¶\n" +
                                    "1111111111111111111111¶¶_____¶¶¶\n" +
                                    "11111111111111111111111¶¶___¶¶¶\n" +
                                    "111111111111111111111111¶¶_¶¶¶\n" +
                                    "1111111111111111111111111¶¶¶¶");
                            running = false;


                        }
                    }


                } else if (input.equals(commands[1])) {
                    geldigeInput = true;
                    System.out.println(FoodQuestion);

                    boolean foodOrder = false;
                    while (foodOrder == false) {
                        input = scan.nextLine();
                        input = input.toLowerCase();
                        if (input.equals(commands[0])) {
                            foodOrder = true;
                            System.out.println("NULL");
                            System.out.println(FoodWhat);
                        } else if (input.equals(food[1])) {
                            System.out.println("Here is your " + input);

                        }
                    }




                } else if (input.equals(commands[2])) {
                    System.out.println(Arrays.toString(commands));
                    geldigeInput = false;


                }


            }

        }
    }
}