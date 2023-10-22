package homework;

public class Gener {
    public static void main(String[] args) {
        Example myexam = new Example();
        Example myexam2 = new Example();



        myexam.set(2, 10, 5);
        myexam2.set(3, 1, 4);
        myexam.vol();
        myexam2.vol();

        System.out.println(myexam.vol());
        System.out.println(myexam2.vol());

    }
}
