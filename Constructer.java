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
          super(name, age);
          this.rollNo=rollNo;
          this.marks=marks;
    }

}




public class Constructer {
 public static void main(String[] args){
    System.out.println("Jay Shri Ram");
    Student s=new Student("Amit", 29);
    System.out.println(s.hashCode());
    System.out.println(s.name);
    System.out.println(s.age);

    Persion p=new Persion(29,101);
    System.out.println(p.hashCode());
    System.out.println(p.age);
    System.out.println(p.rollNo);
 }   
}