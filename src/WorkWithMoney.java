
import java.math.BigDecimal;

public class WorkWithMoney {
    public static void main(String[] args) {
//        double  numberOne = 0.02;
//        double  numberTwo = 0.03;
//
//        System.out.println("number2 - number 1 " + (numberTwo - numberOne));


        BigDecimal n1 = new BigDecimal("0.02");
        BigDecimal n2 = new BigDecimal("0.04");

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n2.subtract(n1));

        System.out.println(n1.compareTo(n2));


    }
}
