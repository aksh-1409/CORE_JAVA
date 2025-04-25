class student1{
    static String name;
    static int age;

    public static void main(String[] args){
        student1 a = new student1();
        a.name="mohan";
        a.age=20;

        student1 b = new student1();
        b.name="dinesh";
        b.age=21;

        student1 c = new student1();
        c.name="om";
        c.age=22;

        System.out.println(b.name);
        System.out.println(b.age);
        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(c.name);
        System.out.println(c.age);
    }
}