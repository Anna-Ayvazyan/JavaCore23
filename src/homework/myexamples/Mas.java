package homework.myexamples;

public class Mas {
    public static void main(String[] args) {
        int [] arr = {2, 45, 54, 65, 78};
        big(arr);
    }


    public static void  big(int[] arr){
        for(int i =0; i<arr.length; ++i){
            if (arr[i]>7){
                System.out.println(arr[i]);

            }
        }

    }
}
