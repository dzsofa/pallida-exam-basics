import java.util.ArrayList;

public class CandyShop {
    public static String CANDY = "CANDY";
    public static String LOLLIPOP = "LOLLIPOP";
    int sugar;
    int income;
    ArrayList candyShop;

    public CandyShop(int sugar) {
        this.sugar = sugar;
        this.income = 0;
        this.candyShop = new ArrayList();
    }

    public void createSweets(String sweetType) {
        if (sweetType.equals(LOLLIPOP)) {
            candyShop.add(LOLLIPOP);
            this.sugar -= 5;
        } else if (sweetType.equals(CANDY)) {
            candyShop.add(CANDY);
            this.sugar -= 10;
        }
    }

    public void sell() {

    }

    public String candyShop() {
        return "Inventory: " + candyShop.contains(LOLLIPOP) + candyShop.contains(CANDY) + " Income: " + this.income + ", Sugar: " + sugar + "gr.";
    }
}
