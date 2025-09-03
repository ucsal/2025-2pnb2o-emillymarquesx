package br.com.mariojp.solid.ocp;

public interface DiscountPolicy {
    double apply(double amount);

    public class RegularPolicy implements DiscountPolicy{
        public double apply(double amount){
            return amount * 0.95;
        }
    }

    public class PremiumPolicy implements DiscountPolicy{
        public double apply(double amount){
            return amount * 0.9;
        }
    }

    public class PartnerPolicy implements DiscountPolicy{
        public double apply(double amount){
            return amount * 0.88;
        }
    }
}
