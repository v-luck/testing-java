import java.lang.reflect.Array;

public class TicTacToe {
    String[][] arrays;

    public TicTacToe() {
        this.arrays = new String[][]{new String[]{"_", "_", "_"},new String[]{"_", "_", "_"} ,new String[]{"_", "_", "_"}};
    }

    public void playerTurn(String user, String point) {
        String[] userPoint = point.split(",");
        String[] yArray = returnYArray(Integer.valueOf(userPoint[1]));
        Array.set(yArray, Integer.valueOf(userPoint[0])-1, user);
    }

    public String[] returnYArray(Integer userValue) {
        switch (userValue) {
            case 1:
                return this.arrays[0];
            case 2:
                return this.arrays[1];
            case 3:
                return this.arrays[2];
            default:
                return null;
        }
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
        for (String slot : arrays[2]) {
            System.out.print(slot + ",");
        }
        System.out.println("");
        for (String slot : arrays[1]) {
            System.out.print(slot + ",");
        }
        System.out.println("");
        for (String slot : arrays[0]) {
            System.out.print(slot + ",");
        }
        System.out.println("");
    }
}
