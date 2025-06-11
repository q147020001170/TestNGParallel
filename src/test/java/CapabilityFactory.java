import org.openqa.selenium.Capabilities;

public class CapabilityFactory {
    public Capabilities capabilities;

    public Capabilities getCapabilities (String browser) {
        System.out.println("getCapabilities Using browser: " + browser);
        if (browser.equals("chrome"))
            capabilities = OptionsManager.getChromeOptions();
        else
            capabilities = OptionsManager.getFirefoxOptions();
        return capabilities;
    }
}
