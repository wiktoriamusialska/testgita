package src;

import java.sql.Driver;

public enum DriverType { //OGRANICZONA LICZBA - TYP WYLICZENIOWY
    CHROME("chrome", "C:\\Users\\DELL\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe"),
    FIREFOX("firefox","C:\\Users\\DELL\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\firefoxdriver.exe");

    //po zdefiniowaniu mozemy sie odwolac
    //konstruktory w enumie

    String name;
    String path;
    private DriverType(String name, String path){
        this.name=name;
        this.path=path;
    }

}
