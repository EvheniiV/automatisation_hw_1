package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void lowerLimitValueamountTest() {

        Assert.assertEquals(service.remain(0), 1000);
    }

    @Test
    public void upperLimitValueamountTest() {

        Assert.assertEquals(service.remain(1000), 0);
    }

    @Test
    public void inRangeValueamountTest() {

        Assert.assertEquals(service.remain(600), 400);
    }

}
