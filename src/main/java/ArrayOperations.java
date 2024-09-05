class ArrayOperations {
    public static void main(String[] args) {
        int[][] twoDArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printCorners(twoDArray);
    }
    public static void printCorners(int[][] twoDimArray) {
        if (twoDimArray == null || twoDimArray.length == 0 || twoDimArray[0].length == 0) {
            return;
        }

        int rows = twoDimArray.length;
        int cols = twoDimArray[0].length;

        // Top-left corner
        System.out.print(twoDimArray[0][0] + " ");

        // Top-right corner
        System.out.println(twoDimArray[0][cols - 1]);

        // Bottom-left corner
        System.out.print(twoDimArray[rows - 1][0] + " ");

        // Bottom-right corner
        System.out.println(twoDimArray[rows - 1][cols - 1]);
    }
}
