
package snackbarApp;

public class Customer {
  private static int maxId = 0;
  private int id;
  private String name;
  private double cash;

  public Customer(String name, double cash) {
    maxId++;
    id = maxId;
    this.name = name;
    this.cash = cash;
  }

  public int getID() {
    return id;
  }

  public String getName() {
    return this.name;
  }

  public void changeName(String name) {
    this.name = name;
  }

  public double checkCash() {
    return this.cash;
  }

  public void addCash(int x) {
    this.cash += x;
  }

  public void purchaseSnack(int numSnacks, Snack snack) {
    double cost = numSnacks * snack.cost;
    this.cash -= cost;
    snack.buySnack(numSnacks);
  }

}