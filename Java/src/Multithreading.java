public class Multithreading {

    public static void main(String[] args){

        for(int j=1;j<5;j++){
            MultiThreadthing my= new MultiThreadthing(j);
            my.start();
        }
//        MultiThreadthing my2= new MultiThreadthing();

        // run vs start. Start used to run concurrently but run runs one after the other
//        my2.run();
    }
}
class MultiThreadthing extends Thread{
    private int threadNumber;
    public MultiThreadthing(int threadNumber){
    this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
    for(int i=1;i<=5;i++){

        System.out.println(i + "from Thread "+ threadNumber);
        try{
        Thread.sleep(1000);
        }catch(InterruptedException e){

        }
    }
    }
}
