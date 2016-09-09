//Drinks: s for soda and water, b for beer and Wine, f for Full Bar.
//Show: c for comedian, s for singer, m for magician, d for dance troupe.

public class Event {
  private int mGuest;
  private String mFood;
  private String mDrink;
  private String mShow;

  public Event(int guest, String food, String drink, String show) {
    mGuest = guest;
    mFood = food;
    mDrink = drink;
    mShow = show;
  }

  public Integer getGuestCost() {
    Integer cost = (mGuest * 3);
    return cost;
  }

  public Integer getFoodCost() {
    Integer pricePerPlate = 0;
    if (mFood.equals("Japanese")){
      pricePerPlate = 10;
    } else if (mFood.equals("Italian")){
      pricePerPlate = 7;
    } else if (mFood.equals("Seafood")){
      pricePerPlate = 25;
    }
    return pricePerPlate;
  }

  public Integer getTotalFoodCost(){
    Integer totalFoodCost = getFoodCost() * mGuest;
    return totalFoodCost;
  }

  public Integer getDrinkCost() {
    Integer drinkCostPerGuest = 0;
    if (mDrink.equals("s")){
      drinkCostPerGuest = 2;
    } else if (mDrink.equals("b")){
      drinkCostPerGuest = 5;
    } else if (mDrink.equals("f")){
      drinkCostPerGuest = 10;
    }
    return drinkCostPerGuest;
  }

  public Integer getTotalDrinkCost(){
    Integer totalDrinkCost = getDrinkCost() * mGuest;
    return totalDrinkCost;
  }

  public Integer getShowCost() {
    Integer showCost = 0;
    if (mShow.equals("c")){
      showCost = 100;
    } else if (mShow.equals("s")) {
      showCost = 150;
    } else if (mShow.equals("m")) {
      showCost = 200;
    } else if (mShow.equals("d")) {
      showCost = 1000;
    }
    return showCost;
  }

  public Integer getTotalCost(){
    Integer totalCost = getGuestCost() + (getTotalFoodCost()) + (getTotalDrinkCost()) + getShowCost();
    return totalCost;
  }
}
