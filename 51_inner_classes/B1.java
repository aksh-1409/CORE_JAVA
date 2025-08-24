class B1 {
    Object pro() {
        class ABCD {
            ABCD() {
                System.out.println("HI");
            }
        }

        ABCD x = new ABCD();

        return x;
    }   

    public static void main(String[] args){
        B b = new B();

        System.out.println(b.pro());
    }
}

