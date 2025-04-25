interface EE { }

class Y2 implements EE { }

class C2 {
    public static void main(String[] args) {
        EE a = new Y2();
    }    
}