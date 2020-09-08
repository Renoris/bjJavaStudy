package c.javapackage.basicapi.bjSystemclasses;

public class BjSystemClasses {

    public void bjSystemClasslist(){
        //시스템 클래스는 각종 정보를 확인 가능함
        System.out.println("System.err.method() 에러 밑 오류 처리시 사용");// 에러 밑 오류를 처리시 사용
        System.out.println("System.out.method() 출력값 처리시 사용");//출력값 처리시 사용
        System.out.println("System.in.method() 입력값 처리시 사용");//입력값 처리시 사용
        System.out.println("시스템 속성값 관리 메소드들");
        System.out.println("System.clearProperty() 키에 지정된 시스템 속성제거");
        System.out.println("System.getProperties 현재 시스템 속성을 properties 클래스 형태로 제공");
        System.out.println("프로퍼티스는 해시테이블의 상속을 받은 객체-key-value");
        System.out.println("System.getProperty(String key, (String def)); String형태의 키에해당하는 값을 가져옴 뒤에 String을 하나더쓰면 만약 그키가없으면 그 def 를 가져옴");
        System.out.println("System.setProperties(Properties) 프로퍼티타입으로 넘겨주는 매게변수에 있는 값들을 시스템 속성으로 넣음");
        System.out.println("System.setProperty(String key, String value) 알지?");
        System.out.println("수행하면 안되는 메소드들");
        System.out.println("System.gc() 가비지 컬렉터 실행");
        System.out.println("System.runFinalization() gc처리를 기다리는 모든객체에 대하여 finalize() 메소드 실행");
        System.out.println("System.exit(int status) jvm 종료");
        System.out.println("시간 측정 메소드");
        System.out.println("System.nanoTime() 현재시간을 나노초 단위로 리턴-시간측정을 위한것");
        System.out.println("System.currentTimeMillis() 현재 시간을 밀리초 단위로 리턴-현재 시간확인");

    }
}
