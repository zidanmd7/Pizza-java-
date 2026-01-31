package edu.uno.csci2830;

import java.util.Scanner;

public class PizzaMain {

    private static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            sc.next(); // throw away bad token
            System.out.print("Enter a number: ");
        }
        return sc.nextInt();
    }

    private static PizzaCrust chooseCrust(Scanner sc) {
        while (true) {
            System.out.println("Choose a crust:");
            System.out.println("  1) " + new ThinCrust());
            System.out.println("  2) " + new ThickCrust());
            System.out.print("Enter choice: ");
            int c = readInt(sc);
            if (c == 1) return new ThinCrust();
            if (c == 2) return new ThickCrust();
            System.out.println("Invalid choice. Try again.\n");
        }
    }

    private static PizzaSauce chooseSauce(Scanner sc) {
        while (true) {
            System.out.println("Choose a sauce:");
            System.out.println("  1) " + new TomatoSauce());
            System.out.println("  2) " + new AlfredoSauce());
            System.out.print("Enter choice: ");
            int s = readInt(sc);
            if (s == 1) return new TomatoSauce();
            if (s == 2) return new AlfredoSauce();
            System.out.println("Invalid choice. Try again.\n");
        }
    }

    private static PizzaTopping chooseTopping(Scanner sc) {
        while (true) {
            System.out.println("Choose a topping:");
            System.out.println("  1) "  + new Sausage());
            System.out.println("  2) "  + new Pepperoni());
            System.out.println("  3) "  + new Bacon());
            System.out.println("  4) "  + new Ham());
            System.out.println("  5) "  + new Olives());
            System.out.println("  6) "  + new Onions());
            System.out.println("  7) "  + new GreenPeppers());
            System.out.println("  8) "  + new Mushrooms());
            System.out.println("  9) "  + new Mozzarella());
            System.out.println("  10) " + new Parmesan());
            System.out.println("  11) " + new Cheddar());
            System.out.println("  12) " + new Provolone());
            System.out.print("Enter choice: ");

            int t = readInt(sc);

            switch (t) {
                case 1:  return new Sausage();
                case 2:  return new Pepperoni();
                case 3:  return new Bacon();
                case 4:  return new Ham();
                case 5:  return new Olives();
                case 6:  return new Onions();
                case 7:  return new GreenPeppers();
                case 8:  return new Mushrooms();
                case 9:  return new Mozzarella();
                case 10: return new Parmesan();
                case 11: return new Cheddar();
                case 12: return new Provolone();
                default:
                    System.out.println("Invalid choice. Try again.\n");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PizzaCrust crust = chooseCrust(sc);
        System.out.println();

        PizzaSauce sauce = chooseSauce(sc);
        System.out.println();

        Pizza pizza = new Pizza(crust, sauce);

        int numToppings;
        while (true) {
            System.out.print("How many toppings (0-4)? ");
            numToppings = readInt(sc);
            if (numToppings >= 0 && numToppings <= 4) break;
            System.out.println("Please enter a number from 0 to 4.\n");
        }
        System.out.println();

        for (int i = 0; i < numToppings; i++) {
            PizzaTopping topping = chooseTopping(sc);
            boolean added = pizza.addTopping(topping);
            if (!added) {
                System.out.println("Could not add topping (already have 4).");
                break;
            }
            System.out.println("Added: " + topping + "\n");
        }

        System.out.println("=== Your Pizza ===");
        System.out.println("Crust: " + pizza.getCrust());
        System.out.println("Sauce: " + pizza.getSauce());
        System.out.println("Toppings:");
        if (pizza.getToppings().isEmpty()) {
            System.out.println("  (none)");
        } else {
            for (PizzaTopping t : pizza.getToppings()) {
                System.out.println("  - " + t);
            }
        }

        sc.close();
    }
}
