package c.javapackage.basicapi.bjGeneric;

import java.io.Serializable;
//제너릭을 쓰지않은 일반적인 오브젝트 담는 클래스
public class CastingDTO implements Serializable {
    private Object object;
    public void setObject(Object object){
        this.object=object;
    }

    public Object getObject(){
        return object;
    }
}
