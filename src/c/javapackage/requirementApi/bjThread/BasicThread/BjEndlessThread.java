package c.javapackage.requirementApi.bjThread.BasicThread;

public class BjEndlessThread extends Thread {
    public void run(){
        while(true){
            try{
                System.out.println(System.currentTimeMillis());
                Thread.sleep(1000);//1초
                //이스레드는 1초마다 개속 print 메소드 출력 컨트롤 c로 멈출수잇음
                //sleep을 쓰기위해선 try-catch로 감싸야함 그리고 적어도 InterruptedException으로 catch해줘야함 Exception써도 노상관
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
