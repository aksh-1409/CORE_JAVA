interface W2 {
    void bbb();
}

class H {
    public static void main(String[] args) {
        // method local anonymous inner class...
        W2 t = new W2() {
            public void bbb() {
                System.out.println("Namaskar");    
            }
        };

        t.bbb();
        System.out.println(t);
    }    
}