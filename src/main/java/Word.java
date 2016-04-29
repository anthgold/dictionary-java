import java.util.ArrayList;

public class Word {
  private String mTerm;
  // allows us to retrieve all words entered:
  private static ArrayList<Word> instances = new ArrayList<Word>();

  public Word(String term) {
    mTerm = term;
    instances.add(this);  // allows us to retrieve all words entered
  }

  public String getTerm() {
    return mTerm;
  }

  // allows us to retrieve all words entered:
  public static ArrayList<Word> all() {
    return instances;
  }

}
