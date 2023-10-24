package homework.lesson2;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox1= new Box(1, 5, 10);
        Box myBox2= new Box(1, 5, 10);
        System.out.println("myBox1 = myBox2 " + myBox1.equalTo(myBox2));
    }
}
