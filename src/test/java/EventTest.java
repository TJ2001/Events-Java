import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instanceOfEvent(){
    Event testEvent = new Event(0, "", "", "");
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void getGuestCost_recieveCostForGuest_ReturnOneGuestCost(){
    int guest = 1;
    Event testEvent = new Event(guest, "", "", "");
    Integer expected = 3;
    assertEquals(expected, testEvent.getGuestCost());
  }

  @Test
  public void getGuestCost_recieveCostForMoreGuests_ReturnCost(){
    int guest = 5;
    Event testEvent = new Event(guest, "", "", "");
    Integer expected = 15;
    assertEquals(expected, testEvent.getGuestCost());
  }

  @Test
  public void getFoodCost_recieveJapaneseFoodCost_ReturnPerPlateCost(){
    String food = "Japanese";
    Event testEvent = new Event(0, food, "", "");
    Integer expected = 10;
    assertEquals(expected, testEvent.getFoodCost());
  }

  @Test
  public void getFoodCost_recieveItalianFoodCost_ReturnPerPlateCost(){
    String food = "Italian";
    Event testEvent = new Event(0, food, "", "");
    Integer expected = 7;
    assertEquals(expected, testEvent.getFoodCost());
  }

  @Test
  public void getDrinkCost_recieveSodaCost_ReturnDrinksPerGuest(){
    String drink = "s";
    Event testEvent = new Event(0, "", drink, "");
    Integer expected = 2;
    assertEquals(expected, testEvent.getDrinkCost());
  }

  @Test
  public void getDrinkCost_recieveWhiskeyCost_ReturnDrinksPerGuest(){
    String drink = "f";
    Event testEvent = new Event(0, "", drink, "");
    Integer expected = 10;
    assertEquals(expected, testEvent.getDrinkCost());
  }

  @Test
  public void getShowCost_returnComedianCost(){
    String show = "c";
    Event testEvent = new Event(0, "", "", show);
    Integer expected = 100;
    assertEquals(expected, testEvent.getShowCost());
  }

  @Test
  public void getShowCost_returnDanceTroupeCost(){
    String show = "d";
    Event testEvent = new Event(0, "", "", show);
    Integer expected = 1000;
    assertEquals(expected, testEvent.getShowCost());
  }

  @Test
  public void getTotalCost_returnTotalCost(){
    int guest = 20;
    String food = "Italian";
    String drink = "b";
    String show = "s";
    Event testEvent = new Event(guest, food, drink, show);
    Integer expected = 450;
    assertEquals(expected, testEvent.getTotalCost());
  }

  @Test
  public void getTotalFoodCost_returnTotalFoodCost(){
    int guest = 15;
    String food = "Seafood";
    Event testEvent = new Event(guest, food, "", "");
    Integer expected = 375;
    assertEquals(expected, testEvent.getTotalFoodCost());
  }

  @Test
  public void getTotalDrinkCost_returnTotalDrinkCost(){
    int guest = 10;
    String drink = "b";
    Event testEvent = new Event(guest, "", drink, "");
    Integer expected = 50;
    assertEquals(expected, testEvent.getTotalDrinkCost());
  }
}
