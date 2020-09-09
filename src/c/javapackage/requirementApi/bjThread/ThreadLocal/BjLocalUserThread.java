package c.javapackage.requirementApi.bjThread.ThreadLocal;

//각 쓰레드에서 혼자쓸수있는값을 가지려면?
public class BjLocalUserThread extends Thread{
    public void run(){
        int value=BjThreadLocal.generateNumber();//쓰레드 로컬에서 임의로 값을 만들엇음
        //만약 쓰레드 로컬에서 만든값을 ThreadLocal을 사용하지않고 OtherLogic클래스에서 사용하려면?
        //1.매개변수로 넘긴다 -다른메소드에서도 이값을 사용하려면 매개변수로 넘겨야함
        //2.OtherLocal클래스에서 인스턴스변수선언//이러면 매우 복잡해지는데?
        //3.쓰레드 로컬선언
        System.out.println(this.getName()+"LocalUserThread value="+value);

        OtherLogic otherLogic=new OtherLogic();
        otherLogic.printMyNumber();
        BjThreadLocal.remove();//이건 항상 실행시켜줘야함

    }
}
