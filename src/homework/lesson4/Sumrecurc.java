package homework.lesson4;

public class Sumrecurc {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("for " + n + " sum all numbers is " + sum(n));

    }


    static int sum(int n){
        if(n<=1)
            return 1;
        return n+ sum(n-1);
    }
}
