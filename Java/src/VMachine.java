import java.util.*;

public class VMachine {

    public static void main(String[] args){
//        vendingProducts = [new Product('C',1.50),new Product('P',1.75),new Product('W',2.0)];
        int[] quantity = new int[]{3,3,3};
        int[] vmCoins =new int[]{10,5,10};
        int[] handCoins=new int[]{5,10,10};
        // Prompt
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Enter the Product");
            System.out.println("Press C for Coke\n" +
                    "Press P for Pepsi\n" +
                    "Press W for Water\n" + "Please any other key to exit");
            String temp = scan.nextLine();
//        System.out.println(scan.nextLine());
            // Product class
            if(temp.equalsIgnoreCase("C")){
                //1.50
                double price = 1.50;
                double temp3 = 2.00;
                if(quantity[0]>0){
                    for(int i=2;i>0;i--){
                        int temp2 = (int)(price/(temp3/2));
                        temp3= temp3/2;
                        if(handCoins[i]>0){
                            handCoins[i] = handCoins[i] - temp2;
                            vmCoins[i] = vmCoins[i] + temp2;
                            price = price - temp2;
                            quantity[0]-=1;
                        }

                    }
                    System.out.println("Vending Machine amount is "+Arrays.toString(vmCoins));
                    System.out.println("25 cents coins are "+ vmCoins[0]);
                    System.out.println("50 cents coins are "+ vmCoins[1]);
                    System.out.println("1 dollars coins are "+ vmCoins[2]);
                    double total = vmCoins[0]*0.25 + vmCoins[1]*0.50 + vmCoins[2]*1;
                    System.out.println("Total Amount in Vending Machine is "+total);
                }else{
                    System.out.println("No Coke remaining");
                    System.exit(0);
                }

            }else if(temp.equalsIgnoreCase("P")){
                //1.50
                double price = 1.75;
                double temp3 =2.00;
                if(quantity[1]>0){
                    for(int i=2;i>0;i--){
                        int temp2 = (int)(price/(temp3/2));
                        temp3= temp3/2;
                        if(handCoins[i]>0){
                            handCoins[i] = handCoins[i] - temp2;
                            vmCoins[i] = vmCoins[i] + temp2;
                            price = price - temp2;
                            quantity[1]-=1;
                        }
                    }
                    System.out.println("Vending Machine amount is "+ Arrays.toString(vmCoins));
                    System.out.println("25 cents coins are "+ vmCoins[0]);
                    System.out.println("50 cents coins are "+ vmCoins[1]);
                    System.out.println("1 dollars coins are "+ vmCoins[2]);
                    double total = vmCoins[0]*0.25 + vmCoins[1]*0.50 + vmCoins[2]*1;
                    System.out.println("Total Amount in Vending Machine is "+total);
                }else{
                    System.out.println("No Pepsi remaining");
                    System.exit(0);
                }

            }else if(temp.equalsIgnoreCase("W")){
                //1.50
                double price = 2.00;
                double temp3 =2.00;
                if(quantity[2]>0){
                    for(int i=2;i>0;i--){
                        int temp2 = (int)(price/(temp3/2));
                        temp3= temp3/2;
                        if(handCoins[i]>0){
                            handCoins[i] = handCoins[i] - temp2;
                            vmCoins[i] = vmCoins[i] + temp2;
                            price = price - temp2;
                            quantity[2]-=1;
                        }
                    }
                    System.out.println("Vending Machine amount is "+ Arrays.toString(vmCoins));
                    System.out.println("25 cents coins are "+ vmCoins[0]);
                    System.out.println("50 cents coins are "+ vmCoins[1]);
                    System.out.println("1 dollars coins are "+ vmCoins[2]);
                    double total = vmCoins[0]*0.25 + vmCoins[1]*0.50 + vmCoins[2]*1;
                    System.out.println("Total Amount in Vending Machine is "+total);
                }else{
                    System.out.println("No Water remaining");
                    System.exit(0);
                }

            }else{
                System.out.println("Wrong entry");
                System.exit(0);
            }
        }


    }
}

//class Product {
//    public String name;
//    public float cost;
//    constructor(name,cost){
//
//    }
//}
