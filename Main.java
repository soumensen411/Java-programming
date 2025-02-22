import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter integer number: ");
        int n = scn.nextInt();
        System.out.println("The number is "+n);
        System.out.print("Enter double number: ");
        double m = scn.nextDouble();
        System.out.println("The number is "+m);
        System.out.print("Enter your name: ");
        scn.nextLine();
        String name = scn.nextLine();
        System.out.println("Hello " + name);
        scn.close();
    }
}