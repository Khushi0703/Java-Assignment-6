public class Hello implements Runnable
{
@Override 
public void run()
{
    System.out.println("Hello World");

}
public static void main(String[] args)
{
    Hello tl=new Hello() ;
    tl.run();
}
}