public class MultiLevelInherit {
     public static void main(String[] args) {
        Sapiens human=new Sapiens();
        human.feed("Fruits,vegatables,meat");
        human.heart(4);
        human.legs=2;
        System.out.println("human has :"+ human.legs +" legs");
        human.CranialCapacity=1200;
        System.out.println("Cranical capacity is :"+human.CranialCapacity);
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
class Mammal extends Animal {
    int legs;
    void bloodType(String blood ) {
        System.out.println("it's "+blood);
    }
}
class Sapiens extends Mammal {
    int CranialCapacity;
    void extincted(boolean ans) {
      System.out.println( "Extincted : "+ ans );
    }
}

