package fr.eseo.e3e.devlogiciel.projet.piece;



public class Pawn extends Piece {

    /** * Constructeur de la classe Pawn.
     * @param isWhite Indique si le pion est blanc (true) ou noir (false).
     */
    public Pawn(boolean isWhite) {

        super(isWhite);
    }

    /**
     * Vérifie si le mouvement du pion est valide.
     * Un pion peut avancer d'une case, de deux cases depuis sa position initiale, ou prendre une pièce adverse en diagonale.
     *
     * @param fromX Position X de départ.
     * @param fromY Position Y de départ.
     * @param toX Position X d'arrivée.
     * @param toY Position Y d'arrivée.
     * @param board Le plateau de jeu.
     * @return true si le mouvement est valide, false sinon.
     */
    public boolean isValidMove(int fromX, int fromY, int toX, int toY, Piece[][] board) {
        int dir = isWhite ? -1 : 1;
        // Avance d'une case
        if (fromX + dir == toX && fromY == toY && board[toX][toY] == null) return true;
        // Avance de deux cases depuis la position initiale
        if ((isWhite && fromX == 6 || !isWhite && fromX == 1) && fromX + 2*dir == toX && fromY == toY && board[toX][toY] == null && board[fromX+dir][fromY] == null) return true;
        // Prise diagonale
        if (fromX + dir == toX && Math.abs(fromY - toY) == 1 && board[toX][toY] != null && board[toX][toY].isWhite() != isWhite) return true;
        return false;
    }

    /**
     * Retourne une représentation textuelle du pion pour l'affichage.
     * @return "♙" pour un pion blanc, "♟" pour un pion noir.
     */
    public String toString() {
        return isWhite ? "♙" : "♟";
    }
}
