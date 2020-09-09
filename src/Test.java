import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe ticTacToe = new TicTacToe();
        UiStart uiStart = new UiStart(scanner, ticTacToe);
        uiStart.start();
    }
}
