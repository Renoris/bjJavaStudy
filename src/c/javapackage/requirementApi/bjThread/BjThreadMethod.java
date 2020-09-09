package c.javapackage.requirementApi.bjThread;

import c.javapackage.requirementApi.bjThread.BasicThread.BjThreadSample;

public class BjThreadMethod {
    public void threadSample(){
        BjThreadSample bjThreadSample=new BjThreadSample();
        bjThreadSample.run(); //이건알거고 이렇게 실행하는게 아니라 start()써서 실행

        bjThreadSample.getId();//스레드 고유 id리턴

        bjThreadSample.getName();//스레드이름리턴

        bjThreadSample.setName("병준이스레드1");//스레드 이름 지정

        bjThreadSample.getPriority();//스레드 우선순의 확인 //기본값이 잇음

        bjThreadSample.setPriority(1);//스레드 우선순위 지정-안쓰는게 좋음//그래도 상수가있는데 MAX_PRIORITY-10, NORM_PRIORITY-5, MIN_PRIORITY-1 높은 일반 낮은 우선순위 순임

        bjThreadSample.isDaemon();//스레드가 데몬인지확인

        bjThreadSample.setDaemon(true);//스레드 데몬 여부 지정// 데몬스레드란? jvm이 사용자스레드는 끝날때까지 기다리지만 데몬스레드는 안기다리고 jvm이 끝날수 있음

        bjThreadSample.getStackTrace();//스레드 스택여부지정

        bjThreadSample.getState();//스레드 상태확인

        //NEW-아직시작되지않은상태, RUNNABLE-실행중인상태 BLOCKED-실행중지상태

        //WAITTING-대기중인상태, TIMED_WAITTING-특정시간만큼 쓰레드가 대기중인상태, TERMINATED-쓰레드가 종료된 상태

        bjThreadSample.getThreadGroup();//스레드 그룹확인
        long millis=1;
        int nanos=1;
        try {
            bjThreadSample.join();//스레드가 중지할때까지 대기

            bjThreadSample.join(millis);//첫매개변수에 저장된시간(1/1,000초)에 지정된 시간만큼대기 //만약 60초 대기를 한다 하면은 60000을 millis에 넣으면됨

            bjThreadSample.join(millis,nanos);//첫매개변수에 저장된시간(1/1,000초)+두번째 매개변수(1/1,000,000,000초)에 지정된 시간만큼대기

            bjThreadSample.interrupt();//수행중인 스레드에 인터럽트 요청

            // InterruptedException을 발생시키면서 중단

            //join(),sleep(),wait()메소드를 호출한 상태에서만 쓰레드를 중단
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bjThreadSample.checkAccess();//쓰레드가 해당쓰레드를 수정할수 있는 권한이 있는지 확인//권한없으면 SecurityException발생

        bjThreadSample.isAlive();//해당쓰레드의 run이 종료됫는지 안됫는지 확인

        bjThreadSample.isInterrupted();//해당쓰레드가 인터럽트 됫는지 안됫는지 여부확인

        Thread.interrupted();//현재쓰레드가 중지되었는지 확인


        //---------------------------------------------------------------------------
        //쓰레드 클래스외에 쓰레드의 상태를 통제하는 메소드들
        Object object=new Object();
        try {
            object.wait();//현재 스레드 대기 매개변수로 long 타입을 줄수잇음-1/1,000초 만큼 대기
            //쓰레드가 오브젝트 객체에 대한 notify()나 notifyALL()메소드를 호출할때까지 현재 쓰레드가 대기하고 있도록 한다

            object.notify();//오브젝트 객체의 모니터에 대기하고 있는 단일쓰레드를 깨움

            object.notifyAll();//오브젝트 객체의 모니터에 대기하고 있는 모든 쓰레드를 깨움
            //모니터?-쓰레드가 안전하게 수행되도록 도와주는 객체
            //쓰레드 밖에서 쓰레드에게 매개변수로 넘겨주고 통제
            //자세한건 BjThreadMonitorUseObject패키지에서 확인
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //---------------------------------------------------------------
        //쓰레드 그룹--트리구조

        ThreadGroup threadGroup=new ThreadGroup("GroupName");
        Thread[] list=new Thread[5];
        threadGroup.activeCount();//실행중인 쓰레드 갯수리턴

        threadGroup.activeGroupCount();//실행중인 쓰레드 그룹의 갯수리턴

        threadGroup.enumerate(list);//현재쓰레드 그룹에있는 모든 쓰레드를 매개변수로 넘어온 쓰레드 배열에 담음. 두번째 매개변수(boolean)(선택)가 true이면 하위에 있는 쓰레드 그룹목록도 포함
        //매개변수로 쓰레드 그룹배열을 주면 현재 쓰레드 그룹에 있는 모든 쓰레드 그룹을 매개변수로 넘어온 배열에 담음 두번째 매개변수 역시 선택
        //배열의 크기는 threadGroup.activeCount()메소드를 이용해 현재 실행중인 쓰레드 갯수를 파악한후 그 쓰레드 갯수대로 배열생성

        threadGroup.getName(); //쓰레드 그룹 이름 리턴
        threadGroup.getParent();//부모 쓰레드 그룹 리턴
        threadGroup.list();//쓰레드그룹의 상세정보출력
        threadGroup.setDaemon(false);//쓰레드 그룹에 속한 모든 쓰레드들을 데몬으로 지정-true일시
        
    }
}
