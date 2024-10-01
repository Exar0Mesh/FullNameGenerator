package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner full = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String first = full.nextLine();
        System.out.print("Enter your middle name or initials (optional): ");
        String middle = full.nextLine();
        System.out.print("Enter your last name: ");
        String last = full.nextLine();
        System.out.print("Enter a name suffix (optional): ");
        String suffix = full.nextLine();

        System.out.println(first.trim() + " " + middle.trim() + " " + last.trim() + " " + suffix.trim());
    }
}
