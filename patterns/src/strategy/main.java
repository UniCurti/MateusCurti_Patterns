package strategy;

public class main {
    public static void main(String[] args) {
        Cart c = new Cart(200, new NoDiscount());

        System.out.println("Total: R$ " + c.total());

        c.setDiscountStrategy(new PercentDiscount(10));

        System.out.println("Total(-10%): R$ " + c.total());

        c.setDiscountStrategy(new FixedDiscount(20));

        System.out.println("Total(-20): R$ " + c.total());
    }
}