package praktikum.praktikumTests;

import org.junit.Before;
import praktikum.TestData;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public abstract class PraktikumBaseClass extends TestData {

    protected final ByteArrayOutputStream OUT_CONTENT = new ByteArrayOutputStream();
    @Before
    public void setUp() {
        System.setOut(new PrintStream(OUT_CONTENT));
    }
}
