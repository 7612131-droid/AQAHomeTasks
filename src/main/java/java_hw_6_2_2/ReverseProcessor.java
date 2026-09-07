package java_hw_6_2_2;

public class ReverseProcessor implements TextProcessor{

    @Override
    public String process(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
