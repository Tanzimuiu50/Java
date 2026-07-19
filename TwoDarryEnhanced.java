public class TwoDarryEnhanced {

    public static void main(String[] args) {

        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;
        int product = 1;
        int count = 0;

        System.out.println("2D Array Elements:");

        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
                sum += value;
                product *= value;
                count++;
            }
            System.out.println();
        }

        double average = (double) sum / count;

        System.out.println("\nSum = " + sum);
        System.out.println("Product = " + product);
        System.out.println("Average = " + average);
    }
}