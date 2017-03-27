
package herencia;


public class Herencia {

    
    public static void main(String[] args) {
        A a = new A(5);
        System.out.println(a.getA1());
        
        
        B b = new B(10,5);
        System.out.println(b.getA1() + " " + b.getB1());
    }
    
}
