package utility;

import org.junit.After;
import org.junit.Before;

public class Hooks extends Configuration {

    public static Configuration driver;

    @Before
    public void setup() {
        setup();
    }

    @After
    public void tearDown() {
        driver.close();
    }

}
