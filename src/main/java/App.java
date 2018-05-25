import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean programRunning = true;
        int userGuests = 0;
        String userFoodOption;
        int userBeverageOption;
        int userEntertainment;
        System.out.println("Hello! Welcome to the Event Planner!");
        while(programRunning) {
            try{
                System.out.println("Would you like to plan an event? Y?N");
                String eventPlanning = bufferedReader.readLine().toLowerCase();
                if (eventPlanning.equals("y")){
                    System.out.println("Great! I'll just ask you a few questions about what your event.");
                    boolean settingGuests = true;
                    while(settingGuests){
                        System.out.println("How many guests will attend the event? (max 200)");
                        userGuests = Integer.parseInt(bufferedReader.readLine());
                        if(userGuests > 0 && userGuests < 200){
                            System.out.println(String.format("%d guests. Got it!", userGuests));
                            settingGuests = false;
                        }else {
                            System.out.println("I'm sorry that is not a valid number of guests");
                        }
                    }
                    boolean settingFood = true;
                    while(settingFood){
                        System.out.println("We have a number of catering options to choose from:");
                        userFoodOption = bufferedReader.readLine();
                        if(userGuests > 0 && userGuests < 200){
                            System.out.println(String.format("%d guests. Got it!"));
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
