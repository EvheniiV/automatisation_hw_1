package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();
    @Test
    public void lowerLimitValueamountTest() {

        Assert.assertEquals(1000,service.remain(0));

    }

    @Test
    public void upperLimitValueamountTest() {

        Assert.assertEquals(0, service.remain(1000));
    }

    @Test
    public void inRangeValueamountTest() {

        Assert.assertEquals(400, service.remain(600));
    }
}
