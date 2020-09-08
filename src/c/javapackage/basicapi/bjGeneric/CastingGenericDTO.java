package c.javapackage.basicapi.bjGeneric;

import java.io.Serializable;
//제너릭을 사용한 오브젝트를 담는 클래스
public class CastingGenericDTO<T> implements Serializable {
    //T라고해도되고 SEXKing이라고해도됨 Object 대신 T라고 넣은것
    //다만 자바에서 안에들어가는 기본 규칙이있음
    //E:기본요소
    //K:키
    //N:숫자
    //T:타입
    //V:값
    //S,U,V:두번째,세번째,네번째에 선언된 타입
    private T object;
    public void setObject(T object){
        this.object=object;
    }

    public T getObject(){
        return object;
    }
}
