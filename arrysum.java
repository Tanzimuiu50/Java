public class arrysum {
    public static void main(String[] args)
    { 
        int arr[] = new int[]{1,2,3,4,5,};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
           System.out.print(arr[i] + " ");
           sum=sum+arr[i];

        } //average and sum of arry 
        double average =(double)sum/arr.length;
        System.out.print("Average:" + average);
        System.out.println("Sum: " + sum);
    }
    
}
