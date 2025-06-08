# Chess Game

## Description
Chess Game is an interactive chess project developed in Java (JavaFX) and JavaScript. It demonstrates object-oriented programming and provides an intuitive user experience.

## Features
- **Dynamic Chessboard**: Automatic chessboard generation.
- **Move Validation**: Enforces chess rules for all pieces.
- **Graphical Interface**: JavaFX UI for the Java version.

- **Web Version**: Interactive chess game using HTML, CSS, and JavaScript.
- **Move History** (web): Tracks all moves.
- **Captured Pieces Display** (web).
- **Light/Dark Theme** (web).
- **Timer** (web).

## Project Structure
```
docs/
    README.md
src/
    fr/
        eseo/
            e3e/
                devlogiciel/
                  projet/
                       application/
                           ApplicationUI.java
                       board/
                           Board.java
                       piece/
                           Bishop.java
                           King.java
                           Knight.java
                           Pawn.java
                           Piece.java
                           Queen.java
                           Rook.java
test/
    fr/
        eseo/
            e3e/
                devlogiciel/
                    projet/
                        application/
                            TestApplicationUI.java
                        board/
                            TestBoard.java
                        piece/
                            TestBishop.java
                            TestKing.java
                            TestKnight.java
                            TestPawn.java
                            TestPiece.java
                            TestQueen.java
                            TestRook.java   
web/
    chessGame.js
    index.html
    styles.css
    assets/
        images/
            chess.jpg
```

## Installation
1. Clone the repository:
   ```bash
   git clone <REPOSITORY_URL>
   ```
2. Open the `index.html` file in a web browser.

## Usage
- Click the **Start Game** button to start a game and activate the timer.
- Click the **Reset Game** button to reset the board and the timer.
- Use the **☼** button to toggle between light and dark themes.

## Technologies Used
- **HTML5**: Structure of the web page.
- **CSS3**: Styles and themes (light/dark).
- **JavaScript**: Game logic, dynamic board generation, event handling.

## Authors
- **Mathis DA SILVA**: [mathis.dasilva@reseau.eseo.fr](mailto:mathis.dasilva@reseau.eseo.fr)
- **Léo DUBLEUMORTIER**: [leo.dubleumortier@reseau.eseo.fr](mailto:leo.dubleumortier@reseau.eseo.fr)

## License
This project is licensed under the MIT License. You are free to use, modify, and distribute it, provided that you retain the copyright notice and this license notice.

---

© 2025 Chess Game. All rights reserved.
