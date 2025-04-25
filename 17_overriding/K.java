class Y2 {
    protected void pro() {
        System.out.println("pro() in Parent");
    }
}

class K extends Y2 {  
    // attempting to assign weaker access privileges; was protected  
    // private void pro() {
    //     System.out.println("pro() in Child");
    // }

    // attempting to assign weaker access privileges; was protected
    // void pro() {
    //     System.out.println("pro() in Child");
    // }
    

    // public void pro() {
    //     System.out.println("pro() in Child");
    // }


    // protected void pro() {
    //     System.out.println("pro() in Child");
    // }
}