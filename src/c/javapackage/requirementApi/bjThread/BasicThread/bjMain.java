package c.javapackage.requirementApi.bjThread.BasicThread;

public class bjMain {
    public static void main(String[] args){
        bjMain threads=new bjMain();
//        threads.runBasic();
//        threads.runBasic2();
        //스레드를 실행하는 방법에는 2가지가있다
        //runnable 인터페이스를 이용하던가
        //스레드 클래스를 이용하던가
        //이유? 자바에서는 상속을 1개밖에 받지못함
        //그렇지만 이미 클래스를 사용하고 상속을 받았는데 스레드로 구현해야할경우는? 이미 상속받아서 스레드는 못받는데?

        threads.endless();
    }

    public void runBasic() {
        BjRunnableSample runnable=new BjRunnableSample();
        BjThreadSample thread=new BjThreadSample();
        new Thread(runnable).start();//runnable 실행방법
        thread.start();//thread 실행방법
        System.out.println("RunThreads.runBasic() method is enbed.");
        //스레드를 시작하는 메소드는 start()메소드
        //스레드를 시작하면 수행되는 메소드는 run()메소드
        //스레드의 생성자는 여러개


    }

    public void runBasic2() {
        BjRunnableSample []runnable=new BjRunnableSample[5];
        BjThreadSample []thread=new BjThreadSample[5];
        for (int loop=0; loop<5;loop++){
            runnable[loop]=new BjRunnableSample();
            thread[loop]=new BjThreadSample();
            new Thread(runnable[loop]).start();
            thread[loop].start();
        }

        System.out.println("RunThreads.runBasic() method is enbed.");
        //스레드를 시작하는 메소드는 start()메소드
        //스레드를 시작하면 수행되는 메소드는 run()메소드
    }

    public void endless(){
        BjEndlessThread thread=new BjEndlessThread();
        thread.start();
    }
}
