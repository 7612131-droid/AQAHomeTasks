package java_hw_9.singleton;

public class Main {
    public static void main(String[] args) {
        Vehical vehical = Vehical.getInstance();
        Vehical vehical1 = Vehical.getInstance();
        Vehical vehical2 = Vehical.getInstance();
        Vehical vehical3 = Vehical.getInstance();




        System.out.println(vehical);
        System.out.println(vehical1);
        System.out.println(vehical2);
        System.out.println(vehical3);
    }
}
