import java.util.Arrays;

public class Arrayfunctions {

    public static void main(String[] args){
        System.out.println("Checking Array Functions");
        //  1st kind of array initialization
        int[] arr1 = new int[2];
        arr1[0]=1;
        arr1[1]=2;
        for(int i=0;i<2;i++){
            System.out.println(arr1[i]);
        }
        // 2nd kind of array initialization
        int[] arr2 = {1,2,3,4};
        int[] arr3 = arr2;
        arr2[2] = 9;
        System.out.println(arr2[2]);
        System.out.println(arr3[2]);

        // This is not a complete copy but just a reference so lets change the copy method

        int[] arr4 = Arrays.copyOf(arr3,arr3.length);
        arr4[2] = 10;

        System.out.println(arr3[2]);
        System.out.println(arr4[2]);

    }
}

