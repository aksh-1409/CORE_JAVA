class Student3 {
    String name;
    int age;

    int maxAge = 20;

    public static void main(String[] args) {
        Student3 a = new Student3();
        a.name = "om";
        a.age = 9;
        // a.maxAge = 20;
        
        Student3 b = new Student3();
        b.name = "ram";
        b.age = 12;
        // b.maxAge = 20;

        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(a.maxAge);
        System.out.println(b.name);
        System.out.println(b.age);
        System.out.println(b.maxAge);
    }
}