package models;

public class Event {
    private int guests;
    private String food;
    private String beverage;
    private String entertainment;

    public Event(int guests, String food, String beverage, String entertainment ) {
        this.guests = guests;
        this.food = food;
        this.beverage = beverage;
        this.entertainment = entertainment;
    }

    public int getGuests() {
        return guests;
    }

    public String getFood() {
        return food;
    }
}
