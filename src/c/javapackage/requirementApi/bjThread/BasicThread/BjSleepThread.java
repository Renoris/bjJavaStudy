package c.javapackage.requirementApi.bjThread.BasicThread;

public class BjSleepThread extends Thread{
    long sleepTime;
    public BjSleepThread(long sleepTime){
        this.sleepTime=sleepTime;
    }

    public void run(){
        try{
            System.out.println("Sleeping "+getName());
            Thread.sleep(sleepTime);
            System.out.println("Stopping "+getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
