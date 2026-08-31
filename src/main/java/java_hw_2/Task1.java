package java_hw_2;

public class Task1 {
    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        String string2 = string1.substring(0,36);
        String string3 = string2 + " " + "it is perfect";

        System.out.println(string2);
        System.out.println(string2.length());
        System.out.println(string3);
        System.out.println(string3.length());
    }


}
