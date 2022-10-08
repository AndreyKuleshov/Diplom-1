package praktikum.databaseTests;

import org.junit.Assert;
import org.junit.Test;

public class DatabaseTest extends DatabaseBaseClass {
    @Test
    public void availableBunsTest() {
        Assert.assertEquals(3, db.availableBuns().size());
    }
    @Test
    public void availableIngredientsTest() {
        Assert.assertEquals(6, db.availableIngredients().size());
    }
}
