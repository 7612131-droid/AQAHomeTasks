package java_hw_2;

public class Task2 {
    public static void main(String[] args) {
        String frase = "Testing, is my favourite job";

        String[] words = frase.split(" ");

        for (int i = 0; i < words.length; i++) {

            System.out.println("Слово" + (i + 1) + " = " + words[i] + ", Довжина цього слова = " + words[i].length());
        }
        int maxLength = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
            }
        }

        boolean compare = (words[0].length() > maxLength) ? true : false;
        System.out.println(compare);
    }
}







