 import java.util.Scanner;
 class Incre extends Thread
 {
    int n; 
    Incre(int n)
    {
        this.n=n;
    }

public void run()
{
n+=1;
 try { 
   sleep(1000); 
}
catch (InterruptedException e) { 
    e.printStackTrace();
}
System.out.println("Incremented number:"+n);
}
 }
public class Increment1{
    public static void main(String[] args)

    {
       Scanner sc=new Scanner (System.in);
        System.out.println("Enter Integer:"); 
        int n=sc.nextInt()
         Thread tl=new Incre (n); 
         t1.start();
}
}