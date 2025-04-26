class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }
}

class Q1 {
    public static void main(String[] args) {
        Student x = new Student("Mahendra", 15);

        System.out.println(x.name);
        System.out.println(x.age);

        Student y = new Student("Sarita", 9);

        System.out.println(y.name);
        System.out.println(y.age);
    }
}