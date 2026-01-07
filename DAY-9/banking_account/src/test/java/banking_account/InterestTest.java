package banking_account;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class InterestTest {

    @Test
    void testInterest() {
        Account acc = new Account(2000);

        int interest = acc.calculateInterest(5);

        assertEquals(100, interest);
    }
}
