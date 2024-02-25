import java.io.File;
import java.io.IOException;

public class WorkWithFiles {
    public static void main(String[] args) {
        File file = new File("src/data.csv");
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println(file.getName() + " file created");
            } catch (IOException e) {
                System.out.println("Error creating file");
            }
        }




    }
}
