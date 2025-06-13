class C1Runnable implements Runnable {
    public void run() {
        G.a.pro();        
    }
}

class C2Runnable implements Runnable {
    public void run() {
        G.b.info();
    }
}

class G {
    static G a = new G();
    static G b = new G();

    public static void main(String[] args) {
        new Thread(new C1Runnable(), "A").start();
        new Thread(new C2Runnable(), "B").start();       
    }   
    
    void pro() {
        synchronized(G.class) {
            String name = Thread.currentThread().getName();
            for(int i=0;i<40;i++) {
                try { Thread.sleep(200); } catch(InterruptedException e) { e.printStackTrace(); }
                System.out.println(i + " - " + name);
            }
        }
    }
    
    static void info() {        
        String name = Thread.currentThread().getName();
        for(int i=0;i<40;i++) {
            try { Thread.sleep(200); } catch(InterruptedException e) { e.printStackTrace(); }
            System.out.println(i + " - " + name);
        }        
    }
}