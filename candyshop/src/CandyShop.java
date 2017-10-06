import java.util.ArrayList;

public class CandyShop {
    int sugar;
    int income;
    ArrayList candyShop;

    public CandyShop(int sugar) {
        this.sugar = sugar;
        this.income = 0;
        this.candyShop = new ArrayList();
    }

    public void createSweets(Sweets sweetType) {
        if (sweetType.sugarContent == 10) {
            candyShop.add(new Candy());
            this.sugar -= 10;
        } else if (sweetType.sugarContent == 5) {
            candyShop.add(new Lollipop());
            this.sugar -= 5;
        }
    }
}
