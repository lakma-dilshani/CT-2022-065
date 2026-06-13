package q3;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pet[] pets = new Pet[100];
        int count = 0;

        while (true){
            System.out.println("Enter pet name(or STOP to finish):");
            String name = input.nextLine();

            if (name.equalsIgnoreCase("STOP")){
                break;
            }
            System.out.println("Enter pet type(c for Cat, d for Dog): ");
            char type = input.next().charAt(0);
            input.nextLine();

            if (type=='c'){
                Cat cat = new Cat();
                cat.setName(name);
                pets[count]= cat;
                count++;

            } else if (type=='d') {
                Dog dog = new Dog();
                dog.setName(name);
                pets[count] = dog;
                count++;

            }else {
                System.out.println("Invalid type!");
            }
        }
        System.out.println("\nCats:");
        for (int i = 0; i < count; i++) {
            if (pets[i] instanceof Cat) {
                System.out.println(pets[i].getName());
            }
        }
        System.out.println("\nDogs:");
        for (int i = 0; i < count; i++) {
            if (pets[i] instanceof Dog) {
                System.out.println(pets[i].getName());
            }
        }
        input.close();
    }
}

