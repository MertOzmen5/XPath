package XPath;
/*
1) Bu siteye gidin. -> https://demo.applitools.com/


        2) Username kısmına "ttechno@gmail.com" girin.

        3) Password kısmına "techno123." girin.

        4) "Sign in" buttonuna tıklayınız.

        5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.

 */

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru2 extends BaseDriver {

    @Test

    public void test1() {

        driver.get("https://demo.applitools.com/");

        WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Enter your username']"));
        userName.sendKeys("ttechno@gmail.com");
        MyFunc.Bekle(2);

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
        password.sendKeys("techno123.");
        MyFunc.Bekle(2);

        WebElement signIn = driver.findElement(By.xpath("//div[@class='buttons-w']/a"));
        signIn.click();
        MyFunc.Bekle(2);

        WebElement bul = driver.findElement(By.xpath("//div[@class='element-actions']//following::h6[1]"));
        Assert.assertTrue("Yazı yok", bul.getText().contains("Your nearest branch closes in: 30m 5s"));


        BekleKapat();


    }

}
