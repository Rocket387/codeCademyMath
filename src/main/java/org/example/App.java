package org.example;

//helpful documentation on java Math https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
public class App 
{
    public static void main( String[] args )
    {

        // Random double value between 0 and 1
        System.out.println(Math.random());

        // Random double value between 0 and 9
        double a = Math.random() * 10;
        System.out.println(a);

        // Random int value between 0 and 9
        int b = (int)(Math.random() * 10);
        System.out.println(b);

        // Random int value between 1 and 10

        int c = (int)(Math.random() * 10) + 1;
        System.out.println(c);

        // Random int value between 10 and 20
        //algorithm (Math.random() * (maxValue - minValue + 1)) + minValue.
        int d = (int)(Math.random() * 11 ) + 10;
        System.out.println(d);
    }

}
