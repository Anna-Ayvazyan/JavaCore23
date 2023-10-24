package homework.lesson1;

class PassOb {
    public static void main(String[] args) {
        Test obj1 = new Test (100, 20);
        Test obj2 = new Test (100, 20);
        Test obj3 = new Test (10, 20);
        System.out.println(" obj1 = obj2 " + obj1.equals(obj2));

    }

}
