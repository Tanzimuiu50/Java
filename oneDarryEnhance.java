public class oneDarryEnhance {
//Enhanced For Loop oneD arry
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        int sum = 0;
        int product = 1;

        // Print, Sum, Product
        System.out.print("Array Elements: ");

        for (int num : arr) {
            System.out.print(num + " ");
            sum += num;
            product *= num;
        }

        double average = (double) sum / arr.length;

        System.out.println();
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
        System.out.println("Average = " + average);
    }
}
