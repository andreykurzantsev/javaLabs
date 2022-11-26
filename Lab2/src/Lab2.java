import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        //C5 = 0 -> (a * matrix)
        //C7 = 4 -> (long)
        //C11 = 9 -> (Знайти середнє значення елементів кожного стовпчика матриця)
        Scanner in = new Scanner(System.in);

        System.out.print("Input count of rows: ");
        int enter = in.nextInt();
        int rowSize = Lab2.VerifySize(enter, in);

        System.out.print("Input count of columns: ");
        enter = in.nextInt();
        int columnSize = Lab2.VerifySize(enter, in);

        long[][] matrix = new long[rowSize][columnSize];
        final long a = 10;

        Lab2.Fill(matrix, rowSize, columnSize);
        System.out.print("Start matrix below\n");
        Lab2.Show(matrix, rowSize, columnSize);
        Lab2.Multiply(matrix, rowSize, columnSize, a);
        System.out.print("Matrix after multiplying\n");
        Lab2.Show(matrix, rowSize, columnSize);

        double[] results = Lab2.AverageColumn(matrix, rowSize, columnSize);
        for (int i = 0; i < results.length; i++){
            System.out.println("Average of column " + i + " = "  + results[i]);
        }

    }

    public static void Fill(long[][] matrix, int rowSize, int columnSize) {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                double elem = Math.random() * 12 - 5;
                matrix[i][j] = (long) elem;
            }
        }
    }

    public static void Show(long[][] matrix, int rowSize, int columnSize) {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    public static void Multiply(long[][] matrix, int rowSize, int columnSize, long multiplyNumber){
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                matrix[i][j] *= multiplyNumber;
            }
        }
    }
    public static double [] AverageColumn(long[][] matrix, int rowSize, int columnSize){
        double[] arrayResult = new double[columnSize];

        for (int i = 0; i < columnSize; i++) {
            double average = 0;
            for (int j = 0; j < rowSize; j++) {
                average += matrix[j][i];
            }
            average /= rowSize;
            arrayResult[i] = average;
        }
        return arrayResult;
    }
    public static int VerifySize(int size, Scanner in){
        while (size <= 0){
            System.out.print("Error! Enter number from 1 to inf: ");
            size = in.nextInt();
        }
        return size;
    }

}