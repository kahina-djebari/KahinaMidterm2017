package math;

public class Fibonacci {
    public static void main(String[] args) {
        /*
          Write 40 Fibonacci numbers with java.
         */
        int a = 0;
        int b = 0;
        int c = 1;
        for (int i = 0; i < 40; i++) {
            a=b;
            b=c;
            c=a+b;
            System.out.println(a + " ");
        }
    }
}

