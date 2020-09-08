package c.javapackage.basicapi.bjGenericExtend;

public class WildcardSample {
    public static void main(String[] args){
        WildcardSample sample=new WildcardSample();
        sample.callwildcardMethod();
    }

    public void callwildcardMethod(){
        WildCardGeneric<String> wildcard=new WildCardGeneric<String>();
        wildcard.setWildcard("A");
        wildcardMethod(wildcard);

        //여기에서 만약 String 이 아닌 객체를 넘겨주려면 어케할까? 이미 wildcardMethod는 String 이란것을 받는다고 정의했는데?
        //이럴경우 wildcardMethod2처럼 정의하고 사용하자
        wildcardMethod2(wildcard);

        //근데 여기에서 들어가는 객체의 범위를 지정하고싶다면?
        wildcardMethod3(wildcard); //이렇게하면 Object라는 클래스를 상속받은 클래스들만 들어갈수 잇음...

        //잠깐 근데 이렇게 ? 로 선언한경우 c에 String이 set되어있엇을때 새로 set 못함 그럼 어케함?
        //메소드를 그럼 제네릭 하게 선언하면됨
        wildcardMethod4(wildcard, "핳");

        //그럼 확장은?
        wildcardMethod5(wildcard, "킁");

        //그럼 제네릭 타입이 2개인경우 어떻게 해?
        wildcardMethod6(wildcard,"힣","섹스");
    }

    public void wildcardMethod(WildCardGeneric<String> c){
        String value=c.getWildcard();
        System.out.println(value);
    }

    public void wildcardMethod2(WildCardGeneric<?> c){
        Object value=c.getWildcard();
        System.out.println(value);
    }

    public void wildcardMethod3(WildCardGeneric<? extends Object> c){
        Object value=c.getWildcard();
        System.out.println(value);
    }

    public <T> void wildcardMethod4(WildCardGeneric<T> c, T addValue){
        c.setWildcard(addValue);
        Object value=c.getWildcard();
        System.out.println(value);
    }

    public <T extends Object> void wildcardMethod5(WildCardGeneric<T> c, T addValue){
        c.setWildcard(addValue);
        Object value=c.getWildcard();
        System.out.println(value);
    }

    public <S,T extends Object> void wildcardMethod6(WildCardGeneric<T> c, T addValue,S another){
        c.setWildcard(addValue);

        Object value=c.getWildcard();
        System.out.println(value);
    }
}
