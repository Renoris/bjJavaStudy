package c.javapackage.requirementApi.bjThread.Bjvolatile;

public class Main {
    public static void main(String[] args){
        VolatileSample sample=new VolatileSample();
        sample.start();

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("sleep ended!!!");
        sample.setDouble(-1);//이러면 저 샘플은 내부에 -1의 값이 저장되있는데 쓰레드가 종료가 될까?안된다
        System.out.println("set Value is completed");
        //각쓰레드에서는 수행되는 변수의 값을 반복적으로 참조하게 될때에는 메인메모리에 저장하지않고 cpu캐시에 저장하고 참조됨
        //이문제를 해결하기 위해서는 어떻게? instanceVariable 변수선언시 volatile이라고 써주면됨


    }
}
