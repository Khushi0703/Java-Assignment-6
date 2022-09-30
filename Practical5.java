import java.lang.Thread; 
class Producer extends Thread{
StringBuffer buffer; 
Producer()
{
buffer - now StringBuffer(4);
}
public void run()
{
for (int i = 0; i < 4; i++) {
try{
buffer.append(i); 
System.out.println("Produced " + i);
}
catch (Exception e) {
e.printStackTrace();
}
}
System.out.println("Buffer is Full"); 
Consumer c = new Consumer (this);
}
}
class Consumer extends Thread{
Producer p; 
Thread t2;
 Consumer (Producer temp)
 {
p = temp;
 t2 = new Thread(this); 
 t2.start();
 public void run()
 {
 try{
 for (int i = 0; i < 4; i++) {
    {
         System.out.print (p.buffer.charAt(i) + " ");
    }
 catch (Exception e) {
 e.printStackTrace();
 }
 System.out.println("\nBuffer is Empty");
 }
}
class ProducerConsumer 
public static void main(String args[])
{
Producer p = new Producer(); 
Thread t1 = new Thread (p);
t1.start();
}
 }
