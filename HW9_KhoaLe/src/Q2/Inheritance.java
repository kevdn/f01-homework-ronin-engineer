package Q2;

class Animal {
    public void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog barks");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();
    }
}
