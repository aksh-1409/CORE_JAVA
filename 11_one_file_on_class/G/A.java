//jab same folder me bas aise hi example kiya h matlb A.java and X.java are in same folder

class A {
    public static void main(String[] args) {
        B x = new B();

        x.pro();
    }
}

/*A.java:3: error: cannot find symbol
        B x = new B();
        ^
  symbol:   class B
  location: class A
A.java:3: error: cannot find symbol
        B x = new B();
                  ^
  symbol:   class B
  location: class A
2 errors*/

