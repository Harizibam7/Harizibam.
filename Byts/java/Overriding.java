/**
 * Overriding
 */
public class Overriding {

    public static void main(String[] args){
        System.out.println("Hi there");
    }
}
// class A {
//     public Object m1(){
//         return null;
//     }
// }
// class B extends A{
//     public String m1(){
//         return null;
//     }
// }

class A{
    public String m1(){
        return null;
    }
}

class B extends A{
    public Object m1(){
        return null;
    }
}