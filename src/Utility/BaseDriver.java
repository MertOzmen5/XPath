package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriver {

    public static WebDriver driver;

    static { //bunun sarti extends olmasi ve basta yer almasi
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // Sayfa hata verirse 20 sn mühlet.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Elementi bulma mühleti 20 sn.
    }

    public static void BekleKapat() {

        MyFunc.Bekle(3);
        driver.quit();

    }
}
