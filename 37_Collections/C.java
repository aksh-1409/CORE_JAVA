import java.util.ArrayList;

class C {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        System.out.println(x);
        System.out.println(x.isEmpty());
        System.out.println(x.size());

        x.add(12);
        x.add(78);
        x.add(45);
        x.add(39);
        x.add(9);
        x.add(56);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(x);
        System.out.println(x.isEmpty());
        System.out.println(x.size());
    }
}