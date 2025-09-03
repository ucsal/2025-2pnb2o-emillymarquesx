package br.com.mariojp.solid.ocp;
import java.util.HashMap;
import java.util.Map;

public class DiscountCalculator {

    public final Map<CustomerType, DiscountPolicy> policies;

    public DiscountCalculator(){
        policies = new HashMap<>();
        policies.put(CustomerType.REGULAR, new DiscountPolicy.RegularPolicy());
        policies.put(CustomerType.PREMIUM, new DiscountPolicy.PremiumPolicy());
        policies.put(CustomerType.PARTNER, new DiscountPolicy.PartnerPolicy());
    }

    public double apply(double amount, CustomerType type){
        DiscountPolicy policy = policies.get(type);
        if (policy == null){
            throw new IllegalArgumentException(type);
        }
        return policy.apply(amount);
    }
}
