package ecommerce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PaymentServiceTest {

    // 1️. Successful payment processing
    @Test
    void testSuccessfulPayment() {
        PaymentGateway gateway = Mockito.mock(PaymentGateway.class);
        when(gateway.pay(100)).thenReturn(true);

        PaymentService service = new PaymentService(gateway);

        boolean result = service.processPayment(100);

        assertTrue(result);
    }

    // 2️. Payment processing with invalid amount
    @Test
    void testInvalidAmountPayment() {
        PaymentGateway gateway = Mockito.mock(PaymentGateway.class);

        PaymentService service = new PaymentService(gateway);

        boolean result = service.processPayment(-50);

        assertFalse(result);
    }

    // 3️. Payment processing with gateway failure
    @Test
    void testPaymentGatewayFailure() {
        PaymentGateway gateway = Mockito.mock(PaymentGateway.class);
        when(gateway.pay(200)).thenReturn(false);

        PaymentService service = new PaymentService(gateway);

        boolean result = service.processPayment(200);

        assertFalse(result);
    }
}
