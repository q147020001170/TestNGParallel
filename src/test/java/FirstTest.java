import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *
 */
public class FirstTest extends BaseTest {

    @Test
    public void GOOGLE1() {
        System.out.println("Using browser: ");
        System.out.println("Google1 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("http://www.google.com");
        System.out.println("Google1 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("Google1 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
        try {
            Thread.sleep(1000);  // 模拟耗时操作
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void GOOGLE2() {
        System.out.println("Google2 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("http://www.google.com");
        System.out.println("Google2 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("Google2 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
        try {
            Thread.sleep(1000);  // 模拟耗时操作
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void GOOGLE3() {
        System.out.println("Google3 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("http://www.google.com");
        System.out.println("Google3 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("Google3 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
        try {
            Thread.sleep(1000);  // 模拟耗时操作
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void GOOGLE4() {
        System.out.println("Google4 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("http://www.google.com");
        System.out.println("Google4 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: "+ Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("Google4 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
        try {
            Thread.sleep(1000);  // 模拟耗时操作
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void GOOGLE5() {
        System.out.println("Google5 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("http://www.google.com");
        System.out.println("Google5 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: "+ Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("Google5 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
        try {
            Thread.sleep(1000);  // 模拟耗时操作
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void GOOGLE6() {
        System.out.println("Google6 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("http://www.google.com");
        System.out.println("Google6 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: "+ Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("Google6 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
        try {
            Thread.sleep(1000);  // 模拟耗时操作
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void GOOGLE7() {
        System.out.println("Google7 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("http://www.google.com");
        System.out.println("Google7 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: "+ Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("Google7 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
        try {
            Thread.sleep(1000);  // 模拟耗时操作
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}