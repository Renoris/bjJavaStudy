package c.javapackage.basicapi.bjGenericExtend;

public class WildCardGeneric<W> {//W 라고되어있지만 일반적으로 T를 씁시다.
    W wildcard;
    public void setWildcard(W wildcard){
        this.wildcard=wildcard;
    }

    public W getWildcard(){
        return wildcard;
    }

}
