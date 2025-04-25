class Y3 {
    public void pro() {
        System.out.println("pro() in Y3 parent");
    }
}

class L extends Y3 {
    // attempting to assign weaker access privileges; was public
    // private void pro() {
    //     System.out.println("pro() in L child");
    // }

    // attempting to assign weaker access privileges; was public
    // void pro() {
    //     System.out.println("pro() in L child");
    // }    

    // attempting to assign weaker access privileges; was public
    // protected void pro() {
    //     System.out.println("pro() in L child");
    // }    

    // public void pro() {
    //     System.out.println("pro() in L child");
    // }    
}