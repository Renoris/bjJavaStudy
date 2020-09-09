package c.javapackage.requirementApi.bjThread.BasicThread;

public class BjThreadConstructorSample extends Thread {
    public BjThreadConstructorSample(String name){
        super(name);//이렇게 하면 매개변수로 받은 네임을 통해서 이 스레드의 이름을 정할수가 있음
    }
    @Override
    public void run(){

    }
}
