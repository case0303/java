package day19.lamda;

public class LamdaEx5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Outer o = new Outer();
        o.method();
    }

}

@FunctionalInterface
interface LamdaIF5 {
    void method();
}

class Outer {
    public int iv = 10;

    void method() {
        final int iv = 40;
        LamdaIF5 f5 = () -> {
            System.out.println("Outer.this.iv:" + Outer.this.iv);
            System.out.println("this.iv:" + this.iv);
            System.out.println("iv:" + iv);
        };
        f5.method(); 
    }
}
