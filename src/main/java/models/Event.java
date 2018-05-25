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
        if (guests <= 50){
            venueCost = 500;
        }else if (guests <= 100){
            venueCost = 1000;
        }else if (guests <= 150){
            venueCost = 2000;
        }else if (guests <= 200){
            venueCost = 3000;
        }else {
            venueCost = 4000;
        }
    }

    public int getFoodCost() {
        return foodCost;
    }

    public void setFoodCost(){
        if(food.equals("Hor D'oevres")){
            foodCost = guests * 15;
        }else if (food.equals("Buffet Lunch")){
            foodCost = guests * 20;
        }else if (food.equals("Full Lunch")){
            foodCost = guests * 25;
        }else if (food.equals("Buffet Dinner")){
            foodCost = guests * 30;
        }else if (food.equals("Full Dinner")) {
            foodCost = guests * 40;
        }else {
            foodCost = guests * 50;
        }
    }

    public int getBeverageCost() {
        return beverageCost;
    }

    public void setBeverageCost(){
        if(beverage.equals("No Alcohol")){
            beverageCost = guests * 10;
        }else if (beverage.equals("Beer and Wine")){
            beverageCost = guests * 20;
        }else if (beverage.equals("Beer and Wine Open")){
            beverageCost = guests * 30;
        }else if (beverage.equals("Full Bar")){
            beverageCost = guests * 25;
        }else {
            beverageCost = guests * 50;
        }
    }

    public int getEntertainmentCost() {
        return entertainmentCost;
    }

    public void setEntertainmentCost(){
        if(entertainment.equals("None")){
            entertainmentCost = 0;
        }else if(entertainment.equals("Use Own Music")){
            entertainmentCost = 100;
        }else if(entertainment.equals("DJ")){
            entertainmentCost = 1000;
        }else if (entertainment.equals("Live Band")){
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
        foodMap.put(1, "Hor D'oevres" );
        foodMap.put(2, "Buffet Lunch" );
        foodMap.put(3, "Full Lunch" );
        foodMap.put(4, "Buffet Dinner" );
        foodMap.put(5, "Full Dinner" );
        foodMap.put(6, "Dinner and Hor D'oevres" );
    }

    public Map<Integer, String> getBeverageMap() {
        return beverageMap;
    }

    public void setBeverageMap(){
        beverageMap.put(1, "No Alcohol" );
        beverageMap.put(2, "Beer and Wine" );
        beverageMap.put(3, "Full Bar" );
        beverageMap.put(4, "Beer and Wine Open" );
        beverageMap.put(5, "Open Bar" );
    }

    public Map<Integer, String> getEntertainmentMap() {
        return entertainmentMap;
    }

    public void setEntertainmentMap(){
        entertainmentMap.put(1, "None" );
        entertainmentMap.put(2, "Use Own Music" );
        entertainmentMap.put(3, "DJ" );
        entertainmentMap.put(4, "Live Band" );
        entertainmentMap.put(5, "String Quartet" );
    }

    public void useCoupon(String couponCode){
        if(couponCode.equals("20%off")){
            totalCost *= .8;
        }else {
            totalCost -= 1000;
        }
    }
}
