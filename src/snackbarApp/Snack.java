
package snackbarApp;

public class Snack {
  private static int maxId = 0;
  public int id;
  public String name;
  private int quantity;
  public double cost;
  public int vendorID;

  public Snack(String name, int quantity, double cost, int vendorID) {
    maxId++;
    id = maxId;

    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendorID = vendorID;
  }

  public void changeName(String newName) {
    this.name = newName;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void refill(int x) {
    this.quantity += x;
  }

  public String buySnack(int x) {
    this.quantity -= x;
    return "Purchased " + x + this.name;
  }

  public double purchaseTotal(int x) {
    return this.cost * x;
  }

}