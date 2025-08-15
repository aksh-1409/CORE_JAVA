import java.io.File;

class F2 {
    public static void main(String[] args) {
        File file = new File("remo");

        String absolutePath = file.getAbsolutePath();

        System.out.println("folder remo's absolute path: " + absolutePath);
    }    
}