import java.io.*;
import java.sql.Array;
import java.util.*;
public class Twosum {

    public static void main(String[] args){

        int[] nums = {2,5,5,11};
        int target = 10;
        List<Integer> arrList = new ArrayList<Integer>();
        int[] result = new int[2];
        int n = nums.length;
        for (int i=0;i<n;i++){
            int j = search(nums,(target-nums[i]));
            System.out.println(j);
            if(j!= -1 && j!=i){
                arrList.add(i);
                arrList.add(j);
            }
        }
        System.out.println("Printing result");
        System.out.println(arrList);

    }
    public static int search(int[] arr,int tar){
        int index = Arrays.binarySearch(arr,tar);
        return (index<0)?-1:index;
    }

}
