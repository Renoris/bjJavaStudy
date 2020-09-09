package c.javapackage.requirementApi.bjThread.BjThreadMonitorUseObject;

public class checkThreadState {
    public static void main(String[] args){
        checkThreadState checkThreadState=new checkThreadState();
        checkThreadState.checkThreadState();
    }

    public void checkThreadState(){
        Object monitor=new Object();
        BjThreadState thread=new BjThreadState(monitor);
        try{
            System.out.println("thread state="+thread.getState());
            thread.start();//스레드 시작
            System.out.println("thread state(after start)="+thread.getState());

            Thread.sleep(100);//스레드를 잠들게함
            System.out.println("thread state(after 0.1 sec)="+thread.getState());

            synchronized (monitor){// 스레드를 실행햇을때 이 스레드는 자고잇을거임(스레드 내부코드에서) 그래서 깨워준다
                monitor.notify();
            }

            Thread.sleep(100);

            System.out.println("thread state(after notify)="+thread.getState());

            thread.join();
            System.out.println("thread state(after join)="+thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkThreadState2(){
        Object monitor=new Object();
        BjThreadState thread=new BjThreadState(monitor);
        BjThreadState thread2=new BjThreadState(monitor);
        try{
            System.out.println("thread state="+thread.getState());
            thread.start();//스레드 시작
            thread2.start();
            System.out.println("thread state(after start)="+thread.getState());

            Thread.sleep(100);//스레드를 잠들게함
            System.out.println("thread state(after 0.1 sec)="+thread.getState());

            synchronized (monitor){// 스레드를 실행햇을때 이 스레드는 자고잇을거임(스레드 내부코드에서) 그래서 깨워준다
//                monitor.notify();
//                monitor.notify();//이걸 실행해주지않으면 Thread-1은 안깨어날거임 하나만깨웟으니까
                //혹은
                monitor.notifyAll(); //이렇게하던가// 객체가 모니터하는 스레드가 몇갠지도 모르니까 그냥 notifyAll하는게 낫다고봄
            }

            Thread.sleep(100);

            System.out.println("thread state(after notify)="+thread.getState());

            thread.join();
            thread2.join();
            System.out.println("thread state(after join)="+thread.getState());
            System.out.println("thread2 state(after join)="+thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
