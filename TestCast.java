public class TestCast {
    public static void main(String[] args)
    {
       byte b=5;
       int a=b;   // implicit casting
       byte c=(byte)a; //explicit casting
       c=(byte)a;  // casting



        float f=1.2f;
        a=(int)f;
        a=(int)f; // explicit cast
        f=a;

        System.out.println(a);
        System.out.println(f);
        System.out.println(c);



    }
}
