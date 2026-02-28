class Animal {
    private String name;
    private int age;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Base method
    void sound() {
        System.out.println("Some generic animal sound");
    }

    // Overloaded method (calls the specific sound multiple times)
    void sound(int times) {
        for (int i = 0; i < times; i++) {
            sound(); // This will call the overridden version in the subclass
        }
    }
}

// Subclasses now correctly extend 'Animal'
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark bark!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow meow!");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Moo moo!");
    }
}

public class Seatwork3 { // Renamed to Main for standard execution
    public static void main(String[] args) {
        // Dog Object
        Dog dog = new Dog();
        dog.setName("Buddy");
        dog.setAge(3);

        // Cat Object
        Cat cat = new Cat();
        cat.setName("Kitty");
        cat.setAge(2);

        // Cow Object
        Cow cow = new Cow();
        cow.setName("Bessie");
        cow.setAge(5);

        // Testing Polymorphism and Overloading
        System.out.println(dog.getName() + " (Age: " + dog.getAge() + ") says: ");
        dog.sound(3); // Prints "Bark bark!" 3 times

        System.out.println("\n" + cat.getName() + " says: ");
        cat.sound();

        System.out.println("\n" + cow.getName() + " says: ");
        cow.sound(2);
    }
}