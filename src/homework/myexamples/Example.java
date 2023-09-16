package homework.myexamples;

public class Example {
    public static void main(String[] args) {
     int x = 5;
     int y = 15;
     sum(x, y);
     System.out.println(funk1(x,y));

    }


    public static void sum(int x, int y){

        if(x>y){
            System.out.println(x/y);
        } else{
            System.out.println(x*y);
        }
    }

    public static boolean funk1(int x, int y){
        if (x>=y) {
            return true;
        } else {
            return false;
        }
    }
}
