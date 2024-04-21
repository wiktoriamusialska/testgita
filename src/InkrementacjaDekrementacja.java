package src;

public class InkrementacjaDekrementacja {
    public static void main(String[] args) {
        //inkrementacja - zwiększanie o 1
        int a =0;
        System.out.println("Wartość a: "+a); //0
        int b=a++; //postinkrementacja
        System.out.println("Wartość b: "+b);//0  najpierw stara wartość jest przypisywana do b
        System.out.println("Wartość a: "+a);//1
        int c=++a; //preinkrementacja
        System.out.println("Wartość c: "+c); //2 nowa wartość jest przypisana do c
        System.out.println("Wartość a: "+a); //2

        //dekrementacja - zmniejszanie o 1
        int d =0;
        System.out.println("Wartość d: "+d); //0
        int e=d--; //postdekrementacja
        System.out.println("Wartość e: "+e);//0
        System.out.println("Wartość d: "+d);//-1
        int f=--d; //predekrementacja
        System.out.println("Wartość f: "+f); //-2
        System.out.println("Wartość d: "+d); //-2
    }



}
