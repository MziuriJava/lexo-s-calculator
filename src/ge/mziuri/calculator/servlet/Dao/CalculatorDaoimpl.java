package ge.mziuri.calculator.servlet.Dao;

public class CalculatorDaoimpl implements Calculatordao {

    public int operation1 (int number1, int number2, String operation){

        if(operation.equals("/")) return number1/number2;
        if(operation.equals("*")) return number1*number2;
        if(operation.equals("-")) return number1-number2;
        if(operation.equals("+")) return number1+number2;

        return -1;
    }
}
