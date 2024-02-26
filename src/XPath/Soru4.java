package XPath;
/*
Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]

Calculate'e tıklayınız.

    İlk input'a herhangi bir sayı giriniz.

    İkinci input'a herhangi bir sayı giriniz.

Calculate button'una tıklayınız.

Sonucu alınız.

Sonucu yazdırınız.

 */

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru4 extends BaseDriver {

    @Test

    public void test1() {

        driver.get("https://testpages.eviltester.com/styled/index.html");

        WebElement calculator = driver.findElement(By.xpath("//a[@id='calculatetest']"));
        calculator.click();
        MyFunc.Bekle(2);

        WebElement sayi1 = driver.findElement(By.xpath("//form[@action='calculator']/div[1]/input[1]"));
        sayi1.sendKeys("15");

        WebElement sayi2 = driver.findElement(By.xpath("//form[@action='calculator']/div[1]/input[2]"));
        sayi2.sendKeys("16");
        MyFunc.Bekle(2);

        WebElement calculate = driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculate.click();
        MyFunc.Bekle(2);

        WebElement sonuc = driver.findElement(By.xpath("//form[@action='calculator']/following::span"));
        sonuc.getText();
        System.out.println("sonuc = " + sonuc.getText());

        BekleKapat();


    }

}
