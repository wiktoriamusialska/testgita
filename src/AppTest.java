package src;

public class AppTest {
    public static void main(String[] args) {
        AndroidApp adapp= new AndroidApp("phone 1");
        adapp.runAndroidApp();
        adapp.AppInfo();

        IphoneApp iapp = new IphoneApp("phone 2 ");
        iapp.runIphoneApp();
        iapp.AppInfo();

    }
}
