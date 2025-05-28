package fr.eseo.e3e.devlogiciel.projet.piece;

import java.util.Scanner;

public class Bishop {

    Scanner scanner;

    public void selection(int x, int y) {
        scanner = new Scanner(System.in);
        int positionBishopX = 0;
        int positionBishopY = 0;
        int positionDeuxX = 0;
        int positionDeuxY = 0;
        System.out.println("Le fou est à la position : " + x + ", " + y);
        while (!(positionDeuxX != 0 && (positionDeuxX == positionDeuxY || positionDeuxX == -positionDeuxY))) {
            System.out.println("Sur quelle case voulez-vous déplacer le fou ? la position X :");
            positionBishopX = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Sur quelle case voulez-vous déplacer le fou ? la position Y :");
            positionBishopY = scanner.nextInt();
            scanner.nextLine();
            positionDeuxX = positionBishopX - x;
            positionDeuxY = positionBishopY - y;
            if (!(positionDeuxX != 0 && (positionDeuxX == positionDeuxY || positionDeuxX == -positionDeuxY))) {
                System.out.println("Le fou ne peut pas se déplacer de cette façon.");
            }
        }
        System.out.println("Vous avez déplacé le fou à la position : " + positionBishopX + ", " + positionBishopY);
    }
}
