
public class Program {

    public static void main(String[] args) {
        // Test your method here
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));
    }

    public static String arrayAsString(int[][] array) {
        StringBuilder willReturn = new StringBuilder();
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                willReturn.append(array[x][y]);
            }
            
            willReturn.append("\n");
        }
        return willReturn.toString();
    }
}
