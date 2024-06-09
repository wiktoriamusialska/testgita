package src;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if (file.delete()) {
            System.out.println("Usunieto");
        } else {
            System.out.println("Nie udalo sie");
        };
    }
}
