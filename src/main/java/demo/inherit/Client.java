package demo.inherit;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/20 21:15
 * @content
 *
 * Private Members in a Superclass
 *
 *  A subclass does not inherit the private members of its parent class.
 *  However, if the superclass has public or protected methods for accessing its private fields,
 * these can also be used by the subclass.
 *
 *  A nested class has access to all the private members of its enclosing class—both fields and methods.
 *  Therefore, a public or protected nested class inherited by a subclass has indirect access to all of the private members of the superclass.
 */
public class Client {
    public static void main(String[] args) {
        InheritObj inheritObj = new InheritObj();
        inheritObj.getN4();
        System.out.println(inheritObj);
    }
}
