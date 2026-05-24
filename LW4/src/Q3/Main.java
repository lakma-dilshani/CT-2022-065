package Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter outer radius:");
        double ro = input.nextDouble();

        System.out.println("Enter inner radius:");
        double ri = input.nextDouble();

        Circle outer = new Circle(ro);
        Circle inner = new Circle(ri);

        double shadedArea = outer.computeArea() - inner.computeArea();

        System.out.println("Shaded Area:" + shadedArea);

        System.out.println("Outer Circle Circumference:" + outer.computeCircumference());

        System.out.println("Inner Circle Circumference:" + inner.computeCircumference());
    }
}
