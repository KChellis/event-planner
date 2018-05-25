package models;

import java.util.HashMap;
import java.util.Map;

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
    private Map<Integer, String> foodMap = new HashMap<Integer, String>();
    private Map<Integer, String> beverageMap = new HashMap<Integer, String>();
    private Map<Integer, String> entertainmentMap = new HashMap<Integer, String>();


    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        this.guests = guests;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    public String getEntertainment() {
        return entertainment;
    }

    public void setEntertainment(String entertainment) {
        this.entertainment = entertainment;
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

    public Map<Integer, String> getFoodMap() {
        return foodMap;
    }

    public void setFoodMap(){
        foodMap.put(1, "light snacks" );
        foodMap.put(2, "buffet lunch" );
        foodMap.put(3, "full lunch" );
        foodMap.put(4, "buffet dinner" );
        foodMap.put(5, "full dinner" );
        foodMap.put(6, "dinner and apps" );
    }

    public Map<Integer, String> getBeverageMap() {
        return beverageMap;
    }

    public void setBeverageMap(){
        beverageMap.put(1, "no alcohol" );
        beverageMap.put(2, "beer and wine" );
        beverageMap.put(3, "open bar" );
    }

    public Map<Integer, String> getEntertainmentMap() {
        return entertainmentMap;
    }

    public void setEntertainmentMap(){
        entertainmentMap.put(1, "none" );
        entertainmentMap.put(2, "DJ" );
        entertainmentMap.put(3, "live band" );
        entertainmentMap.put(4, "string quartet" );
    }
}
