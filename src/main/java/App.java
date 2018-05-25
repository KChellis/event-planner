import models.Event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean programRunning = true;
        System.out.println("Hello! Welcome to the Event Planner!");
        while(programRunning) {
            try{
                System.out.println("Would you like to plan an event? Y?N");
                String eventPlanning = bufferedReader.readLine().toLowerCase();
                if (eventPlanning.equals("y")){
                    Event userEvent = new Event();
                    userEvent.setFoodMap();
                    userEvent.setBeverageMap();
                    userEvent.setEntertainmentMap();
                    System.out.println("Great! I'll just ask you a few questions about what your event.");
                    boolean settingGuests = true;
                    while(settingGuests){
                        System.out.println("How many guests will attend the event? (min 20 max 300)");
                        int userGuests = Integer.parseInt(bufferedReader.readLine());
                        if(userGuests > 0 && userGuests < 200){
                            userEvent.setGuests(userGuests);
                            userEvent.setVenueCost();
                            System.out.println(String.format("%d guests. Got it!", userGuests));
                            System.out.println(String.format("The venue for %d guests costs $%d", userGuests, userEvent.getVenueCost()));

                            settingGuests = false;
                        }else {
                            System.out.println("I'm sorry that is not a valid number of guests");
                        }
                    }
                    boolean settingFood = true;
                    System.out.println("Next tell me what kind of food you would like. We have a number of catering options to choose from:");
                    System.out.println("1. Hor D'oevres: A sampling of delicious Hors D'oeuvres. $15 per guest");
                    System.out.println("2. Buffet Lunch: A simple salad soup and sandwich bar. $20 per guest");
                    System.out.println("3. Full Lunch: A nice sit down pasta lunch with Chicken, Shrimp or Vegetarian options . $25 per guest");
                    System.out.println("4. Buffet Dinner: A simple buffet with fish an chicken entree options and various seasonal sides . $30 per guest");
                    System.out.println("5. Full Dinner: A nice sit down dinner with Beef Wellington, Honey Garlic Salmon, or Ratatouille options . $40 per guest");
                    System.out.println("6. Dinner and Hor D'oevres: Our delicious Hors D'oeuvres served with full dinner after $50 per guest");
                    while(settingFood){

                        System.out.println("Please enter the number for the option you would like");

                        int userFoodOption = Integer.parseInt(bufferedReader.readLine());
                        if(userFoodOption > 0 && userFoodOption < 7){
                            userEvent.setFood(userEvent.getFoodMap().get(userFoodOption));
                            userEvent.setFoodCost();
                            System.out.println(String.format("%s. Got it!", userEvent.getFood()));
                            System.out.println(String.format("That will cost $%d", userEvent.getFoodCost()));

                            settingFood = false;
                        }else {
                            System.out.println("I'm sorry that is not a valid option");
                        }
                    }
                    boolean settingBeverage = true;
                    System.out.println("Next tell me what kind of beverages you would like. We have a number of bar options to choose from:");
                    System.out.println("1. No alcohol: A selection of soft drinks and juices, unlimited. $10 per guest");
                    System.out.println("2. Beer and Wine: Includes the no alcohol package plus a selection of local beers and wines, 2 per guest. $20 per guest");
                    System.out.println("3. Full Bar: Full access to any drink in the bar, 2 per guest. $25 per guest");
                    System.out.println("4. Beer and Wine Open: Includes the no alcohol package plus a selection of local beers and wines, unlimited. $40 per guest");
                    System.out.println("5. Open bar: Full access to any drink in the bar, unlimited . $50 per guest");
                    while(settingBeverage){

                        System.out.println("Please enter the number for the option you would like");

                        int userBeverageOption = Integer.parseInt(bufferedReader.readLine());
                        if(userBeverageOption > 0 && userBeverageOption < 7){
                            userEvent.setBeverage(userEvent.getBeverageMap().get(userBeverageOption));
                            userEvent.setBeverageCost();
                            System.out.println(String.format("%s. Got it!", userEvent.getBeverage()));
                            System.out.println(String.format("That will cost $%d", userEvent.getBeverageCost()));

                            settingBeverage = false;
                        }else {
                            System.out.println("I'm sorry that is not a valid option");
                        }
                    }
                    boolean settingEntertainment = true;
                    System.out.println("Finally we have several entertainment options to choose from:");
                    System.out.println("1. None: No entertainment will be provided, no cost");
                    System.out.println("2. Use your own music: We have a wonderful sound system and you may use it to play your own music, $100");
                    System.out.println("3. DJ: Our in house DJ will play songs that will keep your guests on the dance floor,  $1000");
                    System.out.println("4. Live Band: Our band can play songs from a variety of genres sure to please your guests, $1500");
                    System.out.println("5. String Quartet: Your guests will be delighted with the beautiful classical music by our award winning string quartet, $2000");
                    while(settingEntertainment){

                        System.out.println("Please enter the number for the option you would like");

                        int userEntertainmentOption = Integer.parseInt(bufferedReader.readLine());
                        if(userEntertainmentOption > 0 && userEntertainmentOption < 7){
                            userEvent.setEntertainment(userEvent.getEntertainmentMap().get(userEntertainmentOption));
                            userEvent.setEntertainmentCost();
                            System.out.println(String.format("%s. Got it!", userEvent.getEntertainment()));
                            System.out.println(String.format("That will cost $%d", userEvent.getEntertainmentCost()));

                            settingEntertainment = false;
                        }else {
                            System.out.println("I'm sorry that is not a valid option");
                        }
                    }
                    System.out.println("Do you have a coupon code?");
                    System.out.println("Great these are your event details:");
                    System.out.println(String.format("Guests: %d   Venue Cost: $%d", userEvent.getGuests(), userEvent.getVenueCost()));
                    System.out.println(String.format("Food: %s   Food Cost: $%d", userEvent.getFood(), userEvent.getFoodCost()));
                    System.out.println(String.format("Beverage: %s   Beverage Cost: $%d", userEvent.getBeverage(), userEvent.getBeverageCost()));
                    System.out.println(String.format("Entertainment: %s   Entertainment Cost: $%d", userEvent.getEntertainment(), userEvent.getEntertainmentCost()));
                    System.out.println(String.format("Entertainment: %s   Entertainment Cost: $%d", userEvent.getEntertainment(), userEvent.getEntertainmentCost()));

                    System.out.println(String.format("Total Cost: $%d", userEvent.getTotalCost()));


                }else if (eventPlanning.equals("n")) {
                    System.out.println("Okay, thanks for visiting. Goodbye.");
                    programRunning = false;
                }else{
                    System.out.println("I didn't understand that input");
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }




    }
}
