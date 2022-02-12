
public class Stringfunctions {

    public static void main(String[] args){

    // String StringBuffer StringBuilder Literals Vs new .... Constant string pool vs Heap
    String str= "hellow";
    System.out.println(str.toUpperCase());
    System.out.println(str.substring(0,1).toUpperCase()+ str.substring(1));
    System.out.println(str.length());
    String str2 = str;

    // StringBuffer is synchronized and not efficient but StringBuilder is efficient and not thread safe

    // equals equalsIgnoreCase

    StringBuilder sb = new StringBuilder("Welcome");
    sb.append(" Home");
    sb.insert(7," to");
    // replace delete reverse
    System.out.println(sb);
    }
}
