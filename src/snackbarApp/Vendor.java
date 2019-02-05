
package snackbarApp;

public class Vendor {
  private static int maxId = 0;
  private int id;
  public String Vname;

  public Vendor(String name) {
    maxId++;
    id = maxId;
    Vname = name;
  }

  public String getName() {
    return this.Vname;
  }

  public int getId() {
    return this.id;
  }

  public void changeName(String name) {
    this.Vname = name;
  }
}