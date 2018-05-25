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
                        System.out.println("How many guests will attend the event? (max 200)");
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
                    while(settingFood){
                        System.out.println("We have a number of catering options to choose from:");
                        System.out.println("1. Light Snacks: A sampling of delicious Hors D'oeuvres. $15 per guest");
                        System.out.println("2. Buffet Lunch: A simple salad soup and sandwich bar. $20 per guest");
                        System.out.println("3. Full Lunch: A nice sit down pasta lunch with Chicken, Shrimp or Vegetarian options . $25 per guest");
                        System.out.println("4. Buffet Dinner: A simple buffet with fish an chicken entree options and various seasonal sides . $30 per guest");
                        System.out.println("5. Full Dinner: A nice sit down dinner with Beef Wellington, Honey Garlic Salmon, or Ratatouille options . $40 per guest");
                        System.out.println("6. Dinner and Apps: Our delicious Hors D'oeuvres served with full dinner later $50 per guest");
                        System.out.println("Please enter the number for the option you would like");

                        int userFoodOption = Integer.parseInt(bufferedReader.readLine());
                        if(userFoodOption > 0 && userFoodOption < 7){
                            userEvent.setFood(userEvent.getFoodMap().get(userFoodOption));
                            userEvent.setFoodCost();
                            System.out.println(String.format("%s. Got it!", userEvent.getFood()));
                            System.out.println(String.format("That will cost $%d", userEvent.getFoodCost()));

                            settingGuests = false;
                        }else {
                            System.out.println("I'm sorry that is not a valid option");
                        }
                    }


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
