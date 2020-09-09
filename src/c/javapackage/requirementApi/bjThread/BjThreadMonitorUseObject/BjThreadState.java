package c.javapackage.requirementApi.bjThread.BjThreadMonitorUseObject;

public class BjThreadState extends Thread{
    private Object monitor;

    public BjThreadState(Object monitor){
        this.monitor=monitor;
    }

    public void run(){
        try{
            for(int loop=0; loop<1000; loop++){ //쓰레드를 실행중인상태로 만들기 위한 작업
                String a="A";
            }
            synchronized (monitor){
                monitor.wait();//wait호출 //여기서 스레드는 잠들지만 이 스레드를 호출한 외부 메소드에서 이 스레드를 깨워줄거임
            }
            System.out.println(getName()+" is notified");
            Thread.sleep(1000);//wait상황이끝나면 1초간 대기했다가 쓰레드 종료

        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
