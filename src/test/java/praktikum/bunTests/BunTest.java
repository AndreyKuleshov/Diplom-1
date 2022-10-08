package praktikum.bunTests;

import org.junit.Assert;
import org.junit.Test;

public class BunTest extends BunBaseClass {
    @Test
    public void getBunNameTest() {
        Assert.assertEquals(getBUN_NAME(), bun.getName());
    }
    @Test
    public void getBunPriceTest() {
        Assert.assertEquals(getBUN_PRICE(), bun.getPrice(), 0);
    }
}
