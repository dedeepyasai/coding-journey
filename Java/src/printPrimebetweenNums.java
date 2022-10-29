import java.util.*;
public class printPrimebetweenNums {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int low = scn.nextInt();
        int high = scn.nextInt();

        System.out.println("These are the higher and lower boundaries of the range "+ high + " - "+ low);

        for(int n = low;n<high;n++){
            int count = 0;
            for(int div = 2;div*div<=n;div++){
                if(n%div == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(n);
            }
        }
    }

}
