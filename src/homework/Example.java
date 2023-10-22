package homework;

import java.sql.SQLOutput;

public class Example {
    int height;
    int width;
    int depth;
    public int vol(){
        return height * width * depth;
    }

    void set(int h, int w, int d){
        height=h;
        width=w;
        depth=d;
    }
}
