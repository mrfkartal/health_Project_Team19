package base_url;
import hooks.Hooks;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

import static java.lang.Shutdown.hooks;

public class MedunnaBaseUrl {
    protected RequestSpecification spec;
    @Before
    public void setup() {
        spec = new RequestSpecBuilder().setBaseUri("https://www.medunna.com").build();
    }
}
