package src;

public class Tablice {
    public static void main(String[] args) {
        String [] imiona = new String[3];
        imiona[0]="Agata";
        imiona[1]="Beata";
        imiona[2]="Celina";

        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);

        int[] lottoNumbers = new int[] {1,2,3,4,5,6};
        System.out.println(lottoNumbers[0]);
        System.out.println(lottoNumbers[1]);
        System.out.println(lottoNumbers[2]);
        System.out.println(lottoNumbers[3]);
        System.out.println(lottoNumbers[4]);
        System.out.println(lottoNumbers[5]);

        System.out.println("Liczba elementów " + lottoNumbers.length);

        for (int i=0; i<imiona.length; i++){
            System.out.println(imiona[i]);
        }
    }
}
