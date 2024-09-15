package Q3;

public class Wrapper {
    public static void main(String[] args) {
        //demo wrapper class
        Integer i = new Integer(10);
        System.out.println(i);
        System.out.println(i.intValue());
        System.out.println(i.hashCode());
        System.out.println(i.getClass());
        System.out.println(i.equals(10));
        System.out.println(i.equals(20));
        System.out.println(i.compareTo(30));

    }
}
