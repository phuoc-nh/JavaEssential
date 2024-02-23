public class Dog  extends  Animal{
    private String breed;
    public Dog(String name, String breed) {
        super(name); // super means name arg will be passed into super class which is Animal
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("WOOF");
    }
}
