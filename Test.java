class P{
    P(){
        System.out.println(this.hashCode());
    }
}
class C extends P{
     C(){
        System.out.println(this.hashCode());
     }
}
// Starting point of Code
public class Test {
    public static void main(String[] args){
        C obj=new C();
        System.out.println(obj.hashCode());
               
    } 
    
}
