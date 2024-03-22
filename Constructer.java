class Student{
    static String name;
   static int age;
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
}

class Persion extends Student{
    int rollNo;
    int marks;

    /**
     * @param rollNo
     * @param marks
     */
    Persion(int rollNo, int marks){
          super(name, age)
          this.rollNo=rollNo;
          this.marks=marks;
    }

}




public class Constructer {
 public static void main(String[] args){
    System.out.println("Jay Shri Ram");
 }   
}