package maven_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BankAccountTest {

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount(5000.00);
        double actual = account.withdraw(2000.00);
        double expectedResult = 3000.00;

        assertEquals(expectedResult, actual);
    }
}
