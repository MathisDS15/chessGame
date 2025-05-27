package fr.eseo.e3e.devlogiciel.projet.piece;

import java.util.Scanner;

public class Rook {

    Scanner scanner;

    public void selection(int x, int y) {
        // Logique de déplacement du pion
        scanner = new Scanner(System.in);
        boolean isDeuxCases = false;
        int positionX = 0;
        int positionY = 0;
        System.out.println("Le pion est à la position : " + x + ", " + y);
        while (positionX != x || positionY != y) {
            System.out.println("Sur quelle case voulez-vous déplacer le pion ? la position X :");
            positionX = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Sur quelle case voulez-vous déplacer le pion ? la position Y :");
            positionY = scanner.nextInt();
            scanner.nextLine();
            if (positionX != x || positionY != y) {
                System.out.println("Le pion ne peut pas se déplacer de cette façon.");
            }
        }
        System.out.println("Vous avez déplacé le pion à la position : " + positionX + ", " + positionY);
    }
}


