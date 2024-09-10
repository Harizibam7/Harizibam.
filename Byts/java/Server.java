public class Server{
    public static void main(String[] args) throws Exception{
        Object obj = Class.forName(args[0]).newInstance();
        Servlet s = (Servlet)obj;
        s.service();
    }
}