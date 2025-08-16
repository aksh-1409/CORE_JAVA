import java.io.File;

class Delete{
    public static void main(String[] args){
    File file = new File("E:\\delete_folder");
    if(file.exists()){
    File[] arr = file.listFiles();     
    delete(arr , file);
    }
    }

    static void delete(File[] arr, File file){
        for(File next:arr){
            if(next.isDirectory()){
                delete(next.listFiles(), next);
            }
            else{
                next.delete();
            }
        }
        file.delete();
    }
}