public class Twodarry {
    public static void main(String[] args) {

        int arr2D[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;
        int product = 1;
        int count = 0;

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                sum += arr2D[i][j];
                product *= arr2D[i][j];
                count++;
            }
        }

        double average = (double) sum / count;

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
        System.out.println("Average = " + average);
    }
}