import java.util.ArrayList;
import java.util.Collections;

public class CandyShop {
    public static String CANDY = "CANDY";
    public static String LOLLIPOP = "LOLLIPOP";
    double sugar;
    double income;
    ArrayList candyShop;
    double lollipopPrice = 10;
    double candyPrice = 20;

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

    public void raise(int amount) {
        lollipopPrice += lollipopPrice / 100 * amount;
        candyPrice += candyPrice / 100 * amount;
    }

    public void sell(String sweetType, int amount) {
        int init = 0;
        for (int i = 0; i < candyShop.size(); i++) {
            while (init < amount) {
                if (sweetType.equals(LOLLIPOP)) {
                    income += lollipopPrice;
                    candyShop.remove(LOLLIPOP);
                    init++;
                } else if (sweetType.equals(CANDY)) {
                    income += candyPrice;
                    candyShop.remove(CANDY);
                    init++;
                }
            }
        }
    }


    public void buySugar(int amount) {
        this.sugar += amount;
        this.income -= amount * 0.1;
    }

    @Override
    public String toString() {
        int candyOccurence = Collections.frequency(candyShop, "CANDY");
        int lollipopOccurence = Collections.frequency(candyShop, "LOLLIPOP");
        return "Inventory: " + candyOccurence + " candies, " + lollipopOccurence + " lollipops, Income: " + income + "$, Sugar: " + sugar + "gr";
    }
}
