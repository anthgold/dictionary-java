import java.util.ArrayList;

public class Word {

  private String mTerm;
  private static ArrayList<Word> instances = new ArrayList<Word>();
  private int mId;

  public Word(String term) {
    mTerm = term;
    instances.add(this);
    mId = instances.size();
  }

  public String getTerm() {
    return mTerm;
  }

  public static void clear() {
    instances.clear();
  }

  public static ArrayList<Word> all() {
    return instances;
  }



}
