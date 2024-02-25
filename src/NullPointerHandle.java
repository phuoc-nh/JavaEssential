import java.util.Optional;

public class NullPointerHandle {
    public static void main(String[] args) {
        String brand = null;
//        System.out.println(brand.toUpperCase());
        var x = Optional.ofNullable(brand).orElse("Samsung");
        var y = Optional.ofNullable(brand).orElseGet(() -> {
            // Some logic here
            return "another";
        });
        var z = Optional.ofNullable(brand)
                .map(String::toUpperCase)
                .orElse("Samsung");

        System.out.println("x " + x);
        System.out.println("y " + y);
    }

}
