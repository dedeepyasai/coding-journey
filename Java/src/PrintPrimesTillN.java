import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintPrimesTillN {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printPrimes(n);
    }

    public static void printPrimes(int n){
    for(int i=1;i<=n;i++){
        if(!checkPrime(i)){
            System.out.println(i);
        }
    }
    }

    public static boolean checkPrime(int k){
        for(int i=2;i<k;i++){
            if(k%i == 0){
                return true;
            }

        }
        return false;
    }
}











