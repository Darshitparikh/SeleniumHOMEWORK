package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunLoginWithChrome {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chro = new ChromeDriver();
        chro.get("https://demo.nopcommerce.com/");
        chro.manage().window().maximize();
        Thread.sleep(2000);
        chro.findElement(By.className("ico-login")).click();
        Thread.sleep(2000);
        chro.findElement(By.id("Email")).sendKeys("dparikh63@gmail.com");
        Thread.sleep(2000);
        chro.findElement(By.id("Password")).sendKeys("darshitparikh");
        Thread.sleep(2000);
        chro.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
        Thread.sleep(2000);
        chro.findElement(By.className("ico-logout")).click();
    }
}
