// Parent class
class Fruits {
    void color() {
        System.out.println("Fruits have different colors.");
    }
}

// Child class
class Mango extends Fruits {
    void taste() {
        System.out.println("Mangoes are sweet.");
    }
}

// Main class to demonstrate single inheritance
public class SingleInheritance {
    public static void main(String[] args) {
        // Creating an object of the child class
        Mango myMango = new Mango();
        
        // Calling methods from the child class and parent class
        myMango.color();  // Method from the parent class
        myMango.taste();  // Method from the child class
    }
}
