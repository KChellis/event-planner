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

    public int getFoodCost() {
        return foodCost;
    }

    public void setFoodCost(){
        if(food.equals("light snacks")){
            foodCost = guests * 15;
        }else if (food.equals("buffet lunch")){
            foodCost = guests * 20;
        }else if (food.equals("full lunch")){
            foodCost = guests * 25;
        }else if (food.equals("buffet dinner")){
            foodCost = guests * 30;
        }else if (food.equals("full dinner")) {
            foodCost = guests * 40;
        }else {
            foodCost = guests * 50;
        }
    }

    public int getBeverageCost() {
        return beverageCost;
    }

    public void setBeverageCost(){
        if(beverage.equals("no alcohol")){
            beverageCost = guests * 10;
        }else if (beverage.equals("beer and wine")){
            beverageCost = guests * 25;
        }else {
            beverageCost = guests * 50;
        }
    }

    public int getEntertainmentCost() {
        return entertainmentCost;
    }

    public void setEntertainmentCost(){
        if(entertainment.equals("none")){
            entertainmentCost = 0;
        }else if(entertainment.equals("DJ")){
            entertainmentCost = 1000;
        }else if (entertainment.equals("live band")){
            entertainmentCost = 1500;
        }else {
            entertainmentCost = 2000;
        }
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost() {
        totalCost = venueCost + foodCost + beverageCost + entertainmentCost;
    }
}
