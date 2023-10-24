package homework.lesson2;

public class Box {
    int width;
    int height;
    int depth;

    Box(int width, int height, int depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }

    int vol(){
        return width*height*depth;
    }

    boolean equalTo(Box box){
        return (this.width==box.width
                && this.height==box.height
                && this.depth == box.depth);
    }

}
