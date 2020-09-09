package c.javapackage.requirementApi.bjThread.ThreadLocal;

public class OtherLogic {
    public void printMyNumber(){
        System.out.println(Thread.currentThread().getName()+" OtherLogic value="+BjThreadLocal.get());
    }
}
