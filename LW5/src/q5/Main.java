package q5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pet[] pets = new Pet[100];
        int petCount = 0;

        Dog[] dogs = new Dog[100];
        int dogCount = 0;

        while (true) {

            System.out.print("Enter pet name (STOP to finish): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.print("Enter type (c = Cat, d = Dog): ");
            char type = scanner.next().charAt(0);
            scanner.nextLine();

            if (type == 'c' || type == 'C') {

                Cat cat = new Cat();
                cat.setName(name);

                System.out.print("Enter coat color: ");
                cat.setCoatColor(scanner.nextLine());

                pets[petCount++] = cat;

            } else if (type == 'd' || type == 'D') {

                Dog dog = new Dog();
                dog.setName(name);

                System.out.print("Enter weight: ");
                dog.setWeight(scanner.nextDouble());
                scanner.nextLine();

                pets[petCount++] = dog;

                // Store in Dog array
                dogs[dogCount++] = dog;
            }
        }

        if (dogCount > 0) {

            double sum = 0;
            double min = dogs[0].getWeight();
            double max = dogs[0].getWeight();

            for (int i = 0; i < dogCount; i++) {

                double weight = dogs[i].getWeight();

                sum += weight;

                if (weight < min) {
                    min = weight;
                }

                if (weight > max) {
                    max = weight;
                }
            }

            double average = sum / dogCount;

            System.out.println("\nDog Weight Statistics");
            System.out.println("Average Weight = " + average);
            System.out.println("Minimum Weight = " + min);
            System.out.println("Maximum Weight = " + max);

        } else {
            System.out.println("No dogs entered.");
        }

        scanner.close();
    }
}
