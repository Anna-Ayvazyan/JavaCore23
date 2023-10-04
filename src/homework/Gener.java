package homework;

public class Gener {
    public static void main(String[] args) {
        Example myexam = new Example();
        int vol;
        myexam.height = 100;
        myexam.width = 2;
        myexam.depth = 5;
        vol = myexam.height * myexam.depth * myexam.width;
        System.out.println("Res is " + vol);

    }
}
