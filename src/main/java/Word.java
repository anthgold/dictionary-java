import java.util.ArrayList;

public class Word {

  private String mTerm;
  // allows us to retrieve all words entered:
  private static ArrayList<Word> instances = new ArrayList<Word>();
  private int mId; // adds an ID to each word as we create it

  public Word(String term) {
    mTerm = term;
    instances.add(this);  // allows us to retrieve all words entered
    mId = instances.size(); // adds an ID to each word as we create it
  }

  public String getTerm() {
    return mTerm;
  }

  public static void clear() {
    instances.clear();
  }

}
