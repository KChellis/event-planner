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
}