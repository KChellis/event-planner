import models.Event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Event wedding = new Event();
        wedding.setGuests(75);
        wedding.setFood("Full Dinner");
        wedding.setBeverage("Beer and Wine Open");
        wedding.setEntertainment("DJ");
        wedding.setVenueCost();
        wedding.setFoodCost();
        wedding.setBeverageCost();
        wedding.setEntertainmentCost();
        wedding.setTotalCost();
        Event birthday = new Event();
        birthday.setGuests(30);
        birthday.setFood("Hors D'oevres");
        birthday.setBeverage("Open Bar");
        birthday.setEntertainment("Use Own Music");
        birthday.setVenueCost();
        birthday.setFoodCost();
        birthday.setBeverageCost();
        birthday.setEntertainmentCost();
        birthday.setTotalCost();
        Event reunion = new Event();
        reunion.setGuests(100);
        reunion.setFood("Buffet Dinner");
        reunion.setBeverage("Full bar");
        reunion.setEntertainment("DJ");
        reunion.setVenueCost();
        reunion.setFoodCost();
        reunion.setBeverageCost();
        reunion.setEntertainmentCost();
        reunion.setTotalCost();
        Event userEvent = new Event();
        userEvent.setFoodMap();
        userEvent.setBeverageMap();
        userEvent.setEntertainmentMap();
        boolean programRunning = true;
        boolean chosePackage = false;
        System.out.println("Hello! Welcome to the Fancy Schmancy Event Planner!");
        while(programRunning) {
            try{
                System.out.println("Would you like to plan a custom event, choose from one of our preset packages or see a randomly generated event? Enter 'Custom' 'Preset' 'Random' or 'Exit");
                String eventPlanning = bufferedReader.readLine().toLowerCase();
                if (eventPlanning.equals("custom")){
                    chosePackage = true;
                    System.out.println("Great! I'll just ask you a few questions about what your event.");
                    boolean settingGuests = true;
                    while(settingGuests){
                        System.out.println("How many guests will attend the event? (min 20 max 300)");
                        int userGuests = Integer.parseInt(bufferedReader.readLine());
                        if(userGuests >= 20 && userGuests <= 300){
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
                    System.out.println("2. Use your own music: We have a wonderful sound system that you may use to play your own music, $100");
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

                    userEvent.setTotalCost();


                }else if (eventPlanning.equals("preset")) {
                    System.out.println("We offer 3 preset packages:");
                    System.out.println("Our wedding package accommodates 75 guests. It offers a full sit down dinner with three entree options: Beef Wellington, Honey Ginger Salmon, and Ratatouille. Our open beer and wine package and the DJ are also included");
                    System.out.println(String.format("Total Cost: $%d", wedding.getTotalCost()));
                    System.out.println("Our birthday package accommodates 30 guests. It offers Hors D'oevres service, an open bar and access to our sound system to play your own music");
                    System.out.println(String.format("Total Cost: $%d", birthday.getTotalCost()));
                    System.out.println("Our reunion package accommodates 100 guests. It offers a buffet dinner, a full bar with 2 alcoholic drinks per person(non alcoholic drinks are unlimited), and a live band");
                    System.out.println(String.format("Total Cost: $%d", reunion.getTotalCost()));

                    boolean choosingPackage = true;
                    while(choosingPackage){
                        System.out.println("Which package would you like? Enter 'wedding' 'birthday' 'reunion' or 'back'");
                        String userOption = bufferedReader.readLine().toLowerCase();
                        if(userOption.equals("wedding")){
                            userEvent = wedding;
                            choosingPackage = false;
                            chosePackage = true;
                        }else if(userOption.equals("birthday")){
                            userEvent = birthday;
                            choosingPackage = false;
                            chosePackage = true;
                        }else if(userOption.equals("reunion")){
                            userEvent = reunion;
                            choosingPackage = false;
                            chosePackage = true;
                        }else if(userOption.equals("back")){
                            choosingPackage = false;
                        }else {
                            System.out.println("I'm sorry that is not a valid option");
                        }
                    }


                }else if (eventPlanning.equals("random")) {
                    chosePackage = true;
                    userEvent.setGuests(userEvent.generateNumber(20,300));
                    Integer userFood = userEvent.generateNumber(1,6);
                    userEvent.setFood(userEvent.getFoodMap().get(userFood));
                    Integer userBeverage = userEvent.generateNumber(1,5);
                    userEvent.setBeverage(userEvent.getBeverageMap().get(userBeverage));
                    Integer userEntertainment = userEvent.generateNumber(1,5);
                    userEvent.setEntertainment(userEvent.getEntertainmentMap().get(userEntertainment));
                    userEvent.setVenueCost();
                    userEvent.setFoodCost();
                    userEvent.setBeverageCost();
                    userEvent.setEntertainmentCost();
                    userEvent.setTotalCost();

                }else if (eventPlanning.equals("exit")) {
                    System.out.println("Okay, thanks for visiting. Goodbye.");
                    programRunning = false;
                }else{
                    System.out.println("I'm sorry that is not a valid option");
                }

                if(chosePackage){
                    boolean checkingCoupon = true;
                    String couponCode="no code";
                    while(checkingCoupon){
                        System.out.println("Do you have a coupon code? Y/N");
                        String hasCoupon = bufferedReader.readLine().toLowerCase();
                        if (hasCoupon.equals("y")){
                            boolean couponing = true;
                            while(couponing){
                                System.out.println("Please enter coupon code or 'back' to continue without entering coupon");
                                couponCode = bufferedReader.readLine().toLowerCase();
                                if(couponCode.equals("20%off") || couponCode.equals("$1000off") || couponCode.equals("back") ){
                                    couponing = false;
                                    checkingCoupon = false;
                                }else {
                                    System.out.println("That is not a valid code");
                                }
                            }

                        }else if (hasCoupon.equals("n")){
                            checkingCoupon = false;
                        }else{
                            System.out.println("Please enter Y or N");
                        }
                    }

                    System.out.println("Here are your event details:");
                    System.out.println(String.format("Guests: %d            Venue Cost: $%d", userEvent.getGuests(), userEvent.getVenueCost()));
                    System.out.println(String.format("Food: %s          Food Cost: $%d", userEvent.getFood(), userEvent.getFoodCost()));
                    System.out.println(String.format("Beverage: %s          Beverage Cost: $%d", userEvent.getBeverage(), userEvent.getBeverageCost()));
                    System.out.println(String.format("Entertainment: %s         Entertainment Cost: $%d", userEvent.getEntertainment(), userEvent.getEntertainmentCost()));
                    System.out.println(String.format("                    Total Cost: $%d", userEvent.getTotalCost()));
                    if(couponCode.equals("20%off") || couponCode.equals("$1000off") ){
                        System.out.println(String.format("Coupon code: %s", couponCode));
                        userEvent.useCoupon(couponCode);
                        System.out.println(String.format("New Total Cost: $%d", userEvent.getTotalCost()));
                    }
                    boolean checkExit = true;
                    while(checkExit){
                        System.out.println("Would you like to plan another event? Y/N");
                        String exiting = bufferedReader.readLine().toLowerCase();
                        if(exiting.equals("n")){
                            System.out.println("Thanks for planning your event with us! Goodbye.");
                            checkExit = false;
                            programRunning = false;
                        }else if (exiting.equals("y")){
                            checkExit = false;
                            chosePackage = false;
                        }else {
                            System.out.println("Please enter Y or N");
                        }
                    }
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }




    }
}
