package praktikum;

public class TestData {
    public static final String BUN_NAME = "test bun";
    public static final float BUN_PRICE = 12345.67F;
    public static final float EXPECTED_BURGER_PRICE = 24891.34F;
    public static final float EXPECTED_BURGER_PRICE_AFTER_DELETION = 24691.34F;
    public static final float INGREDIENT_PRICE = 200F;
    public static final IngredientType INGREDIENT_TYPE_FILLING = IngredientType.FILLING;
    public static final String INGREDIENT_NAME = "test ingredient name";
    public static final float INGREDIENT_TWO_PRICE = 500F;
    public static final IngredientType INGREDIENT_TYPE_SAUCE = IngredientType.SAUCE;
    public static final String INGREDIENT_TWO_NAME = "test ingredient two name";
    public static final String BURGER_RECEIPT =
            "(==== test bun ====)\n" +
            "= filling test ingredient name =\n" +
            "(==== test bun ====)\n" +
            "\n" +
            "Price: 24891.339844\n";
    public static final String BURGER_MOVED_RECEIPT =
            "(==== test bun ====)\n" +
            "= sauce test ingredient two name =\n" +
            "= filling test ingredient name =\n" +
            "(==== test bun ====)\n" +
            "\n" +
            "Price: 25391.339844\n";
    public static final int FIRST_INGREDIENT = 0;
    public static final int SECOND_INGREDIENT = 1;
    public static final String SAUCE = "sauce";
    public static final String FILLING = "filling";
    public static final float PRICE_INGREDIENT = 1234.56F;
    public static final String[] args = null;
    public static final String EXPECTED_PRAKTIKUM_RESULT =
            "(==== black bun ====)\n" +
            "= sauce sour cream =\n" +
            "= filling cutlet =\n" +
            "= filling dinosaur =\n" +
            "(==== black bun ====)\n" +
            "\n" +
            "Price: 700.000000\n" +
            "\n";
}
