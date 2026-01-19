public class Heirarchial {
    public static void main(String[] args) {
        Fishes shark=new Fishes();
          shark.fins=2;
          System.out.println("Fins: "+shark.fins);
          shark.feed("Smaller fishes");

        Sapiens human=new Sapiens();
          human.legs=2;
          System.out.println("legs: "+shark.fins);
          human.feed("veg,meat,fruits");


    }
}

class Animal {
    void feed(String food) {
         System.out.println( "it's food is " + food);
    }
    void heart (int num){
     System.out.println("it's heart is "+num+" chambered" );
    }
}
//derived class or child case
class Sapiens extends Animal {
    int legs;
    void bloodType(String blood ) {
        System.out.println("it's "+blood);
    }
}

class Fishes extends Animal{
    int fins;
    void swim(){
        System.out.println("it can swim");
    }
}

class Birds extends Animal{
   
    void fly(){
        System.out.println("it can fly");
    }
}


// 