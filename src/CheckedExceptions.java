package src;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {


    public static void main(String[] args){
        try {
            System.out.println("Before reading file");
            readFile("C:\\Users\\DELL\\IdeaProjects\\testgita\\src\\tests.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Wyjatek zostal wyrzucony");
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        } finally {
            System.out.println("Closing file");
        }
    }
    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }

    }

