package fr.eseo.e3e.devlogiciel.projet.piece;

import java.util.Scanner;

public class Queen {

    Scanner scanner;

    public void selection(int x, int y) {
        scanner = new Scanner(System.in);
        int positionQueenX = 0;
        int positionQueenY = 0;
        int dx = 0, dy = 0;
        System.out.println("La dame est à la position : " + x + ", " + y);
        while (!(
                // Déplacement tour
                (positionQueenX == x && positionQueenY != y) ||
                        (positionQueenX != x && positionQueenY == y) ||
                        // Déplacement fou
                (dx != 0 && (dx == dy || dx == -dy))
        )) {
            System.out.println("Sur quelle case voulez-vous déplacer la dame ? la position X :");
            positionQueenX = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Sur quelle case voulez-vous déplacer la dame ? la position Y :");
            positionQueenY = scanner.nextInt();
            scanner.nextLine();
            dx = positionQueenX - x;
            dy = positionQueenY - y;
            if (!(
                    (positionQueenX == x && positionQueenY != y) ||
                            (positionQueenX != x && positionQueenY == y) ||
                            (dx != 0 && (dx == dy || dx == -dy))
            )) {
                System.out.println("La dame ne peut pas se déplacer de cette façon.");
            }
        }
        System.out.println("Vous avez déplacé la dame à la position : " + positionQueenX + ", " + positionQueenY);
    }
}
