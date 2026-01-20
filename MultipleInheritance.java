public class MultipleInheritance {
    public static void main(String[] args) {
        Duck d1=new Duck();
        d1.move();
    }
}

interface Swimmer {
    void move();
}

interface Flyer {
    void move();
}

// Duck implements both, providing its own logic for 'move'
class Duck implements Swimmer, Flyer {
    public void move() {
        System.out.println("The duck is moving in water or air.");
    }
}