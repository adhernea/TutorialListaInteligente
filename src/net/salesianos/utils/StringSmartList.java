package net.salesianos.utils;

/**
 * StringSmartList
 */
public class StringSmartList {

  private String[] stringArray;
  private int totalStrings = 0;

  public StringSmartList() {
    this.stringArray = new String[1];
  }

  public void add(String text) {
    String[] newStringArray = new String[this.totalStrings + 1];

    for (int i = 0; i < this.stringArray.length; i++) {
      newStringArray[i] = this.stringArray[i];
    }

    newStringArray[this.totalStrings] = text;
    this.stringArray = newStringArray;
    this.totalStrings++;
  }

  public void display() {
    for (String string : this.stringArray) {
      System.out.println("-> " + string);
    }
  }

  
}