package c.javapackage.requirementApi.bjThread.ThreadLocal;

import java.util.Random;

public class BjThreadLocal {
    //각 쓰레드에서 혼자쓸수있는값을 가지려면?
    //쓰레드 로컬에서는 고유한 타입을 하나 제네릭하게 지정해줘야함
    private final static ThreadLocal<Integer> local=new ThreadLocal<>();
    private static Random random;
    static {
        random=new Random();
    }

    public static Integer generateNumber(){
        int value=random.nextInt();
        local.set(value);
        return value;
    }

    public static Integer get(){
        return local.get();
    }
    public static void remove(){
        local.remove();
    }
}
