class Y2 {

}

class W extends Y2 {
    W() {
        super(2);
    }    
}



// W.java:7: error: constructor Y2 in class Y2 cannot be applied to given types;
//         super(2);
//         ^
//   required: no arguments
//   found:    int
//   reason: actual and formal argument lists differ in length
// 1 error