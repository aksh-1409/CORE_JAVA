class Y4 {
    private void pro() {
        System.out.println("pro method in parent Y4");
    }
}

//NOT A METHOD OVERRIDING --------------------
class M extends Y4 {   
    private void pro() {
        System.out.println("pro method in child M");
    }

    // void pro() {
    //     System.out.println("pro method in child M");
    // }


    // protected void pro() {
    //     System.out.println("pro method in child M");
    // }


    // public void pro() {
    //     System.out.println("pro method in child M");
    // }
}