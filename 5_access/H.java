class H{
    public static void main(String[] args){
        H x = new H();
        x.pro();
}
}

class C1{
    void pro(){
        System.out.println("Heloo");
    }
}

/*H.java:4: error: cannot find symbol
        x.pro();
         ^
  symbol:   method pro()
  location: variable x of type H
1 error*/