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

  public void remove(String text) {

    int totalElements = 0;
    for (int i = 0; i < this.stringArray.length; i++) {
      if (this.stringArray[i].equals(text)){
        this.stringArray[i] = null;
      } else {
        totalElements++;
      }
    }
    
    String[] newStringArray = new String[totalElements];
    int newArrayIndex = 0;
  
    for (int i = 0; i < this.stringArray.length; i++) {
      if (this.stringArray[i] != null){
        newStringArray[newArrayIndex] = this.stringArray[i];
        newArrayIndex++;
      }
    }

    this.stringArray = newStringArray;
    this.totalStrings = totalElements;
  }

  public void display() {
    System.out.println("-------------------");
    for (String string : this.stringArray) {
      System.out.println("-> " + string);
    }
  }

  
}