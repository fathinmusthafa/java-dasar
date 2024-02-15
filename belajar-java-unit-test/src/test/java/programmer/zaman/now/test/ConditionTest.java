package programmer.zaman.now.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.util.Properties;

public class ConditionTest {

    @Test
    @Disabled
    void testSystemProperties() {
        Properties properties = System.getProperties();
        properties.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    // kondisi OS
    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testRunOnlyOnWindows() {

    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    public void testDisabledOnWindows() {

    }

    // kondisi versi Java

    @Test
    @EnabledOnJre({JRE.JAVA_8})
    public void testEnabledOnJava8() {

    }

    @Test
    @DisabledOnJre({JRE.JAVA_8})
    public void testDisabledOnJava8() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_17)
    public void testEnabledOnJava8to17() {

    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_17)
    public void testDisabledOnJava8to17() {

    }

    // kondisi system property

    @Test
    @EnabledIfSystemProperties(
            @EnabledIfSystemProperty(named = "java.vendor", matches = "Amazon.com Inc.")
    )
    void testEnabledOnJavaVendorAmazon() {

    }

    @Test
    @DisabledIfSystemProperties(
            @DisabledIfSystemProperty(named = "java.vendor", matches = "Amazon.com Inc.")
    )
    void testDisabledOnJavaVendorAmazon() {

    }

    // kondisi environment variable

    @Test
    @EnabledIfEnvironmentVariables(
            @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    )
    void testEnabledOnProfileDev() {

    }

    @Test
    @DisabledIfEnvironmentVariables(
            @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    )
    void testDisabledOnProfileDev() {

    }

}
