package net.salesianos.utils;

/**
 * SmartList
 */
public class SmartList<T> {

  private T[] array;
  private int totalElements = 0;

  public SmartList() {
    this.array = (T[]) new Object[1];
  }

  public void add(T element) {
    T[] newArray = (T[]) new Object[this.totalElements + 1];

    for (int i = 0; i < this.array.length; i++) {
      newArray[i] = this.array[i];
    }

    newArray[this.totalElements] = element;
    this.array = newArray;
    this.totalElements++;
  }

  public void remove(T element) {

    int totalElements = 0;
    for (int i = 0; i < this.array.length; i++) {
      if (this.array[i].equals(element)){
        this.array[i] = null;
      } else {
        totalElements++;
      }
    }
    
    T[] newArray = (T[]) new Object[totalElements];
    int newArrayIndex = 0;
  
    for (int i = 0; i < this.array.length; i++) {
      if (this.array[i] != null){
        newArray[newArrayIndex] = this.array[i];
        newArrayIndex++;
      }
    }

    this.array = newArray;
    this.totalElements = totalElements;
  }

  public void display() {
    System.out.println("-------------------");
    for (T element : this.array) {
      System.out.println("-> " + element);
    }
  }

  public void insert(T element, int position) {

    if (position >= totalElements) {
      System.out.println("El array no tiene aun esa posición");
      return;
    } else if (position < 0) {
      System.out.println("No acepto posiciones negativas");
      return;
    }

    T[] newArray = (T[]) new Object[this.totalElements + 1];

    for (int i = 0; i < this.array.length; i++) {
      if (i < position) {
        newArray[i] = this.array[i];
      } else if (i == position) {
        newArray[i] = element;
        newArray[i+1] = this.array[i];
      } else {
        newArray[i+1] = this.array[i];
      }
    }

      totalElements++;
      this.array = newArray;

  }

  public T get(int position) {
    if (position >= totalElements) {
      System.out.println("El array no tiene aun esa posición");
      return null;
    } else if (position < 0) {
      System.out.println("No acepto posiciones negativas");
      return null;
    }

    return this.array[position];
  }

  public void delete(int position) {

    int totalElements = 0;
    for (int i = 0; i < this.array.length; i++) {
      if (i == position){
        this.array[i] = null;
      } else {
        totalElements++;
      }
    }
    
    T[] newStringArray = (T[]) new Object[totalElements];
    int newArrayIndex = 0;
  
    for (int i = 0; i < this.array.length; i++) {
      if (this.array[i] != null){
        newStringArray[newArrayIndex] = this.array[i];
        newArrayIndex++;
      }
    }

    this.array = newStringArray;
    this.totalElements = totalElements;
  }

  public T search(T element) {

    if (element == null) {
      return null;
    }

    for (T arrayElement : array) {
      if (element.equals(arrayElement)) {
        return arrayElement;
      }
    }

    return null;
  }

  public int length() {
    return this.totalElements;
  }
}