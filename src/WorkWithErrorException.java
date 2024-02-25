import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class WorkWithErrorException {
    public static void main(String[] args) throws FileNotFoundException, MyException {
        FileInputStream f = new FileInputStream("abc.txt");

        performDivision(1, 2);
    }

    static double performDivision(double a, double b) throws MyException {
        if (b == 0) {
            throw new MyException("Can not divide by 0");
        }

        return a / b;
    }

    static class MyException extends Exception {
        public MyException(String message) {
            super(message);
        }
    }
}
