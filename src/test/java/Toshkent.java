import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Toshkent {

    @Test

    public void Toshkent() throws Exception {


                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.cargurus.com/");

                driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[1]/section/div/div/label[2]")).click();
                Assert.assertEquals("All Makes", "All Makes");

                Select dropdown = new Select(driver.findElement(By.id("carPickerUsed_makerSelect")));
                dropdown.selectByVisibleText("Lamborghini");
                // Assert.assertEquals("All Models", "All Models");
                //Assert.assertEquals("All Models, Aventador, Huracan, Urus,\n" +
//                "400GT, Centenario, Countach, Diablo, Espada, Gallardo, Murcielago]", "All Models, Aventador, Huracan, Urus,\n" +
//                "400GT, Centenario, Countach, Diablo, Espada, Gallardo, Murcielago]");

                Thread.sleep(5000);
                Select dropdown2 = new Select(driver.findElement(By.id("carPickerUsed_modelSelect")));
                dropdown2.selectByVisibleText("Gallardo");

                Thread.sleep(5000);

                driver.findElement(By.id("dealFinderZipUsedId_dealFinderForm")).sendKeys("22031");
                driver.findElement(By.id("dealFinderForm_0")).click();

                Thread.sleep(5000);

                driver.findElement(By.xpath("//a[@data-cg-ft='car-blade-link'][not(contains(@href, 'FEATURED'))]"));


//        List<WebElement> AscendingOrder = driver.findElements(By.className("JzvPHo"));
//
//        List<Double> AscendingOrderList = new ArrayList<>();
//
//        for (WebElement p : AscendingOrder) {
//            AscendingOrderList.add(Double.valueOf(p.getText().replace("$", "")));
                Thread.sleep(5000);
                Select dropdown3 = new Select(driver.findElement(By.id("sort-listing")));
                dropdown3.selectByIndex(2);

//            List<WebElement> AscendingOrderAfter = driver.findElements(By.className("JzvPHo"));
//
//            List<Double> AscendingOrderListAfter = new ArrayList<>();
//
//            for (WebElement p1 : AscendingOrderAfter) {
//                AscendingOrderListAfter.add(Double.valueOf(p1.getText().replace("$", "")));
//
//                Collections.sort(AscendingOrderList);
//                Assert.assertEquals(AscendingOrderList, AscendingOrderListAfter);
//            }
                Thread.sleep(5000);
                Select dropdown4 = new Select(driver.findElement(By.id("sort-listing")));
                dropdown4.selectByIndex(5);

                //WebElement check1 = driver.findElement(By.id("TRIM_NAME-Coupe AWD"));
                //check1.click();
                Thread.sleep(5000);
                driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/fieldset[5]/ul/li[1]/label/p")).click();

                Thread.sleep(5000);
                driver.findElement(By.className("vO42pn")).click();

                Thread.sleep(3000);
                driver.navigate().back();


            }

        }

