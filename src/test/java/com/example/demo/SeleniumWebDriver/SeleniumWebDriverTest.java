package com.example.demo.SeleniumWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumWebDriverTest {
    private WebDriver webDriver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @Test
    public void testSteps()  throws InterruptedException{
        webDriver.get("https://www.vietjetair.com/vi/ve-may-bay/bay-dang-cap-boss-gia-chi-eco-uu-dai-20-ngay-20-hang-thang/?utm_source=google-vj-sg&utm_medium=cpc&utm_campaign=pmax_singaporesunbird2025_ci_perfmax_0125intflt-sale20_promo-destn-sgp-skyboss-kv_sgpawo2024_cpa_ob&gad_source=1&gclid=Cj0KCQiAkoe9BhDYARIsAH85cDORe2krBlFPX0WLX2b8-jbIkCWMIKBWK8_gIojxLNRwUvz25GcCcnEaAk54EALw_wcB");
        Thread.sleep(3000);

        webDriver.findElement(By.xpath("//*[@id=\"ldr-accept_cookie_policy\"]/div/div[2]/div/div/div[2]/button/span[1]/h5")).click();

        webDriver.findElement(By.xpath("//*[@id=\"tripType2\"]")).click();

        webDriver.findElement(By.xpath("//*[@id=\"input-departure\"]")).sendKeys("Hà Nội - HAN");

        webDriver.findElement(By.xpath("//*[@id=\"id-booking\"]/div/div/div/div/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]")).click();

        webDriver.findElement(By.xpath("//*[@id=\"id-booking\"]/div/div/div/div/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]")).sendKeys("29/06/2025");

        webDriver.findElement(By.xpath("//*[@id=\"input-departure-2\"]")).sendKeys("Tp. Hồ Chí Minh - SGN");

        webDriver.findElement(By.xpath("//*[@id=\"popup-date-destination\"]")).click();

        webDriver.findElement(By.xpath("//*[@id=\"input-passenger-mb\"]")).click();

        webDriver.findElement(By.xpath("//*[@id=\"adults_add\"]/span[1]/svg")).click();
        webDriver.findElement(By.xpath("//*[@id=\"flexCheckDefault\"]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"search_flights\"]/span[1]")).click();

        Thread.sleep(5000);

        webDriver.quit();
    }
}
