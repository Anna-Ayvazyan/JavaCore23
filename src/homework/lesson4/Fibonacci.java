package homework.lesson4;

public class Fibonacci {
    static int fib(int n){
        if (n<=1)
            return 1;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println("for " + n + " fibonacci number is " + fib(n));
    }
}
