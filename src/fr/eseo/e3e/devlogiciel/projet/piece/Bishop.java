package fr.eseo.e3e.devlogiciel.projet.piece;

public class Bishop extends Piece {

    /**
     * Constructeur de la classe Bishop.
     * @param isWhite Indique si le fou est blanc (true) ou noir (false).
     */
    public Bishop(boolean isWhite) {

        super(isWhite);
    }


    /**
     * Vérifie si le mouvement du fou est valide.
     * Un fou peut se déplacer en diagonale, mais pas sur une case occupée par une pièce de la même couleur.
     *
     * @param fromX Position X de départ.
     * @param fromY Position Y de départ.
     * @param toX Position X d'arrivée.
     * @param toY Position Y d'arrivée.
     * @param board Le plateau de jeu.
     * @return true si le mouvement est valide, false sinon.
     */
    public boolean isValidMove(int fromX, int fromY, int toX, int toY, Piece[][] board) {

        if (Math.abs(fromX - toX) != Math.abs(fromY - toY) || fromX == toX){
            return false;
        }
        int dx = Integer.compare(toX, fromX);
        int dy = Integer.compare(toY, fromY);
        int x = fromX + dx, y = fromY + dy;
        while (x != toX && y != toY) {
            if (board[x][y] != null) return false;
            x += dx;
            y += dy;
        }
        return board[toX][toY] == null || board[toX][toY].isWhite() != isWhite;
    }

    /**
     * Retourne une représentation textuelle du fou pour l'affichage.
     * @return "♗" pour un fou blanc, "♝" pour un fou noir.
     */
    public String toString() {
        return isWhite() ? "♗" : "♝";
    }
}
