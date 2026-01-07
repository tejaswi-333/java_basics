package ecommerce;

public interface PaymentGateway {
    boolean pay(double amount);
}
