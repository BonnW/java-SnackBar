
package snackbarApp;

public class Vendor {
  private static int maxID = 0;
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

  public void changeName(String name) {
    this.Vname = name;
  }
}