package src;

public class MethodName {
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){ //kolejny parametr rozwiazuje problem tych samych nazw w metodach
        System.out.println(a+b +c);
    }
    public void add(int a){ //kolejny parametr/usuniety rozwiazuje problem tych samych nazw w metodach - przeciazenie
        System.out.println(a);
    }
    public void add(String a){ //zmiana typu zmiennej tez pomaga
        System.out.println(a);
    }
    public void add(){
        System.out.println(2+1);

    }
}
