package fr.eseo.e3e.devlogiciel.projet.piece;

import java.util.Scanner;

public class King {

    Scanner scanner;

    public void selection(int x, int y) {
        // Logique de déplacement du pion
        scanner = new Scanner(System.in);
        int positionKingX = 0;
        int positionKingY = 0;
        int positionDeuxX = 2;
        int positionDeuxY = 2;
        System.out.println("Le pion est à la position : " + x + ", " + y);
        while (!(positionDeuxX >= -1 && positionDeuxX <= 1 && positionDeuxY >= -1 && positionDeuxY <= 1 && !(positionDeuxX == 0 && positionDeuxY == 0))) {
            System.out.println("Sur quelle case voulez-vous déplacer le pion ? la position X :");
            positionKingX = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Sur quelle case voulez-vous déplacer le pion ? la position Y :");
            positionKingY = scanner.nextInt();
            scanner.nextLine();
            positionDeuxX = positionKingX - x;
            positionDeuxY = positionKingY - y;
            if (!(positionDeuxX >= -1 && positionDeuxX <= 1 && positionDeuxY >= -1 && positionDeuxY <= 1 && !(positionDeuxX == 0 && positionDeuxY == 0))) {
                System.out.println("Le pion ne peut pas se déplacer de cette façon.");
            }
        }
        System.out.println("Vous avez déplacé le pion à la position : " + positionKingX + ", " + positionKingY);
    }
}
