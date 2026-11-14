package java_hw_11.java_hw_11_1;

import java.util.List;

@FunctionalInterface
public interface SessionCloser {
    void closeSession(List<CanBeClosed> entities);

    SessionCloser closer = entities -> {
        for (CanBeClosed entity : entities) {
            entity.close();
        }
    };
}
