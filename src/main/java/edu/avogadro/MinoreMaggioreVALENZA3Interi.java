package edu.avogadro;

import java.util.Scanner;

public class MinoreMaggioreVALENZA3Interi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int num2 = scanner.nextInt();

        System.out.print("Inserisci il terzo numero: ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Il primo numero è maggiore e vale: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Il secondo numero è maggiore e vale: " + num2);
        } else {
            System.out.println("Il terzo numero è maggiore e vale: " + num3);
        }
        if (num1 < num2 && num1 < num3) {
            System.out.println("Il primo numero è minore e vale: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("Il secondo numero è minore e vale: " + num2);
        } else {
            System.out.println("Il terzo numero è minore e vale: " + num3);
        }
    }
}
