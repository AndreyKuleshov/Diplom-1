package praktikum.praktikumTests;

import org.junit.Assert;
import org.junit.Test;
import praktikum.Praktikum;

public class PraktikumTest extends PraktikumBaseClass{
    @Test
    public void mainClassTest() {
        Praktikum.main(args);
        Assert.assertEquals(EXPECTED_PRAKTIKUM_RESULT, OUT_CONTENT.toString());
    }
}
