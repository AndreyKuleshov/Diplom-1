package praktikum.bunTests;

import praktikum.Bun;
import praktikum.TestData;

public abstract class BunBaseClass extends TestData {
    protected Bun bun = new Bun(getBUN_NAME(), getBUN_PRICE());

}
