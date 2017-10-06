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

    public void sell(String sweetType, int amount) {
        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < candyShop.size(); j++) {
                if (sweetType.equals(LOLLIPOP)) {
                    income += 10;
                    candyShop.remove(LOLLIPOP);
                } else if (sweetType.equals(CANDY)) {
                    income += 20;
                    candyShop.remove(CANDY);
                }
            }
        }

    }

//    public String candyShop() {
//    }
}
