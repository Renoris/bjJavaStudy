package c.javapackage.requirementApi.bjThread.bjSynchronized;


public class BjSynchronizedMain {
    Object lock=new Object();//이것은 싱크로 나이즈드 블록을 쓸때 문지기역할을함
    //만약 여러개의 인스턴스 변수가있고 그 변수 들도 싱크로나이즈드가 필요하다면 오브젝트를 새로 만들어서 쓰는거 추천..
    Object lock1=new Object();//이런식으로 하나의 블록마다 하나의 객체를 배정시키는것이좋음

    //싱크로나이즈로 메소드 선언하기
    //해당 객체의 이 메소드에 싱크로나이즈드라고 선언하면 100개든 1000개든 한순간에는 한 스레드밖에 접근을 못함
    public synchronized void sample(){
        //단 메소드에 지역변수 밖에없다면 싱크로나이즈 선언을 안해도됨
        // 인스턴스 변수를 쓴다면 해야함//무결성의 원칙이 깨질수도잇음
    }
    
    
    //싱크로나이즈 블록
    public void sample2(){
        //메소드내에서 일정부분만 싱크로 나이즈드 하고싶다면 이렇게!
        synchronized (lock){

        }
    }

    //싱크로나이즈드를 안썻다고해서 항상 문제가 발생하는건아님
    //하나의 객체를 여러개의 스레드가 사용하지 않으면 발생할일이없음
    //하나의 객체를 여러개의 스레드가 참조하더라도 그 안에서 인스턴스 변수가 참조되지 않는다면 사용할 이유가 없음

    //-------------------------------------------------------------------------------------------------------
    
    //-------------------------------------------------------------------------------------
    public static void main(String[] args){
        BjSynchronizedMain bjSynchronizedMain=new BjSynchronizedMain();
        bjSynchronizedMain.runCommonCalculate();
    }

    public void runCommonCalculate() {
        CommonCalculate calc=new CommonCalculate();
        ModifyAmountThread thread1=new ModifyAmountThread(calc,true);
        ModifyAmountThread thread2=new ModifyAmountThread(calc,true);

        thread1.start();
        thread2.start();
        try{
            thread1.join();//스레드가 중지할때까지 대기
            thread2.join();
            System.out.println("final value is "+calc.getAmount());//자 결과는 20000이 나와야하지만 결과는 어케나올까요?
            //이러한 결과를 방지하기위해 Synchonized를 하는것임
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
