public class SuperKeywordExample{
    public static void main(String args[]){
    Horse h = new Horse();
    System.out.println(h.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super();   // if we don't write a super keyword here, java then automatically calls super by default
        super.color = "brown";
        System.out.println("Horse constructor is called");
    }
}