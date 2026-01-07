package banking_account;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TransactionTest {

    @Test
    void testDeposit() {
        Account acc = new Account(1000);

        acc.deposit(500);

        assertEquals(1500, acc.getBalance());
    }

    @Test
    void testWithdraw() {
        Account acc = new Account(1000);

        acc.withdraw(200);

        assertEquals(800, acc.getBalance());
    }
}
