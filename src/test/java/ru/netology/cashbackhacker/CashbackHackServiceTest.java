package ru.netology.cashbackhacker;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

class CashbackHackServiceTest {

    @Test
    public void shouldCalcRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 850;
        int expected = 150;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }


}