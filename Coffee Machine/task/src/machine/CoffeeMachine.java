package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;

        boolean exit = false;

        do {

            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scan.next();

            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String coffeeType = scan.next();

                    switch (coffeeType) {

                        case "1":
                            if (water >= 250 && beans >= 16 && cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 250;
                                beans -= 16;
                                money += 4;
                                cups -= 1;
                            } else if (water <= 250) {
                                System.out.println("Sorry, not enough water!");
                            } else if (beans <= 16) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else if (cups <= 1) {
                                System.out.println("Sorry, not enough cups!");
                            }
                            break;

                        case "2":
                            if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 350;
                                milk -= 75;
                                beans -= 20;
                                money += 7;
                                cups -= 1;
                            } else if (water <= 350) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milk <= 75) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (beans <= 20) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else if (cups <= 1) {
                                System.out.println("Sorry, not enough cups!");
                            }
                            break;

                        case "3":
                            if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 200;
                                milk -= 100;
                                beans -= 12;
                                money += 6;
                                cups -= 1;
                            } else if (water <= 200) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milk <= 100) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (beans <= 12) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else if (cups <= 1) {
                                System.out.println("Sorry, not enough cups!");
                            }
                            break;

                        case "back":
                            break;
                    }
                    break;

                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int waterAdded = scan.nextInt();
                    water += waterAdded;

                    System.out.println("Write how many ml of milk do you want to add:");
                    int milkAdded = scan.nextInt();
                    milk += milkAdded;

                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int beansAdded = scan.nextInt();
                    beans += beansAdded;

                    System.out.println("Write how many cups of coffee do you want to add:");
                    int cupsAdded = scan.nextInt();
                    cups += cupsAdded;
                    break;

                case "take":
                    System.out.printf("I gave you $%d\n", money);
                    money -= money;
                    break;

                case "remaining":
                    System.out.printf("The coffee machine has:\n" +
                            "%d of water\n" +
                            "%d of milk\n" +
                            "%d of coffee beans\n" +
                            "%d of disposable cups\n" +
                            "$%d of money", water, milk, beans, cups, money);
                    break;

                case "exit":
                    exit = true;
            }
        } while(!exit);
    }
}
