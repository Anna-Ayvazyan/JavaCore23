package homework.Test;

public class Test {
    int a;
    int b;
    Test(int i, int j) {
        a = i;
        b = j;
    }
    boolean ecualTo(Test o){
        if (o.a==a && o.b ==b) return true;
         else return false;

    }


}
class PassOb{
    public static void main(String[] args) {
        PassOb obj1 = new PassOb(100, 50);
        PassOb obj2 = new PassOb(100, 50);
        PassOb obj3 = new PassOb(10, 2);

        System.out.println("obj1 == obj2 " + obj1.equals(obj2));
        System.out.println("obj2 == obj3" + obj2.equals(obj3));
    }
}
