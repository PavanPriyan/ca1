package ca1.q1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class q2 {

public static void main(String[] args) {
ChromeOptions co=new ChromeOptions();
co.addArguments ("--remote-allow-origins=*");
WebDriverManager.chromedriver().setup ();
WebDriver driver=new ChromeDriver(co);
driver.get ("https://www.amazon.in/");
driver.manage().window().maximize() ;
String currentTitle=driver.getTitle();
System.out.println(currentTitle);
String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

if(currentTitle.equals(expectedTitle)) {

System.out.println("Title Matched");

}

else {

System.out.println("Title not Matched");

}

WebElement txtBoxl=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));

txtBoxl.sendKeys("oneplus");

driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

String pr1=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();

System.out.println(pr1);

String pr2=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();

System.out.println(pr2+" 9r");

String pr3=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();

System.out.println(pr3+" Nord CE");

String pr4=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();

System.out.println(pr4+" Nord CE Lite");

String pr5=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[10]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();

System.out.println(pr5+" 11R");

//filter

// driver.findElement(By.xpath("<span class=\"a-button-text a-declarative\" data-csa-c-func-deps=\"aui-da-a-dropdown-button\" data-csa-c-type=\"widget\" data-csa-interaction-events=\"click\" data-action=\"a-dropdown-button\" aria-hidden=\"true\" data-csa-c-id=\"ck1i6p-xs0djs-bsnv26-w8xpkh\" id=\"a-autoid-0-announce\"><span class=\"a-dropdown-label\">Sort by:</span><span class=\"a-dropdown-prompt\">Featured</span></span>")).click();

// driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_2\"]")).click();

}

}