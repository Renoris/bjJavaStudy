package c.javapackage.basic;

import java.util.Objects;

public class bjitem {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        bjitem bjitem = (bjitem) o;
        return item3 == bjitem.item3 &&
                Objects.equals(item1, bjitem.item1) &&
                Objects.equals(item2, bjitem.item2);
    }
    // alt+insert hashcode+equals
    @Override
    public int hashCode() {
        return Objects.hash(item1, item2, item3);
    }

    private String item1;
    private String item2;
    private int item3;
    bjitem(){
    }


    bjitem(String item1, String item2, int item3){
        this.item1=item1;
        this.item2=item2;
        this.item3=item3;

    }

    public String getItem1() {
        return item1;
    }

    public void setItem1(String item1) {
        this.item1 = item1;
    }

    public String getItem2() {
        return item2;
    }

    public void setItem2(String item2) {
        this.item2 = item2;
    }

    public int getItem3() {
        return item3;
    }

    public void setItem3(int item3) {
        this.item3 = item3;
    }
}
