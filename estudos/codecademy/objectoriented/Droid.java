package objectoriented;

/* Build A Droid
 * Codecademy
 *  
 * "We’ll need to define the state and behavior of the droids using instance fields and methods."
 */

public class Droid{

	  int batteryLevel = 100;
	  String name;
	  
	  public Droid(String droidName){
	    name = droidName;
	    }
	  /*public Droid(int batteryLevel){
	    batteryLevel = 100;
	    }*/
	  
	  public String toString(){
	    return " Droid: " + name + ".\n Battery lvl: " + batteryLevel + ".";
	  }

	  public void performTask(String task){
	    System.out.println(name + " is performing task: " + task);
	    batteryLevel = batteryLevel - 10;
	    System.out.println(batteryLevel);
	  }

	  public static void main(String[] args) {
	  Droid codey = new Droid("Codey");
	  System.out.println(codey);
	  codey.performTask("...Searching...");
	  codey.performTask("...Studying...");
	  System.out.println(codey);
	}}
