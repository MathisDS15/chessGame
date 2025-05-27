function brightness() {
    if (document.body.classList.contains("dark-theme")) {
        document.body.classList.remove("dark-theme");
        document.body.classList.add("light-theme");
    } else {
        document.body.classList.remove("light-theme");
        document.body.classList.add("dark-theme");
    }
}

document.getElementById("sunMoonToggle").addEventListener("click", brightness);

// Génération dynamique du plateau d'échecs
function createBoard() {
    const chessBoard = document.getElementById("chessBoard");
    const rows = ["8", "7", "6", "5", "4", "3", "2", "1"];
    const columns = ["A", "B", "C", "D", "E", "F", "G", "H"];

    for (let row of rows) {
        for (let col of columns) {
            const square = document.createElement("div");
            square.classList.add("square");
            square.dataset.position = `${col}${row}`;

            // Appliquer une couleur alternée
            const isDark = (columns.indexOf(col) + rows.indexOf(row)) % 2 === 0;
            square.classList.add(isDark ? "dark" : "light");

            chessBoard.appendChild(square);
        }
    }
}

createBoard();

let timerInterval;
let secondsElapsed = 0;

function startTimer() {
    const timerElement = document.getElementById("timer");
    timerInterval = setInterval(() => {
        secondsElapsed++;
        const minutes = Math.floor(secondsElapsed / 60);
        const seconds = secondsElapsed % 60;
        timerElement.textContent = `${String(minutes).padStart(2, '0')}:${String(seconds).padStart(2, '0')}`;
    }, 1000);
}

function resetTimer() {
    clearInterval(timerInterval);
    secondsElapsed = 0;
    document.getElementById("timer").textContent = "00:00";
}

document.getElementById("startGame").addEventListener("click", startTimer);
document.getElementById("resetGame").addEventListener("click", resetTimer);