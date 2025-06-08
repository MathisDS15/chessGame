package fr.eseo.e3e.devlogiciel.projet.piece;

public class Rook extends Piece {

    /**
     * Constructeur de la tour.
     * @param isWhite Indique si la tour est blanche ou noire.
     */
    public Rook(boolean isWhite) {

        super(isWhite);
    }


    /**
     * Vérifie si le mouvement de la tour est valide.
     * Une tour se déplace en ligne droite, soit horizontalement, soit verticalement.
     *
     * @param fromX Position X de départ.
     * @param fromY Position Y de départ.
     * @param toX Position X d'arrivée.
     * @param toY Position Y d'arrivée.
     * @param board Le plateau de jeu.
     * @return true si le mouvement est valide, false sinon.
     */
    public boolean isValidMove(int fromX, int fromY, int toX, int toY, Piece[][] board) {
        if (fromX != toX && fromY != toY) return false;
        int dx = Integer.compare(toX, fromX);
        int dy = Integer.compare(toY, fromY);
        int x = fromX + dx, y = fromY + dy;
        while (x != toX || y != toY) {
            if (board[x][y] != null) return false;
            x += dx;
            y += dy;
        }
        return board[toX][toY] == null || board[toX][toY].isWhite() != isWhite;
    }

    /**
     * Retourne une représentation textuelle de la tour pour l'affichage.
     * @return "♖" pour une tour blanche, "♜" pour une tour noire.
     */
    public String toString() {
        return isWhite ? "♖" : "♜";
    }
}
