import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
        Random random = new Random();

        String[][] array = new String[4][4];
        String[][] arrayIncorrectLength = new String[4][3];
        String[][] arrayIncorrectData = new String[4][4];
        String[][] arrayIncorrectBoth = new String[2][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = String.valueOf(random.nextInt() * 100);
            }
        }

        for (int i = 0; i < arrayIncorrectLength.length; i++) {
            for (int j = 0; j < arrayIncorrectLength[i].length; j++) {
                arrayIncorrectLength[i][j] = String.valueOf(random.nextInt() * 100);
            }
        }

        for (int i = 0; i < arrayIncorrectData.length; i++) {
            for (int j = 0; j < arrayIncorrectData[i].length; j++) {
                arrayIncorrectData[i][j] = String.valueOf(random.nextInt() * 100);
            }
        }
        arrayIncorrectData[3][0] = "rdctfrvygbuhnijmo";

        for (int i = 0; i < arrayIncorrectBoth.length; i++) {
            for (int j = 0; j < arrayIncorrectBoth[i].length; j++) {
                arrayIncorrectBoth[i][j] = String.valueOf(random.nextInt() * 100);
            }
        }
        arrayIncorrectBoth[0][0] = "rxdctfvygbuhnijmk";

        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.deepToString(arrayIncorrectLength));
        System.out.println(Arrays.deepToString(arrayIncorrectData));
        System.out.println(Arrays.deepToString(arrayIncorrectBoth));
        System.out.println();

        try {
            System.out.println(arrayValueCalculator.doCalc(array));
        } catch(ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(arrayValueCalculator.doCalc(arrayIncorrectLength));
        } catch(ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(arrayValueCalculator.doCalc(arrayIncorrectData));
        } catch(ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(arrayValueCalculator.doCalc(arrayIncorrectBoth));
        } catch(ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

}
