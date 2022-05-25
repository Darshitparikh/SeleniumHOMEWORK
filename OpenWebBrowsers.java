package Homework;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenWebBrowsers {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Users\\Admin\\IdeaProjects\\Software\\Driver\\msedgedriver.exe");
        WebDriver edge = new EdgeDriver();
        edge.get("https://www.tesco.com/");

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\Software\\Driver\\chromedriver.exe");
        WebDriver chro = new ChromeDriver();
        chro.get("https://www.tesco.com/");

        System.setProperty("webdriver.ie.driver","C:\\Users\\Admin\\IdeaProjects\\Software\\Driver\\IEDriverServer.exe");
        WebDriver internetexpo = new InternetExplorerDriver();
        internetexpo.get("https://www.tesco.com/");
    }
}
