package java_hw_6_2_2;

public class TrimProcessor implements TextProcessor {

    @Override
    public String process(String text) {
        return text.trim();
    }
}