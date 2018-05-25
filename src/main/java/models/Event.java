package models;

public class Event {
    private int guests;
    private String food;
    private String beverage;
    private String entertainment;
    private int venueCost;
    private int foodCost;
    private int beverageCost;
    private int entertainmentCost;
    private int totalCost;

    public Event(int guests, String food, String beverage, String entertainment) {
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

    public String getBeverage() {
        return beverage;
    }

    public String getEntertainment() {
        return entertainment;
    }

    public int getVenueCost() {
        return venueCost;
    }

    public void setVenueCost(){
        if(guests <= 20){
            venueCost = 200;
        }else if (guests <= 50){
            venueCost = 500;
        }else if (guests <= 100){
            venueCost = 1000;
        }else if (guests <= 150){
            venueCost = 2000;
        }else {
            venueCost = 3000;
        }
    }


}
