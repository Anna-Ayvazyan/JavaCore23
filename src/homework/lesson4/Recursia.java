package homework.lesson4;

public class Recursia {
    public static void main(String[] args) {
        int a;
        recurs(0);
    }

    public static int recurs(int a){
        if (a<=0){
            return 0;
        }else{
            return recurs(a);
        }
    }
}
