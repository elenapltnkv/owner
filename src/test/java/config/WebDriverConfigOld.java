package config;

public class WebDriverConfigOld {

    public String getBaseURL(){
        //return "https://github.com";
        String baseUrl = System.getProperty("baseUrl");
        return baseUrl;
    }

    public Browser getBrowser(){
        String browser = System.getProperty("browser");
        return Browser.valueOf(browser);
        //return Browser.FIREFOX;
    }
}
