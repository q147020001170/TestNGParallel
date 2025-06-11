import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class OptionsManager {

    //Get Chrome Options
    public static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();

        // 基础配置
        options.addArguments("--start-maximized");          // 修正拼写
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        // options.addArguments("--incognito");            // 无痕模式（按需启用）

        // 推荐补充配置（根据需求选择）
        options.addArguments("--disable-extensions");       // 禁用扩展
        options.addArguments("--disable-infobars");         // 禁用"Chrome正在受自动化软件控制"提示
        options.addArguments("--no-sandbox");               // Linux环境可能需要
        options.addArguments("--disable-dev-shm-usage");    // Docker环境可能需要
        options.addArguments("--lang=en-US");               // 设置浏览器语言

        // 无头模式（Headless）
        // options.addArguments("--headless=new");          // Chrome 112+ 新版无头模式
        // options.addArguments("--remote-allow-origins=*"); // Selenium 4.8+ 必需

        return options;
    }

    //Get Firefox Options
    public static FirefoxOptions getFirefoxOptions() {
        FirefoxOptions options = new FirefoxOptions();
        FirefoxProfile profile = new FirefoxProfile();

        // 配置 Firefox 选项
        profile.setAcceptUntrustedCertificates(true);
        profile.setAssumeUntrustedCertificateIssuer(false);
        profile.setPreference("network.proxy.type", 0);

        // 正确设置 Profile（Selenium 4+ 标准写法）
        options.setProfile(profile); // 直接使用 setProfile 方法

        return options;
    }
}