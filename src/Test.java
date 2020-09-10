import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("tic tac toe start");
        Scanner scanner = new Scanner(System.in);
        TicTacToe ticTacToe = new TicTacToe();
        UiStart uiStart = new UiStart(scanner, ticTacToe);
        uiStart.start();
    }
}
