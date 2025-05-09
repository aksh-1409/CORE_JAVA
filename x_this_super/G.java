class X1 {
    int y = 56;
}

class G extends X1 {
    int y = 99;
    public static void main(String[] args) {
        G g = new G();
        g.pro();
    }    

    void pro() {
        int y = 2;
        System.out.println(y);
        System.out.println(this.y);
        System.out.println(super.y);
    }
}