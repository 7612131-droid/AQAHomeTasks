package java_hw_9.singleton;

public class Vehical {
    private static Vehical instance;

    private Vehical() {

    }

    public static Vehical getInstance() {
        if (instance == null) {
            instance = new Vehical();
        }
        return instance;
    }

    public void postRequest() {

    }

    public void getRequest() {

    }

    public void deleteRequest() {

    }

    public void putRequest() {

    }
}
