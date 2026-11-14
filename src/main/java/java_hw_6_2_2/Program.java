package java_hw_6_2_2;

public class Program {
    public static void main(String[] args) {
        String text = " Hello. I. am. a. student. ";

        UpperCaseProcessor upperCaseProcessor = new UpperCaseProcessor();
        ReverseProcessor reverseProcessor = new ReverseProcessor();
        TrimProcessor trimProcessor = new TrimProcessor();

        System.out.println("Upper case text");
        System.out.println(upperCaseProcessor.process(text));

        System.out.println("Remove");
        System.out.println(upperCaseProcessor.removeDigits(text));

        System.out.println("Reverse text");
        System.out.println(reverseProcessor.process(text));

        System.out.println("Remove");
        System.out.println(reverseProcessor.removeDigits(text));

        System.out.println("Trim text");
        System.out.println(trimProcessor.process(text));

        System.out.println("Remove");
        System.out.println(trimProcessor.removeDigits(text));
    }

}
