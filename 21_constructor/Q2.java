class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Q2 {
    public static void main(String[] args) {
        Student x = new Student("Mayannk", 21);

        System.out.println(x.name);
        System.out.println(x.age);

        Student y = new Student("Meenal", 18);

        System.out.println(y.name);
        System.out.println(y.age);
    }
}