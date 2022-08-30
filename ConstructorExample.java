class ConstructorExample{
public static void main(String args[]){
  Student s1 = new Student();
  Student s2 = new Student("Shivani");
  System.out.println(s2.name);
  
}
}


class Student{
    String name;
    int roll;
    
    Student(){  // Non-parameterized constructor
        System.out.println("Constructor is called..");
    }

    Student(String name)   // parameterized constructor
    {
      this.name = name;
    }
    
}