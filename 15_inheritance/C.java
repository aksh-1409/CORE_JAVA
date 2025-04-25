class X1{
    void pro(){
        System.out.println("Hello");
    }
}

class C extends X1{
    public static void main(String[] args){

        C a = new C();
        a.pro();
        System.out.println(a.toString());
        System.out.println(a.hashCode());
    }
}