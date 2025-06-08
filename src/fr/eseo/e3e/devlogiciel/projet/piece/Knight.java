package fr.eseo.e3e.devlogiciel.projet.piece;

public class Knight extends Piece {

    /**
     * Constructeur du cavalier.
     * @param isWhite Indique si le cavalier est blanc ou noir.
     */
    public Knight(boolean isWhite) {

        super(isWhite);
    }

    /**
     * Vérifie si le mouvement du cavalier est valide.
     * Un cavalier se déplace en forme de "L", soit deux cases dans une direction et une case perpendiculaire.
     *
     * @param fromX Position X de départ.
     * @param fromY Position Y de départ.
     * @param toX Position X d'arrivée.
     * @param toY Position Y d'arrivée.
     * @param board Le plateau de jeu.
     * @return true si le mouvement est valide, false sinon.
     */
    public boolean isValidMove(int fromX, int fromY, int toX, int toY, Piece[][] board) {
        int dx = Math.abs(fromX - toX);
        int dy = Math.abs(fromY - toY);
        if ((dx == 2 && dy == 1) || (dx == 1 && dy == 2)) {
            return board[toX][toY] == null || board[toX][toY].isWhite() != isWhite;
        }
        return false;
    }

    /**
     * Retourne une représentation textuelle du cavalier pour l'affichage.
     * @return "♘" pour un cavalier blanc, "♞" pour un cavalier noir.
     */
    public String toString() {
        return isWhite ? "♘" : "♞";
    }
}
