package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();
    @Test
    public void lowerLimitValueamountTest() {
        //CashbackHackService service = new CashbackHackService();

        Assert.assertEquals(service.remain(0), 1000);
    }

    @Test
    public void upperLimitValueamountTest() {
        //CashbackHackService service = new CashbackHackService();

        Assert.assertEquals(service.remain(1000), 0);
    }

    @Test
    public void inRangeValueamountTest() {
        //CashbackHackService service = new CashbackHackService();

        Assert.assertEquals(service.remain(600), 400);
    }

}
