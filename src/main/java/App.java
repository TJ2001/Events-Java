import java.io.Console;

public class App {
  public static void main(String[] args){
    Console myConsole = System.console();
    System.out.println("printf \"\033c\"");
    System.out.println("===============================================================================");
    System.out.println("Welcome to Tim's Event Planner Application.");
    System.out.println("===============================================================================");
    System.out.println("Lets plan this Event.");
    System.out.println("How many people are you expecting at this event?");
    String numberOfGuests = myConsole.readLine();
    int guests = Integer.parseInt(numberOfGuests);
    System.out.println("Sounds great! " + numberOfGuests + " guests. Party Time, Excellent!");
    System.out.println("What type of food will you have. We have Japanese, Italian, and Seafood (serves lobster).");
    String food = myConsole.readLine();
    System.out.println("Delicioius choice. Now, what type of beverage options will you want to be made available. [Enter \"s\" for soda and water, \"b\" for beer and Wine, \"f\" for full bar]");
    String drink = myConsole.readLine();
    System.out.println("Wahoo! Now we're cooking... or better yet, drinking!");
    System.out.println("Now for some entertainment. We have a very funny standup Comedian to emcee the event, a very popular local singer, and a dance troupe.");
    System.out.println("[Enter \"c\" for the comedian, \"s\" for the singer, \"m\" for a magician, and \"d\" for the dance troupe.]");
    String show = myConsole.readLine();
    Event userEvent = new Event(guests, food, drink, show);
    Integer entranceFee = userEvent.getGuestCost();
    Integer totalCost = userEvent.getTotalCost();
    Integer totalFoodCost = userEvent.getTotalFoodCost();
    Integer totalDrinkCost = userEvent.getTotalDrinkCost();
    Integer showCost = userEvent.getShowCost();
    Integer totalCostPerGuest = userEvent.getTotalCostPerGuest();
    System.out.println("printf \"\033c\"");
    System.out.println("===============================================================================");
    System.out.println("Total Entrance Fee Cost: " + entranceFee);
    System.out.println("Total Food Cost: " + totalFoodCost);
    System.out.println("Total Beverage Cost: " + totalDrinkCost);
    System.out.println("Total Entertainment Cost: " + showCost);
    System.out.println(" ");
    System.out.println("Well here's your projected total cost: " + totalCost);
    System.out.println(" ");
    System.out.println("Total cost per guest: " + totalCostPerGuest);
    System.out.println(" ");
    System.out.println("Party On!");
    System.out.println(" ");
    System.out.println("===============================================================================");
  }
}
