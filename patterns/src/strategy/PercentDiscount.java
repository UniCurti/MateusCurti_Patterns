package strategy;

public class PercentDiscount implements DiscountStrategy{
    public double percent;

    public PercentDiscount(double percent) {
        this.percent = percent;
    }

    @Override
    public double apply(double subtotal) {
        return subtotal * (1 - percent / 100);
    }
}
