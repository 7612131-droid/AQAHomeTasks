package java_hw_2;

public class Task3 {
    public static void main(String[] args) {

        String sentence = "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";

        String lowerSentence = sentence.toLowerCase();

        String[] pieces = lowerSentence.split("a", -1);

        int result = pieces.length - 1;

        System.out.println("Символ 'a' (в обох регістрах) зустрічається у рядку: " + result + " разів.");
    }

}



