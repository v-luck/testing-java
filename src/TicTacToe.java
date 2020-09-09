import java.lang.reflect.Array;

public class TicTacToe {
    String[][] arrays;

    public TicTacToe() {
        this.arrays = new String[][]{new String[]{"_", "_", "_", "_"},new String[]{"_", "_", "_", "_"} ,new String[]{"_", "_", "_", "_"}};
    }

    public void playerTurn(String user, String point) {
        String[] userPoint = point.split(",");
        String[] yArray = this.arrays[(Integer.valueOf(userPoint[1]))-1];
        Array.set(yArray, Integer.valueOf(userPoint[0])-1, user);
    }

    public boolean connectThreeHorizontal(String user) {
        for (String[] array : arrays) {
            Boolean allEquals = true;
            String userValue = user;
            for (String value : array) {
                if (value != userValue) {
                    allEquals = false;
                }
            }
            if (allEquals == true) {
                return true;
            }
        }
        return false;
    }

    public boolean connectThreeVertical(String user) {
        for (int i = 0; i < arrays[0].length; i ++) {
            Boolean allEquals = true;
            for (String[] array : arrays) {
                if (array[i] != user) {
                    allEquals = false;
                }
            }
            if (allEquals == true) {
                return true;
            }
        }
        return false;
    }

    public void printTicTacToe() {
        for (int i = arrays.length - 1; i >= 0; i --) {
            for (String slot : arrays[i]) {
                System.out.print(slot + ",");
            }
            System.out.println("");
        }
    }
}
