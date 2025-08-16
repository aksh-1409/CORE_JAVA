import java.io.File;

class timepass {
    public static void main(String[] args) {
        File file = new File("E:/timepass");

        System.out.println(file.delete());
    }
}