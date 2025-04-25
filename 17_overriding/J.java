class Y1 {
    void pro() {
        System.out.println("pro() in parent");
    }
}

class J extends Y1 {

  //  Private Access Control..
  //  attempting to assign weaker access privileges; was package
    private void pro() {
        System.out.println("pro() in child");
    }  

//     J.java:11: error: pro() in J cannot override pro() in Y1
//     private void pro() {
//                  ^
//   attempting to assign weaker access privileges; was package
// 1 error


    // Public Access Control..
    // public void pro() {
    //     System.out.println("pro() in child");
    // }  

    // Protected Access Control..
    // protected void pro() {
    //     System.out.println("pro() in child");
    // }  

    // Default Access Control...
    // void pro() {
    //     System.out.println("pro() in child");
    // }  
}