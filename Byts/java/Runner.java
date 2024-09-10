public class Runner {
    public static void main(String[] args) throws Exception{
        Object obj = Class.forName(args[0]).newInstance();
        //obj.eat(); //Compilation Error find symbol eat() 
        Animal a = (Animal)obj;
        a.eat();
    }
}
