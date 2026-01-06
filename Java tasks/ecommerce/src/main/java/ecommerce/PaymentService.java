package ecommerce;

public class PaymentService {

    private PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean processPayment(double amount) {

        // invalid amount check
        if (amount <= 0) {
            return false;
        }

        // call payment gateway
        return paymentGateway.pay(amount);
    }
}
