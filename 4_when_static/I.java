class Circle1 {
    int radius;
    static float pi = 3.14f;

    static void defineCircle() {
        System.out.println("a round plane figure whose boundary (the circumference) consists of points equidistant from a fixed point (the centre)");
    }

    public static void main(String[] args) {
        defineCircle();        

        Circle1 x = new Circle1();
        x.radius = 45;

        Circle1 y = new Circle1();
        y.radius = 78;

        x.defineCircle();
        y.defineCircle();
    }
}