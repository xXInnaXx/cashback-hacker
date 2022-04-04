package ru.netology.cashbackhacker;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalcRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 850;
        int expected = 150;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRemain0For1000Amount() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }
}