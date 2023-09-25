
public class ArrayValueCalculator {

    public int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array.length != 4 || array[i].length != 4) {
                    throw new ArraySizeException("The matrix must be 4x4!");
                }
                try {
                    sum = Integer.parseInt(array[i][j]);
                } catch(NumberFormatException e) {
                    throw new ArrayDataException("Incorrect value at [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }

}
