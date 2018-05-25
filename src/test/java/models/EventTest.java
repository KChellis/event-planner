package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void newEvent_instantiatesCorrectly_true() {
        Event testEvent = new Event();
        assertEquals(true,  testEvent instanceof Event);
    }

    @Test
    public void setGuests_setNumberOfGuests_50() {
        Event testEvent = new Event();
        testEvent.setGuests(50);
        assertEquals(50,  testEvent.getGuests());
    }

    @Test
    public void setFood_getsFood_fulldinner() {
        Event testEvent = new Event();
        testEvent.setFood("Full Dinner");
        assertEquals("Full Dinner",  testEvent.getFood());
    }

    @Test
    public void setBeverage_getsBeverage_openbar() {
        Event testEvent = new Event();
        testEvent.setBeverage("Open Bar");
        assertEquals("Open Bar",  testEvent.getBeverage());
    }

    @Test
    public void setEntertainment_getsEntertainment_DJ() {
        Event testEvent = new Event();
        testEvent.setEntertainment("DJ");
        assertEquals("DJ",  testEvent.getEntertainment());
    }

    @Test
    public void setVenueCost_setsVenueCost_500() {
        Event testEvent = new Event();
        testEvent.setGuests(50);
        testEvent.setVenueCost();
        assertEquals(500,  testEvent.getVenueCost());
    }

    @Test
    public void setFoodCost_setsFoodCost_2000() {
        Event testEvent = new Event();
        testEvent.setGuests(50);
        testEvent.setFood("Full Dinner");
        testEvent.setFoodCost();
        assertEquals(2000,  testEvent.getFoodCost());
    }

    @Test
    public void setBeverageCost_setsBeverageCost_2500() {
        Event testEvent = new Event();
        testEvent.setGuests(50);
        testEvent.setBeverage("Open Bar");
        testEvent.setBeverageCost();
        assertEquals(2500,  testEvent.getBeverageCost());
    }

    @Test
    public void setEntertainmentCost_setsEntertainmentCost_1000() {
        Event testEvent = new Event();
        testEvent.setGuests(50);
        testEvent.setEntertainment("DJ");
        testEvent.setEntertainmentCost();
        assertEquals(1000,  testEvent.getEntertainmentCost());
    }

    @Test
    public void setTotalCost_setsTotalCost_6000() {
        Event testEvent = new Event();
        testEvent.setGuests(50);
        testEvent.setFood("Full Dinner");
        testEvent.setBeverage("Open Bar");
        testEvent.setEntertainment("DJ");
        testEvent.setVenueCost();
        testEvent.setFoodCost();
        testEvent.setBeverageCost();
        testEvent.setEntertainmentCost();
        testEvent.setTotalCost();
        assertEquals(6000,  testEvent.getTotalCost());
    }

    @Test
    public void setFoodMap_addsValuesToFoodMap_false() {
        Event testEvent = new Event();
        testEvent.setFoodMap();
        assertEquals(false, testEvent.getFoodMap().isEmpty());
    }

    @Test
    public void setBeverageMap_addsValuesToBeverageMap_false() {
        Event testEvent = new Event();
        testEvent.setBeverageMap();
        assertEquals(false, testEvent.getBeverageMap().isEmpty());
    }

    @Test
    public void setEntertainmentMap_addsValuesToEntertainmentMap_false() {
        Event testEvent = new Event();
        testEvent.setEntertainmentMap();
        assertEquals(false, testEvent.getEntertainmentMap().isEmpty());
    }

    @Test
    public void useCoupon_reducesTotalCostBy20Percent_4800() {
        Event testEvent = new Event();
        testEvent.setGuests(50);
        testEvent.setFood("Full Dinner");
        testEvent.setBeverage("Open Bar");
        testEvent.setEntertainment("DJ");
        testEvent.setVenueCost();
        testEvent.setFoodCost();
        testEvent.setBeverageCost();
        testEvent.setEntertainmentCost();
        testEvent.setTotalCost();
        testEvent.useCoupon("20%off");
        assertEquals(4800,  testEvent.getTotalCost());
    }

    @Test
    public void useCoupon_reducesTotalCostBy1000_5000() {
        Event testEvent = new Event();
        testEvent.setGuests(50);
        testEvent.setFood("Full Dinner");
        testEvent.setBeverage("Open Bar");
        testEvent.setEntertainment("DJ");
        testEvent.setVenueCost();
        testEvent.setFoodCost();
        testEvent.setBeverageCost();
        testEvent.setEntertainmentCost();
        testEvent.setTotalCost();
        testEvent.useCoupon("$1000off");
        assertEquals(5000,  testEvent.getTotalCost());
    }

    @Test
    public void generateNumber_returnsInt_true() {
        Event testEvent = new Event();
        assertEquals(true, testEvent.generateNumber(0, 300) instanceof Integer);
    }
}