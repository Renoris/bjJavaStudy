package c.javapackage.requirementApi.bjThread.ThreadLocal;

public class main {
    public static void main(String[] args){
        BjLocalUserThread threads[]=new BjLocalUserThread[3];
        for(BjLocalUserThread thread:threads){
            thread=new BjLocalUserThread();
            thread.start();
        }
    }
}
