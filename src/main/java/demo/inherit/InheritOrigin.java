package demo.inherit;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/20 21:13
 * @content
 */
public class InheritOrigin {
    public String n1 = "n1";
    String n2 = "n2";
    protected String n3 = "n3";
    private String n4 = "n4";

    public String getN4(){
        return n4;
    }

    public void m1(){System.out.println("m1");}
    void m2(){System.out.println("m2");}
    protected void m3(){System.out.println("m3");}
    private void m4(){
        System.out.println("m4");
    }
}
