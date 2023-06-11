# Ex-8 Using Inheritance one class can acquire the properties of others.
## AIM:
To write a program using Inheritance one class can acquire the properties of others.
## PROCEDURE:
### STEP 1:
Create class Animal which has variable name and eat function.
### STEP 2:
Create class Dog which extends Animal class.
### STEP 3:
Inside main function create an object for Dog.
### STEP 4:
Through that object give the name and call eat and bark function.
### STEP 5:
End the program.
## PROGRAM:
```java
class Animal{
    protected String name;

    public void eat() {
        System.out.println("Animal is eating.");
    }
}
class Dog extends Animal {
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
```
## OUTPUT:
![image](https://github.com/Karthikeyan21001828/Java_EX08/assets/93427303/c574d6a6-1b67-4de2-a736-6f1a35c6839e)
## RESULT:
A program using Inheritance one class can acquire the properties of others has been executed successfully.
