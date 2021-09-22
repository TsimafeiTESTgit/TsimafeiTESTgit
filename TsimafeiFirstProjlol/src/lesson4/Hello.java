package lesson4;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Enter your name, traveler!");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        System.out.println("Your name is " + username);

        System.out.println("Enter your first number!");
        int a = sc.nextInt();
        System.out.print("your first number is ");
        System.out.print(a);
        System.out.println("!");

        if (a < 100)
            System.out.println("Your number accepted!");
        else
            System.out.println("Your number is too big, but still accepted!");

        System.out.println("Enter your second number!");
        int b = sc.nextInt();
        System.out.print("your second number is ");
        System.out.print(b);
        System.out.println("!");

        if (a < b)
            System.out.println("Your first number is stronger, then second one!! You loose!");
        else
            System.out.println("Your second number is strong enough! You are spared.");
    }
}
