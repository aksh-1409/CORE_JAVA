interface W3 {
    void ccc();
}

class I1 {
    // anonymous inner class...
    W3 x = new W3() {
        public void ccc() {

        }
    };

    public static void main(String[] args){
       //method anonymous inner class
        W3 y = new W3() {
        public void ccc(){

        }
    };
    }
}