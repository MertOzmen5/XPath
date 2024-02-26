package XPath;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*

  1) Bu siteye gidin. -> http://demoqa.com/text-box

  2) Full Name kısmına "Automation" girin.

  3) Email kısmına "Testing@gmail.com" girin.

  4) Current Address kısmına "Testing Current Address" girin.

  5) Permanent Address kısmına "Testing Permanent Address" girin.

  6) Submit butonuna tıklayınız.

  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.

  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

*/

public class Soru1 extends BaseDriver {

    @Test

    public void test() {

        driver.get("http://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullName.sendKeys("Automation");
        MyFunc.Bekle(2);

        WebElement eMail = driver.findElement(By.xpath("//input[@type='email']"));
        eMail.sendKeys("Testing@gmail.com");
        MyFunc.Bekle(2);

        WebElement currentAdress = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        currentAdress.sendKeys("Testing Current Address");
        MyFunc.Bekle(2);

        WebElement permanentAdress = driver.findElement(By.xpath("//div[@id='permanentAddress-wrapper']/div[2]/textarea"));
        permanentAdress.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(2);

        WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        submit.click();
        MyFunc.Bekle(2);

        WebElement varMi = driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']/p[1]"));
        Assert.assertTrue("Full Name,Automation'ı içinde bulundurmuyor", varMi.getText().contains("Automation"));

        WebElement varMi2 = driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']/p[2]"));
        Assert.assertTrue("E-mail,Testing'i içinde bulundurmuyor", varMi2.getText().contains("Testing"));


        BekleKapat();


    }
}
