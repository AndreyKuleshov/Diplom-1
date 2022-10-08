package praktikum.ingredientTests;

import org.junit.Assert;
import org.junit.Test;
import praktikum.IngredientType;

public class IngredientTest extends IngredientBaseClass{
    @Test
    public void getSauceTypeTest() {
        Assert.assertEquals(IngredientType.SAUCE, ingredientSauce.getType());
    }
    @Test
    public void getFillingTypeTest() {
        Assert.assertEquals(IngredientType.FILLING, ingredientFilling.getType());
    }
    @Test
    public void getSauceNameTest() {
        Assert.assertEquals(getSAUCE(), ingredientSauce.getName());
    }
    @Test
    public void getFillingNameTest() {
        Assert.assertEquals(getFILLING(), ingredientFilling.getName());
    }
    @Test
    public void getSaucePriceTest() {
        Assert.assertEquals(getPRICE_SAUCE(), ingredientSauce.getPrice(), 0);
    }
    @Test
    public void getFillingPriceTest() {
        Assert.assertEquals(getPRICE_FILLING(), ingredientFilling.getPrice(), 0);
    }
}
