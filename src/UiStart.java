import java.util.Scanner;

public class UiStart {
    Scanner scanner;
    TicTacToe ticTacToe;
    public UiStart(Scanner scanner, TicTacToe ticTacToe) {
        this.scanner = scanner;
        this.ticTacToe = ticTacToe;
    }

    public void start() {
        while (true) {
            String user = "x";
            ticTacToe.printTicTacToe();
            if (user.equals("x")) {
                if (playTicTackToeTurn("x")) {
                    System.out.println(user + " wins!");
                    break;
                }
            }
            user = "o";
            ticTacToe.printTicTacToe();
            if (user.equals("o")) {
                if (playTicTackToeTurn("o")) {
                    System.out.println(user + " wins!");
                    break;
                }
            }

        }
    }

    public Boolean playTicTackToeTurn(String user) {
        System.out.println(user + "'s turn. Enter x,y coordinate: ");
        String coordinate = scanner.nextLine();
        ticTacToe.playerTurn(user, coordinate);
        return checkTrue(user);
    }


    public Boolean checkTrue(String user) {
        if (ticTacToe.connectThreeHorizontal(user) || ticTacToe.connectThreeVertical(user)) {
            return true;
        }
        return false;
    }
}
