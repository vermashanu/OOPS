class ExampleOfMultilevelInheritance{
    public static void main(String args[]){
    Dog doggy = new Dog();
    doggy.eat();
    doggy.legs = 4;
    System.out.println(doggy.legs);
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}


class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}