abstract class X5 {
    abstract void bbb();
    abstract void aaa();
}

class L extends X5 {
    void aaa() {
        
    }

    // void bbb() {

    // }
}

/*L.java:6: error: L is not abstract and does not override abstract method bbb() in X5
class L extends X5 {
^
1 error*/