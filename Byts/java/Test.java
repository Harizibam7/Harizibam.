// class A{
//     public void m1(){
//        System.out.println("A-m1"); 
//     }
// }
// class B extends A{
//     public void m2(){
//         System.out.println("B-m2");
//     }
// }
// public class Test{
//     public static void main(String[] args){
//         A a = new A();
//         a.m1(); // A-m1
//         // a.m2(); // Compilation Error : cannot find symbol a.m2();
//         B b = new B();
//         b.m1(); // A-m1
//         b.m2(); // B-m2
//         A a2 = new B();
//         a2.m1(); // A-m1
//         //a2.m2(); // Compilation Error : cannot find symbol a2.m2();
//         //B b2 = new A(); // Compilation Error: incompatible types: A cannot be converted to B 
//     }
// }

// class Student{
//     int sid;
//     String name;
//     String aadhar;
//     Student(int sid, String name, String aadhar){
//         this.sid = sid;
//         this.name = name;
//         this.aadhar = aadhar;
//     }
// }

// class Employee{
//     int eid;
//     String name;
//     String aadhar;
//     Employee(int eid, String name, String aadhar){
//         this.eid = eid;
//         this.name = name;
//         this.aadhar = aadhar;
//     }
// }

// abstract class Person{
//     String name;
//     String aadhar;
//     Person(String name, String aadhar){
//         this.name = name;
//         this.aadhar = aadhar;
//     }
// }

// class Student extends Person{
//     int sid;
//     Student(int sid, String name, String aadhar){
//         super(name,aadhar);
//         this.sid = sid;
//     }
// }
// class Employee extends Person{
//     int eid;
//     Employee(int eid, String name, String aadhar){
//         super(name, aadhar);
//         this.eid = eid;
//     }   
// }

// class Car{
//     Engine e;
//     Car(Engine e){
//         this.e = e;
//     }
//     public void move(){
//         e.start();
//         System.out.println("Car is moving....");
//     }
// }

// class Engine{
//     public void start(){
//         System.out.println("Engine Started");
//     }
// }
// class Test{
//     public static void main(String[] args){
//         Engine e = new Engine();
//         Car c = new Car(e); //Constructor Injection 
//         c.move();
//     }
// }



// class A{
//     public void m1(int a, float y){
//     }
//     public void m1(int x, float y){
//     }
// }


// class A{
//     public void m1(){
//         System.out.println("No-args");
//     }
//     public void m1(int x){
//         System.out.println("int-args");
//     }
// }

// class Test{
//     public static void main(String[] args){
//         A a = new A();
//         a.m1(); // Output: No-args
//         a.m1(10); // Output: int-args
//         a.m1(10.5,10); //C.E no suitable method found for m1(double,int)
//     }
// }


// public class Test{
//     public static void m1(int a){
//         System.out.println("int-args");
//     }
//     public static void m1(float f){
//         System.out.println("float-args");
//     }  
//     public static void main(String[] args){
//         m1(10); //int-args
//         m1(10.5f); //float-args
//         m1('a'); //int-args
//         m1(10l); //float-args
//         m1(10.5); //error: no suitable method found for m1(double)
//         m1(true); //error: no suitable method found for m1(boolean)
//     }
// }



// class Test{
//     public static void m1(int a, float f){
//         System.out.println("int-float");
//     }
//     public static void m1(float f, int a){
//         System.out.println("float-int");
//     }
//     public static void main(String[] args){
//         m1(10,10.5f);
//         m1(10.5f,10);
//         // m1(10,10);
//         m1(10.5, 10.5 ); // error: no suitable method found for m1(double,double)
//     } 
// }

class Test{
    public void m1(String s){
        System.out.println("String-args");
    }
    public void m1(Object o){
        System.out.println("Object-args");
    }
    public static void main(String[] args){
        Test t = new Test();
        t.m1(new String()); //String-args
        t.m1(new Object()); //Object-args
        t.m1(null); //String-args
    }
}