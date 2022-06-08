package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class RunLoginWithInternetExplorer {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver internetexpo = new InternetExplorerDriver();
        internetexpo.get("https://demo.nopcommerce.com/");
        internetexpo.manage().window().maximize();
        Thread.sleep(2000);
        internetexpo.findElement(By.className("ico-login")).click();
        Thread.sleep(2000);
        internetexpo.findElement(By.id("Email")).sendKeys("dparikh63@gmail.com");
        Thread.sleep(2000);
        internetexpo.findElement(By.id("Password")).sendKeys("darshitparikh");
        Thread.sleep(2000);
        internetexpo.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
        Thread.sleep(2000);
        internetexpo.findElement(By.className("ico-logout")).click();
    }
}
