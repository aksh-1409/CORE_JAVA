class Student5{
    String name;
    int age;

    static int maxAge = 20;

    public static void main(String[] args){
        Student5 a = new Student5();
        a.name = "om";
        a.age = 9;
        
        a.maxAge = 50;
        Student5 b = new Student5();
        b.name = "ram";
        b.age = 12;
        b.maxAge = 60;

        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(a.maxAge);
        System.out.println(b.name);
        System.out.println(b.age);
        System.out.println(b.maxAge);
    }
}