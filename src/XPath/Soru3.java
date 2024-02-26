package XPath;
/*
1) Bu siteye gidin. -> https://www.snapdeal.com/

2) "teddy bear" aratın ve Search butonuna tıklayın.

3) Bu yazının göründüğünü doğrulayınız. -> (We've got 307 results for 'teddy bear')
Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
 */

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru3 extends BaseDriver {
    @Test

    public void test1() {

        driver.get("https://www.snapdeal.com/");

        WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
        search.sendKeys("teddy bear");
        MyFunc.Bekle(2);

        WebElement btn = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
        btn.click();

        WebElement dogrula = driver.findElement(By.xpath("//div[@id='searchMessageContainer']//span"));
        Assert.assertTrue("Yazı doğru değil", dogrula.getText().contains("We've got 307 results for teddy bear"));


        BekleKapat();

    }
}