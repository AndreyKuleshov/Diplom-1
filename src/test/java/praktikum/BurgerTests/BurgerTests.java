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
        Assert.assertEquals(EXPECTED_BURGER_PRICE, burger.getPrice(), 0);
    }
    @Test
    public void getReceiptTest() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        Assert.assertEquals(BURGER_RECEIPT, burger.getReceipt());
    }
    @Test
    public void removeIngredientTest() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        burger.removeIngredient(FIRST_INGREDIENT);
        Assert.assertEquals(EXPECTED_BURGER_PRICE_AFTER_DELETION, burger.getPrice(), 0);
    }
    @Test
    public void moveIngredientTest() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredientTwo);
        burger.moveIngredient(FIRST_INGREDIENT,SECOND_INGREDIENT);
        Assert.assertEquals(BURGER_MOVED_RECEIPT, burger.getReceipt());
    }
}
