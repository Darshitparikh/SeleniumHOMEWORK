package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RunLoginWithEdge {
    public static void main(String[] args) throws InterruptedException {

    WebDriverManager.edgedriver().setup();
    WebDriver edge = new EdgeDriver();

    edge.manage().window().maximize();
    edge.get("https://demo.nopcommerce.com/");
    Thread.sleep(2000);
    edge.findElement(By.className("ico-login")).click();
    Thread.sleep(2000);
    edge.findElement(By.id("Email")).sendKeys("dparikh63@gmail.com");
    Thread.sleep(2000);
    edge.findElement(By.id("Password")).sendKeys("darshitparikh");
    Thread.sleep(2000);
    edge.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
    Thread.sleep(2000);
    edge.findElement(By.className("ico-logout")).click();
            }}
