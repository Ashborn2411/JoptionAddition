// Define an abstract class
abstract class Animal {
    // Abstract method (no body)
    public abstract void makeSound();
    // Concrete method
    public void eat() {
        System.out.println("The animal is eating.");
    }
}
// Define an interface
interface Flyable {
    void fly();
}
// Class extending the abstract class and implementing the interface
class Bird extends Animal implements Flyable {
    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }
    @Override
    public void fly() {
        System.out.println("The bird is flying.");
    }
}
// Another class extending the abstract class
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
public class PolymorphismExample {
    public static void main(String[] args) {
        // Create objects
        Animal myDog = new Dog();
        Animal myBird = new Bird();
        Flyable flyingBird = new Bird();
        // Demonstrate polymorphism
        myDog.makeSound(); // Outputs: Bark
        myDog.eat(); // Outputs: The animal is eating.
        myBird.makeSound(); // Outputs: Chirp
        myBird.eat(); // Outputs: The animal is eating.
        flyingBird.fly(); // Outputs: The bird is flying.
        // Using polymorphism to treat different animals uniformly
        Animal[] animals = {myDog, myBird};
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
