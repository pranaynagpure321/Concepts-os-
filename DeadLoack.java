//deadloack with two threads


public class DeadLock {

    public static void main(String[] args) {

        final String a1= "Pranay";
        final String a2 = "Nagpure";

        Thread t1= new Thread(){

            public void run()
            {
                synchronized (a1)
                {
                    System.out.println(" a1 is accessed loacked");
                    try { Thread.sleep(1000);} catch (Exception e){}

                    synchronized (a2)
                    {
                        System.out.println(" a2 is accessed loacked");
                        try { Thread.sleep(1000);} catch (Exception e){}
                    }
                }
            }
        };

        Thread t2= new Thread() {

            public void run()
            {
                synchronized (a2)
                {
                    System.out.println("a2 is loacked accessd");
                    try { Thread.sleep(1000);} catch (Exception e){}

                    synchronized (a1)
                    {
                        System.out.println("a1 is loacked accessd");
                        try { Thread.sleep(1000);} catch (Exception e){}
                    }
                }
            }

        };

        t1.start();
        t2.start();

    }
}
