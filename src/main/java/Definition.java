import java.util.ArrayList;

public class Definition {
  private String mMeaning;
  // allows us to retrieve all definitions entered:
  private static ArrayList<Definition> instances = new ArrayList<Definition>();
  private int mId; // adds an ID to each definition as we create it

  public Definition(String meaning) {
    mMeaning = meaning;
    instances.add(this);  // allows us to retrieve all definitions entered
    mId = instances.size(); // adds an ID to each definition as we create it
  }

  public String getMeaning() {
    return mMeaning;
  }

  // allows us to retrieve all definitions entered:
  public static ArrayList<Definition> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() { // adds an ID to each definition as we create it
    return mId;
  }

  public static Definition find(int id) { // finds a specific definition given its id
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException exception) {
      return null;
    }
  }

}
