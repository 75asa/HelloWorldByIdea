package HelloWorld;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GradleSampleTest {

    @Test
    void main() {
    }

    @Test
    void sayHello() {
        assertEquals("Hello World!!", GradleSample.sayHello());
    }
}