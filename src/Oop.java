public class Oop {
    public static void main(String[] args) {
//        Animal animal = new Animal("Roo");
        Dog dog = new Dog("Foo", "Bull");
        Cat cat = new Cat("Z");

        // 2 form of makeSound func called polymorphism
        dog.makeSound();
        cat.makeSound();

    }
}
