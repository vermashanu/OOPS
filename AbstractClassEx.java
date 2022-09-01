public class AbstractClassEx{
    public static void main(String args[]){
    Horse h = new Horse();
    h.eat();
    h.walk();
   System.out.println(h.color);

    Chicken c = new Chicken();
    c.eat();
    c.walk();
    // Animal a = new Animal();  : can't create an object of an abstract class
    
    }
}

abstract class Animal{
    String color;
    Animal(){
    color = "brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
abstract void walk();  //doesn't have implemenattion here
}

class Horse extends Animal{
    void changeColor(){
        color = "white";
    }
    void walk(){
        System.out.println("walks on four legs");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}