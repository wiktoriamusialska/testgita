package src;

import java.util.HashMap;
import java.util.Map;

public class MapyTest {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1,"Basia"); //definiowanie wartosci
        students.put(2,"Tomek");
        students.put(3,"Basia");
        students.put(2,"Krysia");//podmienia sie

        System.out.println(students.get(1));
        System.out.println(students.get(2));

        Map<Integer, String> otherStudents = new HashMap<>();
        otherStudents.putAll(students);

        System.out.println(students.containsKey(1));
        System.out.println(students.containsValue("Paweł"));
        System.out.println(students.isEmpty());
        System.out.println(students.size());
        students.remove(1);
        System.out.println(students.size());

        //1way
        for (Integer key : students.keySet()){
            System.out.println(key);
            System.out.println(students.get(key));
        }
        //2way
        for (String student : students.values()){
            System.out.println(student);
        }
    }
}
