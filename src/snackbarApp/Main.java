
package snackbarApp;

public class Main {
  private static void data() {
    Customer c1 = new Customer("Jane", 45.25);
    Customer c2 = new Customer("Bob", 33.14);

    Vendor v1 = new Vendor("Food");
    Vendor v2 = new Vendor("Drinks");
    Vendor v3 = new Vendor("Office");

    Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
    Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
    Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());
    Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
    Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

    System.out.println("Case: Customer 1 buys 3 of snack 4");
    c1.purchaseSnack(3, s4);
    System.out.println("Cash Remaining: " + c1.checkCash());
    System.out.println(s4.name + " Remaining: " + s4.getQuantity());

    System.out.println("Case: Customer 1 buys 1 of snack 3");
    c1.purchaseSnack(1, s3);
    System.out.println("Cash Remaining: " + c1.checkCash());
    System.out.println(s3.name + " Remaining: " + s3.getQuantity());

    System.out.println("Case: Customer 2 buys 2 of snack 4");
    c2.purchaseSnack(2, s4);
    System.out.println("Cash Remaining: " + c2.checkCash());
    System.out.println(s4.name + " Remaining: " + s4.getQuantity());

    System.out.println("Case: Customer 1 finds $10");
    c1.addCash(10);
    System.out.println("Cash Remaining: " + c1.checkCash());

    System.out.println("Case: Customer 1 buys 1 of snack 2");
    c1.purchaseSnack(1, s2);
    System.out.println("Cash Remaining: " + c1.checkCash());
    System.out.println(s2.name + " Remaining: " + s2.getQuantity());

    System.out.println("Case: Snack 3 gets 12 more.");
    s3.refill(12);
    System.out.println(s3.name + " Remaining: " + s3.getQuantity());

    System.out.println("Case: Customer 2 buys 3 of snack 3.");
    c2.purchaseSnack(3, s3);
    System.out.println("Cash Remaining: " + c2.checkCash());
    System.out.println(s3.name + " Remaining: " + s3.getQuantity());
  }

  public static void main(String[] args) {
    data();
  }
}