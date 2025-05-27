package fr.eseo.e3e.devlogiciel.projet.board;

import fr.eseo.e3e.devlogiciel.projet.piece.Pawn;

public class Player {



    public static void main(String[] args) {

        Board Echequier = new Board("Blanc");
        Echequier.affiche();

        jouer();
    }

    static void jouer() {
        Pawn pawn = new Pawn();
        System.out.println("Déplacement du pion");
        pawn.selection(2, 6);
        // Uncomment the line below to see the effect of the deplacement method
        //

    }

}

