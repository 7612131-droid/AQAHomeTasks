package java_hw_12.java_hw_12_1;

public class Calculator {

    public int add(int a, int b){
        return a+b;
    }
    public int minus (int a, int b){
        return a-b;
    }
    public int multiply (int a, int b){
        return a*b;
    }
    public int divide (int a, int b) throws DivisionByZeroException{
        if (b==0){
            throw new DivisionByZeroException("Error!!! Division by zero is impossible!");
        }
        return a/b;
    }

}
