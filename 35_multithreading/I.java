class EThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i = 0; i < 100; i++) {
            System.out.println(i + " - run() - " + x.getName());
        }
    }
}

class I {
    public static void main(String[] args) {
        EThread a = new EThread();
        a.setName("Rahu");
        a.start();

        Thread x = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            if(i == 15) {
                try {
                    Thread.sleep(1000); // jis thread me beth ke yeh loop run ho rha usme i ki value jab 15 ho jayghi tab jis thread me bethe h voh 1000millisecond k liye sleep me jaygha or phir vha se direct running state me nhi , runnable pool me ayegha jisse phir voh runnable state me ajegha or phir voh schduler ke choose par running state me ayegha or phir vhi se continue karegha aanghe apna code of execution.
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(i + " - main() - " + x.getName());
        }
    }    
}