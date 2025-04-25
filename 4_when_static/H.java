class Circle {
    int radius;
    float pi = 3.14f;

    void defineCircle() {
        System.out.println("a round plane figure whose boundary (the circumference) consists of points equidistant from a fixed point (the centre)");
    }

    public static void main(String[] args) {
        // defineCircle();

        //or 

        Circle x = new Circle();
        x.radius = 45;

        Circle y = new Circle();
        y.radius = 78;

        x.defineCircle();
        y.defineCircle();
    }
}