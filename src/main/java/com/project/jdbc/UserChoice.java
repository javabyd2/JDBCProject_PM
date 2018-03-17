package com.project.jdbc;

import java.util.Scanner;

public class UserChoice {


    public static int getChoiceFromUser() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1 - Dodaj klienta");
        System.out.println("2 - Wyswietl klientow:");
        System.out.println("3 - Edytuj klienta");
        System.out.println("Podaj parametr");
        int choice = scanner.nextInt();
        return choice;

    }
}