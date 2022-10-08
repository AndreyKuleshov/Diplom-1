package praktikum;

public class TestData {
    private final String BUN_NAME = "test bun";
    private final float BUN_PRICE = 12345.67F;
    private final float EXPECTED_BURGER_PRICE = 24891.34F;
    private final float EXPECTED_BURGER_PRICE_AFTER_DELETION = 24691.34F;
    private final float INGREDIENT_PRICE = 200F;
    private final IngredientType INGREDIENT_TYPE_FILLING = IngredientType.FILLING;
    private final String INGREDIENT_NAME = "test ingredient name";
    private final float INGREDIENT_TWO_PRICE = 500F;
    private final IngredientType INGREDIENT_TYPE_SAUCE = IngredientType.SAUCE;
    private final String INGREDIENT_TWO_NAME = "test ingredient two name";
    private final String BURGER_RECEIPT =
            "(==== test bun ====)\n" +
            "= filling test ingredient name =\n" +
            "(==== test bun ====)\n" +
            "\n" +
            "Price: 24891.339844\n";
    private final String BURGER_MOVED_RECEIPT =
            "(==== test bun ====)\n" +
            "= sauce test ingredient two name =\n" +
            "= filling test ingredient name =\n" +
            "(==== test bun ====)\n" +
            "\n" +
            "Price: 25391.339844\n";
    private final int FIRST_INGREDIENT = 0;
    private final int SECOND_INGREDIENT = 1;
    private final String SAUCE = "sauce";
    private final String FILLING = "filling";
    private final float PRICE_INGREDIENT = 1234.56F;
    private final String[] args = null;
    private final String EXPECTED_PRAKTIKUM_RESULT =
            "(==== black bun ====)\n" +
            "= sauce sour cream =\n" +
            "= filling cutlet =\n" +
            "= filling dinosaur =\n" +
            "(==== black bun ====)\n" +
            "\n" +
            "Price: 700.000000\n" +
            "\n";
    protected String[] getArgs() {
        return args;
    }
    protected String getBUN_NAME() {
        return BUN_NAME;
    }
    protected float getBUN_PRICE() {
        return BUN_PRICE;
    }
    protected String getEXPECTED_PRAKTIKUM_RESULT() {
        return EXPECTED_PRAKTIKUM_RESULT;
    }
    public float getINGREDIENT_PRICE() {
        return INGREDIENT_PRICE;
    }
    protected float getEXPECTED_BURGER_PRICE() {
        return EXPECTED_BURGER_PRICE;
    }
    protected float getEXPECTED_BURGER_PRICE_AFTER_DELETION() {
        return EXPECTED_BURGER_PRICE_AFTER_DELETION;
    }
    public IngredientType getINGREDIENT_TYPE_FILLING() {
        return INGREDIENT_TYPE_FILLING;
    }
    public String getINGREDIENT_NAME() {
        return INGREDIENT_NAME;
    }
    protected String getBURGER_RECEIPT() {
        return BURGER_RECEIPT;
    }
    protected float getINGREDIENT_TWO_PRICE() {
        return INGREDIENT_TWO_PRICE;
    }
    public IngredientType getINGREDIENT_TYPE_SAUCE() {
        return INGREDIENT_TYPE_SAUCE;
    }
    protected String getINGREDIENT_TWO_NAME() {
        return INGREDIENT_TWO_NAME;
    }
    protected String getBURGER_MOVED_RECEIPT() {
        return BURGER_MOVED_RECEIPT;
    }
    protected int getFIRST_INGREDIENT() {
        return FIRST_INGREDIENT;
    }
    protected int getSECOND_INGREDIENT() {
        return SECOND_INGREDIENT;
    }
    public String getSAUCE(){
        return SAUCE;
    }
    public String getFILLING() {
        return FILLING;
    }
    protected float getPRICE_INGREDIENT() {
        return PRICE_INGREDIENT;
    }
}
