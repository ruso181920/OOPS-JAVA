

public class Inheritance {
    public static void main(String[] args) {
        Fish sharks=new Fish();
        sharks.feed("Smaller fishes");
        sharks.heart(3);
        sharks.fins=2;
        System.out.println("no of fins: "+sharks.fins);
    }
}

// base class or parent class
class Animal {
    void feed(String food) {
         System.out.println( "it's food is " + food);
    }
    void heart (int num){
     System.out.println("it's heart is "+num+" chambered" );
    }
}
//derived class or child case
// it's sigle level inhritance
class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("it's Swim.");
    }
}
