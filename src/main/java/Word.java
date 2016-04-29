import java.util.ArrayList;

public class Word {
  private String mTerm;
  private static ArrayList<Word> instances = new ArrayList<Word>();

  public Word(String term) {
    mTerm = term;
    instances.add(this);
  }

  public String getTerm() {
    return mTerm;
  }

  public static ArrayList<Word> all() {
    return instances;
  }

}
