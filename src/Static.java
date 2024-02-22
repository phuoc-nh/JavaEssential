public class Static {
    public static final String BRAND = "abc";

    // init static batch
    static {
        var a = "a";
        var b = 1;
    }

    public static void main(String[] args) {
        //      static mean belongs to class not instance -> share specific data across object.
        var alex = new Person("alex");
        var bob = new Person("bob");
        System.out.println(Person.createdPeople);
    }

    static class Person {
        static int createdPeople = 0;
        String name;
        Person(String name) {
            this.name = name;
            createdPeople++;
        }
    }
}
