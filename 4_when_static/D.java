class Student4 {
    String name;
    int age;

    static int maxAge = 20;

    public static void main(String[] args) {
        Student4 a = new Student4();
        a.name = "om";
        a.age = 9;
        
        Student4 b = new Student4();
        b.name = "ram";
        b.age = 12;

        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(a.maxAge);
        System.out.println(b.name);
        System.out.println(b.age);
        System.out.println(b.maxAge);
    }
}