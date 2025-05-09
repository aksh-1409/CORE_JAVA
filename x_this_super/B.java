class B {
    static void pro() {
        System.out.println(this);
    }

    static {
        System.out.println(this);
    }

    B() {
        super(this);
    }
}

/*B.java:3: error: non-static variable this cannot be referenced from a static context
        System.out.println(this);
                           ^
B.java:7: error: non-static variable this cannot be referenced from a static context
        System.out.println(this);
                           ^
B.java:11: error: cannot reference this before supertype constructor has been called
        super(this);
              ^
B.java:11: error: constructor Object in class Object cannot be applied to given types;
        super(this);
        ^
  required: no arguments
  found:    B
  reason: actual and formal argument lists differ in length
4 errors*/