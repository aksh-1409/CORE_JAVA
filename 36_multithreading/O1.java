class O1 {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        boolean flag = x.isDaemon();

        System.out.println(flag);

       x.setDaemon(true);
       boolean flag1 = x.isDaemon();
    System.out.println(flag1);

    }    
}

/*
false
Exception in thread "main" java.lang.IllegalThreadStateException
        at java.base/java.lang.Thread.setDaemon(Thread.java:1414)
        at O1.main(O1.java:9)*/

        /*you cannot set the daemon property after one time*/