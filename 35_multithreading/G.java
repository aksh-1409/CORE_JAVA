class CThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            System.out.println(i + " - run() - " + x.getName());
        }
    }
}

class G {
    public static void main(String[] args) {
        CThread a = new CThread();
        a.setName("Raju");

        a.start();
        a.start();

        Thread x = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            System.out.println(i + " - run() - " + x.getName());
        }
    }    
}




// Exception in thread "main" java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.start(Thread.java:802)
//         at G.main(G.java:17)