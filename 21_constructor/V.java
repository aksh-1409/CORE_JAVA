class YY {
    YY(int a) {
        System.out.println("Hello");
    }
}

class V extends YY {
    public static void main(String[] args) {
        System.out.println("A");
        V x = new V();
        System.out.println("B");
    }    
}

// IDHAR PE DISCUSSION HO RHA H KI WHY WE NEED TO HAVE TO WRITE SUPER() IIF ALREADY THE CONSTRUCTOR MAKES IT FOR US IN V, V1,V2.java,
// V.java:7: error: constructor YY in class YY cannot be applied to given types;
// class V extends YY {
// ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error