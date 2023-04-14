package net.salesianos.utils;

/**
 * StringSmartList
 */
public class StringSmartList {

  private String[] stringArray;
  private int listIndex = 0;

  public StringSmartList() {
    this.stringArray = new String[1];
  }

  public void add(String text) {
    this.stringArray[this.listIndex] = text;
    this.listIndex++;
  }

  
}