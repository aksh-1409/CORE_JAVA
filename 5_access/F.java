class F{
    public static void main(String[] args){
        F a = new F();
        System.out.println(a.w);
    }
}

class A2{
    int w = 999;
}

/*F.java:4: error: cannot find symbol
        System.out.println(a.w);
                            ^
  symbol:   variable w
  location: variable a of type F
1 error*/