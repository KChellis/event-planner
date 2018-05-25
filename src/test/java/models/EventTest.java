package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void newEvent_instantiatesCorrectly_true() {
        Event testEvent = new Event(50,"full dinner", "open bar", "DJ");
        assertEquals(true,  testEvent instanceof Event);
    }

    @Test
    public void newEvent_getsGuests_50() {
        Event testEvent = new Event(50,"full dinner", "open bar", "DJ");
        assertEquals(50,  testEvent.getGuests());
    }

    @Test
    public void newEvent_getsFood_fulldinner() {
        Event testEvent = new Event(50,"full dinner", "open bar", "DJ");
        assertEquals("full dinner",  testEvent.getFood());
    }

    @Test
    public void newEvent_getsBeverage_openbar() {
        Event testEvent = new Event(50,"full dinner", "open bar", "DJ");
        assertEquals("open bar",  testEvent.getBeverage());
    }

    @Test
    public void newEvent_getsEntertainment_DJ() {
        Event testEvent = new Event(50,"full dinner", "open bar", "DJ");
        assertEquals("DJ",  testEvent.getEntertainment());
    }

    @Test
    public void setVenueCost_setsVenueCost_500() {
        Event testEvent = new Event(50,"full dinner", "open bar", "DJ");
        testEvent.setVenueCost();
        assertEquals(500,  testEvent.getVenueCost());
    }

    @Test
    public void setFoodCost_setsFoodCost_500() {
        Event testEvent = new Event(50,"full dinner", "open bar", "DJ");
        testEvent.setFoodCost();
        assertEquals(2000,  testEvent.getFoodCost());
    }

    @Test
    public void setBeverageCost_setsBeverageCost_500() {
        Event testEvent = new Event(50,"full dinner", "open bar", "DJ");
        testEvent.setBeverageCost();
        assertEquals(2500,  testEvent.getBeverageCost());
    }

    @Test
    public void setEntertainmentCost_setsEntertainmentCost_500() {
        Event testEvent = new Event(50,"full dinner", "open bar", "DJ");
        testEvent.setEntertainmentCost();
        assertEquals(1000,  testEvent.getEntertainmentCost());
    }
}