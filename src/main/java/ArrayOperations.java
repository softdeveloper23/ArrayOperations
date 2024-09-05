import java.util.Scanner;

class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            for (int i = 0; i < twoDimArray.length; i++) {
                for (int j = 0; j < twoDimArray[i].length; j++)
                    twoDimArray[i][j] = scanner.nextInt();
            }
        }
        // Logic code goes here
    }
}