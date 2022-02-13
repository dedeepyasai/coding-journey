public class Multithreading1 {
    public static void main(String[] args){
        for(int j=1;j<5;j++){
            Multithreradingthing1 my= new Multithreradingthing1(j);
            Thread myThread = new Thread(my);
            myThread.run();
        }
    }
}

class Multithreradingthing1 implements Runnable{
    private int threadNumber;
    public Multithreradingthing1(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
        for(int i=1;i<=5;i++){

            System.out.println(i + " from Thread "+ threadNumber);
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){

            }
        }

    }
}
