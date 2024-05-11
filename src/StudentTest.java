package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student student1= new Student();
        student1.imie ="XXX";
        student1.nazwisko="YYY";
        student1.nick="xxxyyy";
        student1.email="xxx.yyy@cos.pl";
        student1.numerIndeksu=123456;

        Student student2= new Student();
        student2.imie ="AAA";
        student2.nazwisko="BBB";
        student2.nick="aaabbb";
        student2.email="aaa.bbb@cos.pl";
        student2.numerIndeksu=456789;

        Student student3= new Student();
        student3.imie ="DDD";
        student3.nazwisko="EEE";
        student3.nick="dddeee";
        student3.email="ddd.eee@cos.pl";
        student3.numerIndeksu=192837;

        /*String [] uczniowie = new String[3];
        uczniowie[0]=student1.toString();
        uczniowie[1]=student2.toString();
        uczniowie[2]=student3.toString();

        for (int i=0; i<uczniowie.length; i++){
            String temp=uczniowie[i];
            System.out.println(temp);
        } */
        /*
        List<Object> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        System.out.println(list);
        // convert the list to an array
        Object[] array = list.toArray();

        // print the elements of the array
        for (Object element : array) {
            System.out.println(element);
        } */
        Student[] uczniowie = new Student[3];
        uczniowie[0]=student1;
        uczniowie[1]=student2;
        uczniowie[2]=student3;

        for (int i=0; i<uczniowie.length; i++){
            System.out.println("Uczeń " + i + " " + uczniowie[i]);
            uczniowie[i].przedstawSie();
            uczniowie[i].zalogujSie();
            uczniowie[i].podajEmail();
            uczniowie[i].podajNumerIndeksu();


}}}
