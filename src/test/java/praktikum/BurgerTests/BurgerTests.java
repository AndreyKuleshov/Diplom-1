package praktikum.BurgerTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTests extends BurgerBaseClass {
    @Test
    public void getPriceTest(){
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        Assert.assertEquals(getEXPECTED_BURGER_PRICE(), burger.getPrice(), 0);
    }
    @Test
    public void getReceiptTest() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        Assert.assertEquals(getBURGER_RECEIPT(), burger.getReceipt());
    }
    @Test
    public void removeIngredientTest() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        burger.removeIngredient(getFIRST_INGREDIENT());
        Assert.assertEquals(getEXPECTED_BURGER_PRICE_AFTER_DELETION(), burger.getPrice(), 0);
    }
    @Test
    public void moveIngredientTest() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredientTwo);
        burger.moveIngredient(getFIRST_INGREDIENT(),getSECOND_INGREDIENT());
        Assert.assertEquals(getBURGER_MOVED_RECEIPT(), burger.getReceipt());
    }
}
