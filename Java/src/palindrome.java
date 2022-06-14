import java.io.*;
import java.net.SocketOption;
import java.sql.Array;
import java.util.*;
import java.lang.Math;
public class palindrome {

    public static void main(String[] args){

        System.out.println(isPalindrome(2147483647));

    }
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        // Store the number in a variable
        int number = x;
        // This will store the reverse of the number
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return x == reverse;

    }
}

