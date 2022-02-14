import java.util.Random;

public class MergeSortAlgo {

    public static void main(String[] args){
        Random rand = new Random();
        int[] arr=new int[8];
        for(int i=0; i<arr.length; i++){
            arr[i] = rand.nextInt(100000);
        }
//        System.out.println("Before");
//        printArray(arr);
        mergeSort(arr);
        System.out.println("After");
        printArray(arr);
    }
    private static void mergeSort(int[] inputArray){
        int inputLength = inputArray.length;
        if(inputLength<2){
            return;
        }
        int midIndex=inputLength/2;
        int[] leftArray = new int[midIndex];
        int[] rightArray =new int[inputLength-midIndex];

        // filling the arrays
        for(int i=0;i<midIndex;i++){
            leftArray[i] = inputArray[i];
        }
        for(int i=midIndex;i<inputLength;i++){
            rightArray[i-midIndex] = inputArray[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        // Now merging the two arrays by sorting
        merge(inputArray,leftArray,rightArray);
    }
    private static void merge(int[] inputArray,int[] leftArray,int[] rightArray){
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i=0,j=0,k=0;
        while(i<leftSize && j<rightSize){
            if(leftArray[i]<=rightArray[j]){
                inputArray[k]=leftArray[i];
                i++;
            }
            else{
                inputArray[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i<leftSize){
            inputArray[k] = leftArray[i];
            i++;
            k++;
        }
        while(j<rightSize){
            inputArray[k] = rightArray[j];
            j++;
            k++;
        }

    }
    private static void printArray(int[] arr){

        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }

}
