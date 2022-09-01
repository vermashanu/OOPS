class StaticKeywordExample{
    public static void main(String args[]){  //main - static function : classical example
    Student s1 = new Student();
    s1.schoolName = "JNV";

    Student s2 = new Student();
    System.out.println(s2.schoolName);
    }
}

class Student{
    static int returPercentage(int math, int phy, int chem){
    return (math +phy + chem) / 3;           // static function : formula will not change for different student
    } 
    String name;
    int roll;

    static String schoolName;   //same name of the school, that's why, static keyword is used.

    void setName(String name){
        this.name = name;
    }
    //getter
    String getName(){
        return this.name;
    }
}