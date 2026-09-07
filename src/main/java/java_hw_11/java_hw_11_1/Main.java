package java_hw_11.java_hw_11_1;

import java.util.List;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyBrowser browser = new MyBrowser();
        MyFile file = new MyFile();

        List<CanBeClosed> entities = new ArrayList<>();

        entities.add(browser);
        entities.add(file);

        SessionCloser closer = list -> list.forEach(CanBeClosed::close);
        closer.closeSession(entities);
    }
}
