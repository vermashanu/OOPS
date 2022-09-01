class ExampleOfHierarchialInheritance{
    public static void main(String args[]){
    Fish shark = new Fish();
    shark.eat();
    Bird peacock = new Bird();
    peacock.breathe();
    }
}


//example of hierarchail inheritance
class Animal{
   String color;

   void eat(){
       System.out.println("eats");
   }

   void breathe(){
       System.out.println("breathes");
   }
}

class Fish extends Animal{
   int fins;
   void swim(){
       System.out.println("swims");
   }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}