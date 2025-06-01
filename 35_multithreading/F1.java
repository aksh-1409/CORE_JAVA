class BThread extends Thread{

     void method(){
        Thread a = Thread.currentThread(); 
          for(int i=0;i<30;i++)
       System.out.println("helli" + a.getName());

    }
        
    

    public void run(){
    Thread a = Thread.currentThread(); 

        method();
        for(int i=0;i<30;i++)
        System.out.println(i + " - run() - " + a.getName());
    }

}

class F1 {

    public static void main(String[] args){
        BThread x = new BThread();

        x.setName("golu");
        x.start();
        x.method();
        

        Thread a = Thread.currentThread();

        for(int i=0;i<30;i++){
            System.out.println(i + " - main() - " + a.getName());
        }
    }
}