public class moveZeroestoEndArray {

    public static void main(String[] args){
        int[] arr={1,2,0,3,4,5,0,7};
        display(arr);
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
        System.out.println("After moving zeroes to the end");
        display(arr);
    }
    public static void display(int arr[]){

        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }

}
