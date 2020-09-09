import java.util.Scanner;

public class UiStart {
    Scanner scanner;
    TicTacToe ticTacToe;
    public UiStart(Scanner scanner, TicTacToe ticTacToe) {
        this.scanner = scanner;
        this.ticTacToe = ticTacToe;
    }

    public void start() {
        Boolean winner = true;
        String winnerName = null;
        String user = "x";
        while (winner == true) {
            ticTacToe.printTicTacToe();
            if (user.equals("x")) {
                System.out.print("X's turn. Enter x,y coordinate: ");
                String coordinate = scanner.nextLine();
                ticTacToe.playerTurn("x", coordinate);
                checkTrue("x");
            }

        }
    }


    public Boolean checkTrue(String user) {
        if (ticTacToe.connectThreeHorizontal(user) || ticTacToe.connectThreeVertical(user)) {
            return true;
        }
        return false;
    }
}
