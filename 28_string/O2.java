class O2{
    public static void main(String[] args) {
        String x = "mohan";

        // String y = x + " kumar";
        // String y = x + true;
        // String y = x + 12;
        String y = x + new Student();

        System.out.println(x);
        System.out.println(y);

        Student s = (Student) y.subSequence(5,21);
        System.out.println(s.rollNo);
    }    
}

/*mohan
mohanStudent@452b3a41
Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class Student (java.lang.String is in module java.base of loader 'bootstrap'; Student is in unnamed module of loader 'app')
        at O2.main(O2.java:13)*/