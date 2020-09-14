import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Gui gui = new Gui();
        System.out.println("tic tac toe start");
        Scanner scanner = new Scanner(System.in);
        TicTacToe ticTacToe = new TicTacToe();
        UiStart uiStart = new UiStart(scanner, ticTacToe);
        uiStart.start();
    }
}
