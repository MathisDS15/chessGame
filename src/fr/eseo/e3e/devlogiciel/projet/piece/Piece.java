package fr.eseo.e3e.devlogiciel.projet.piece;

public abstract class Piece {

    protected boolean isWhite;

    /**
     * Constructeur de la classe Piece.
     * @param isWhite Indique si la pièce est blanche (true) ou noire (false).
     */
    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    /**
     * Vérifie si la pièce est blanche.
     * @return true si la pièce est blanche, false sinon.
     */
    public boolean isWhite() { return isWhite; }

    /**
     * Vérifie si le mouvement de la pièce est valide.
     * @param fromX Position X de départ.
     * @param fromY Position Y de départ.
     * @param toX Position X d'arrivée.
     * @param toY Position Y d'arrivée.
     * @param board Le plateau de jeu.
     * @return true si le mouvement est valide, false sinon.
     */
    public abstract boolean isValidMove(int fromX, int fromY, int toX, int toY, Piece[][] board);

    /**
     * Retourne une représentation textuelle de la pièce pour l'affichage.
     * @return Une chaîne de caractères représentant la pièce.
     */
    public abstract String toString(); // Pour affichage sur le plateau
}
