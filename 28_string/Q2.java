class Q2 {
    public static void main(String[] args) {
        String name = "Vikram Singh";
        int age = 19;
        float marks = 91.34f;
        
        // String x = "My Name is: " + name + " and my age is: " + age + " and my marks: " + marks;

        String x = String.format("My name is: %s and my age: %d and my marks: %.2f", name, age, marks);

        System.out.println(x);
    }    
}