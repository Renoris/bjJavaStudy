package c.javapackage.requirementApi.bjThread.Bjvolatile;
//각쓰레드에서는 수행되는 변수의 값을 반복적으로 참조하게 될때에는 메인메모리에 저장하지않고 cpu캐시에 저장하고 참조됨
//이문제를 해결하기 위해서는 어떻게? instanceVariable 변수선언시 volatile이라고 써주면됨
public class VolatileSample extends Thread{
    //private volatile double instanceVariable=0; //다만 남발하면 성능상 저하가일어남
    //이런 volatile말고 다른곳에서 바꿀수잇음
    private double instanceVariable=0; //이건 원래대로 돌리고 1-1

    void setDouble(double value){
        this.instanceVariable=value;
    }


    public void run(){
//        while(instanceVariable==0);
        while(instanceVariable==0){
            try {
                Thread.sleep(1);//이렇게 1밀리초만 대기하도록 하면 volatile로 선언하지않ㅇ도 쓰레드가 멈추는것을 확인 할 수있다.
                //volatile는 데이터가 문제가 있을때만 쓰도록하자
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(instanceVariable);
    }
}
