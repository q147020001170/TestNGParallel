import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 */
public class SecondTest extends BaseTest {

    @Test
    public void FIREFOX1() {
        System.out.println("FIREFOX1 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("http://www.google.com");
        System.out.println("FIREFOX1 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("FIREFOX1 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }

    @Test
    public void FIREFOX2() {
        System.out.println("FIREFOX2 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("http://www.google.com");
        System.out.println("FIREFOX2 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("FIREFOX2 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }

    @Test
    public void FIREFOX3() {
        System.out.println("FIREFOX3 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("http://www.google.com");
        System.out.println("FIREFOX3 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("FIREFOX3 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }


}