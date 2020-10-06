package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history = "0";
  
  /**
   * Constructor for AddingMachine class
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  /**
   * @return the total value
   */
  public int getTotal () {
    return total;
  }
  
  /**
   * adds passed value to total
   * @param value
   */
  public void add (int value) {
	  
	  total += value;
	  history = history + " + " + value;
	  
  }

  /**
   * subtracts passes value to total
   * @param value
   */
  public void subtract (int value) {
	  
	  total -= value;
	  history = history + " - " + value;
	  
  }
  
  /**
   * returns history of all transactions
   */
  public String toString () {
    return history;
  }

  /**
   * clears "memory"
   */
  public void clear() {
	  
	  total = 0;
	  
  }
  
  
}