package praktikum;

public abstract class TestData {
    protected final String BUN_NAME = "test bun";
    protected final float BUN_PRICE = 12345.67F;
    protected final float EXPECTED_BURGER_PRICE = 24891.34F;
    protected final float EXPECTED_BURGER_PRICE_AFTER_DELETION = 24691.34F;
    protected final float INGREDIENT_PRICE = 200F;
    protected final IngredientType INGREDIENT_TYPE = IngredientType.FILLING;
    protected final String INGREDIENT_NAME = "test ingredient name";
    protected final float INGREDIENT_TWO_PRICE = 500F;
    protected final IngredientType INGREDIENT_TWO_TYPE = IngredientType.SAUCE;
    protected final String INGREDIENT_TWO_NAME = "test ingredient two name";
    protected final String BURGER_RECEIPT =
            "(==== test bun ====)\n" +
            "= filling test ingredient name =\n" +
            "(==== test bun ====)\n" +
            "\n" +
            "Price: 24891.339844\n";
    protected final String BURGER_MOVED_RECEIPT =
            "(==== test bun ====)\n" +
            "= sauce test ingredient two name =\n" +
            "= filling test ingredient name =\n" +
            "(==== test bun ====)\n" +
            "\n" +
            "Price: 25391.339844\n";
    protected final int FIRST_INGREDIENT = 0;
    protected final int SECOND_INGREDIENT = 1;
    protected final String SAUCE = "sauce";
    protected final String FILLING = "filling";
    protected final float PRICE_SAUCE = 1234.56F;
    protected final float PRICE_FILLING = 1234.56F;
    protected String[] args = null;
    protected final String EXPECTED_PRAKTIKUM_RESULT =
            "(==== black bun ====)\n" +
            "= sauce sour cream =\n" +
            "= filling cutlet =\n" +
            "= filling dinosaur =\n" +
            "(==== black bun ====)\n" +
            "\n" +
            "Price: 700.000000\n" +
            "\n";
    protected String getBUN_NAME() {
        return BUN_NAME;
    }
    protected float getBUN_PRICE() {
        return BUN_PRICE;
    }
    public String getEXPECTED_PRAKTIKUM_RESULT() {
        return EXPECTED_PRAKTIKUM_RESULT;
    }
    public float getINGREDIENT_PRICE() {
        return INGREDIENT_PRICE;
    }
    public float getEXPECTED_BURGER_PRICE() {
        return EXPECTED_BURGER_PRICE;
    }
    public float getEXPECTED_BURGER_PRICE_AFTER_DELETION() {
        return EXPECTED_BURGER_PRICE_AFTER_DELETION;
    }
    public IngredientType getINGREDIENT_TYPE() {
        return INGREDIENT_TYPE;
    }
    public String getINGREDIENT_NAME() {
        return INGREDIENT_NAME;
    }
    public String getBURGER_RECEIPT() {
        return BURGER_RECEIPT;
    }
    public float getINGREDIENT_TWO_PRICE() {
        return INGREDIENT_TWO_PRICE;
    }
    public IngredientType getINGREDIENT_TWO_TYPE() {
        return INGREDIENT_TWO_TYPE;
    }
    public String getINGREDIENT_TWO_NAME() {
        return INGREDIENT_TWO_NAME;
    }
    public String getBURGER_MOVED_RECEIPT() {
        return BURGER_MOVED_RECEIPT;
    }
    public int getFIRST_INGREDIENT() {
        return FIRST_INGREDIENT;
    }
    public int getSECOND_INGREDIENT() {
        return SECOND_INGREDIENT;
    }
    protected String getSAUCE(){
        return SAUCE;
    }
    protected String getFILLING() {
        return FILLING;
    }
    protected float getPRICE_SAUCE() {
        return PRICE_SAUCE;
    }
    public float getPRICE_FILLING() {
        return PRICE_FILLING;
    }
}
