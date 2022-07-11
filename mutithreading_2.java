class Hi2 implements Runnable
{
    public  void run()
    {
        for (int i =0;i<=5;i++)
        {
            System.out.println("hi");
            try { Thread.sleep(1000); }catch (Exception e) {}
        }
    }
}

class Hello2 implements Runnable
{
    public  void run()
    {
        for (int i =0;i<=5;i++)
        {
            System.out.println("hello");
            try { Thread.sleep(1000); }catch (Exception e) {}
        }
    }
}


public class mutithreading_2  {

    public static void main(String[] args) throws Exception {

        Hi2 obj1 = new Hi2();
        Hello2 obj2 = new Hello2();

        Thread t1= new Thread(obj1);
        Thread t2 = new Thread((obj2));

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
