class student2{
     String name;
     int age;

    public static void main(String[] args){
        student2 a = new student2();
        a.name="mohan";
        a.age=20;

        student2 b = new student2();
        b.name="dinesh";
        b.age=21;

        student2 c = new student2();
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