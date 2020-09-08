import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe ticTacToe = new TicTacToe(scanner);
        ticTacToe.printTicTacToe();
        ticTacToe.playerTurn("x", "2,1");
        ticTacToe.printTicTacToe();
        ticTacToe.playerTurn("x", "2,2");
        ticTacToe.printTicTacToe();
        ticTacToe.playerTurn("x", "2,3");
        ticTacToe.printTicTacToe();
        System.out.println(ticTacToe.connectThreeVertical("x"));
    }
}
