package q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pet[] pets = new Pet[100];
        int count = 0;

        while (true) {

            System.out.print("Enter pet name (STOP to finish): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.print("Enter pet type (c = Cat, d = Dog): ");
            char type = scanner.next().charAt(0);
            scanner.nextLine(); // consume newline

            if (type == 'c' ) {

                Cat cat = new Cat();
                cat.setName(name);

                System.out.print("Enter coat color: ");
                String color = scanner.nextLine();
                cat.setCoatColor(color);

                pets[count] = cat;

            } else if (type == 'd') {

                Dog dog = new Dog();
                dog.setName(name);

                System.out.print("Enter weight: ");
                double weight = scanner.nextDouble();
                scanner.nextLine();

                dog.setWeight(weight);

                pets[count] = dog;
            }

            count++;
        }


        System.out.println("\nCats:");
        for (int i = 0; i < count; i++) {

            if (pets[i] instanceof Cat) {
                Cat cat = (Cat) pets[i];

                System.out.println(
                        "Name: " + cat.getName() + "  Type: Cat" + "  Coat Color: " + cat.getCoatColor()
                );
            }
        }

        // Print Dogs
        System.out.println("\nDogs:");
        for (int i = 0; i < count; i++) {

            if (pets[i] instanceof Dog) {
                Dog dog = (Dog) pets[i];

                System.out.println(
                        "Name: " + dog.getName() + "  Type: Dog" + "  Weight: " + dog.getWeight()
                );
            }
        }

        scanner.close();
    }
}
