class X1{
    //overriden method
    void pro(){
        System.out.println("Heloo");
        
    }
}

class A extends X1{
    //overriding method
    void pro(){  //parameter body matches with the parent class method
        System.out.println("Namaskaram");
    }
    public static void main(String args[]){
        A x = new A();
        x.pro(); 
        x.pro();
    }
}