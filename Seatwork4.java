class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);  
    }
} 

public class Seatwork4 {
    public static void main(String[] args) {
        Person p = new Person();
        
        p.name = "JAYY";
        p.age = 16;
        
        p.displayInfo();    
    }
}