public class Priority extends Thread
{
    public void run()
{
    System.out.println("running...");
}
public static void main(String args[])
{
//creating one thread
 Priority t1=new Priority(); 
 Priority t2=new Priority(); 
 Priority t3=new Priority();
// set the priority 
tl.setPriority (3); 
t2.setPriority (5);
 t3.setPriority (7); 
 // print the user defined priority
System.out.println("Priority of thread ti is: " + t1.getPriority());
System.out.println("Priority of thread t2 is: " + t2.getPriority ()+" (default)");
System.out.println("Priority of thread t3 is: " + t3.getPriority());
t1.start();
}
}