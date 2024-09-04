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

class Car{
    Engine e;
    Car(Engine e){
        this.e = e;
    }
    public void move(){
        e.start();
        System.out.println("Car is moving....");
    }
}

class Engine{
    public void start(){
        System.out.println("Engine Started");
    }
}
class Test{
    public static void main(String[] args){
        Engine e = new Engine();
        Car c = new Car(e); //Constructor Injection 
        c.move();
    }
}