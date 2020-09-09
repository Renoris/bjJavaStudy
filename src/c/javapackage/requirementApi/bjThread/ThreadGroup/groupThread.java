package c.javapackage.requirementApi.bjThread.ThreadGroup;

import c.javapackage.requirementApi.bjThread.BasicThread.BjSleepThread;

public class groupThread {
    public static void main(String[]args){

    }

    public void groupThread(){
        try{
            BjSleepThread sleep1=new BjSleepThread(5000);
            BjSleepThread sleep2=new BjSleepThread(5000);

            ThreadGroup group=new ThreadGroup("Group1");
            Thread thread1=new Thread(group,sleep1);//쓰레드를 생성할때 앞에 그룹과 뒤에 이미 만든 쓰레드를 넣음으로써 이미 만든 쓰레드를 그룹에 추가할수 있음
            //그리고 실행할때는 이 쓰레드의 start로 하자
            Thread thread2=new Thread(group,sleep2);

            thread1.start();
            thread2.start();
            Thread.sleep(1000);
            System.out.println("Group name"+group.getName());
            int activeCount=group.activeCount();
            System.out.println("Active count="+activeCount);
            group.list();

            Thread[] tempThreadList=new Thread[activeCount];
            int result=group.enumerate(tempThreadList);
            System.out.println("Enumerate result="+result);
            for(Thread thread:tempThreadList){
                System.out.println(thread);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
