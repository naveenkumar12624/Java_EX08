// Superclass
class Animal1{
    protected String name;

    public void eat() {
        System.out.println("Animal is eating.");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal1 {
    public void bark() {
        System.out.println("Dog is barking.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Max";   // Inherited from Animal class
        dog.eat();          // Inherited from Animal class
        dog.bark();         // Defined in Dog class
    }
}
