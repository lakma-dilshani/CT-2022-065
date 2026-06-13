package q6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pet[] pets = new Pet[100];
        Dog[] dogs = new Dog[100];
        Cat[] cats = new Cat[100];

        int petCount = 0;
        int dogCount = 0;
        int catCount = 0;

        int choice;

        do {

            System.out.println("\n----- MENU -----");
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("0. Quit");

            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    Cat cat = new Cat();

                    System.out.print("Enter cat name: ");
                    cat.setName(scanner.nextLine());

                    System.out.print("Enter coat color: ");
                    cat.setCoatColor(scanner.nextLine());

                    cats[catCount++] = cat;
                    pets[petCount++] = cat;

                    break;

                case 2:

                    Dog dog = new Dog();

                    System.out.print("Enter dog name: ");
                    dog.setName(scanner.nextLine());

                    System.out.print("Enter weight: ");
                    dog.setWeight(scanner.nextDouble());
                    scanner.nextLine();

                    dogs[dogCount++] = dog;
                    pets[petCount++] = dog;

                    break;

                case 3:

                    System.out.print("Enter cat name to remove: ");
                    String removeCat = scanner.nextLine();

                    for (int i = 0; i < catCount; i++) {

                        if (cats[i].getName().equalsIgnoreCase(removeCat)) {

                            for (int j = i; j < catCount - 1; j++) {
                                cats[j] = cats[j + 1];
                            }

                            catCount--;
                            System.out.println("Cat removed.");
                            break;
                        }
                    }

                    break;

                case 4:

                    System.out.print("Enter dog name to remove: ");
                    String removeDog = scanner.nextLine();

                    for (int i = 0; i < dogCount; i++) {

                        if (dogs[i].getName().equalsIgnoreCase(removeDog)) {

                            for (int j = i; j < dogCount - 1; j++) {
                                dogs[j] = dogs[j + 1];
                            }

                            dogCount--;
                            System.out.println("Dog removed.");
                            break;
                        }
                    }

                    break;

                case 0:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
