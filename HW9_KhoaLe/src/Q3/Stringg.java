package Q3;


public class Stringg {
    public static void main(String[] args) {
        //compare String and StringBuilder
        String s = new String("Hello");
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(s);
        System.out.println(sb);
        System.out.println(s.hashCode());
        System.out.println(sb.hashCode());

        //try to change the value of s and sb
        s = s + " World";
        sb.append(" World");
        System.out.println(s);
        System.out.println(sb);
        System.out.println(s.hashCode()); //hashcode of s will be different
        System.out.println(sb.hashCode()); //hashcode of sb will the same as before

    }
}
