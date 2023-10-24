package homework.lesson1;

public class Test {
    int a, b ;
    Test( int i, int j){
        a=i;
        b=j;

    }
    boolean equalsTo(Test o){
        if(o.a==a && o.b == b) return false;
        else return true;

    }
}
