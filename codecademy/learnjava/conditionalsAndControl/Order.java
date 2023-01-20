package conditionalsAndControl;

/* CONDITIONALS AND CONTROL FLOW
 * If-Then-Else-If;
 * Nested Conditional Statements;
 * Switch Statement;
 * 
 * The console should print out:
 * High value item!
 * Shipping
 * Shipping cost:  0.85
 * Order not ready
 * 
 */

public class Order {
	  boolean isFilled;
	  double billAmount;
	  String shipping;
	  String couponCode;
	  
	  public Order(boolean filled, double cost, String shippingMethod, String coupon) {
			if (cost > 24.00) {
	      System.out.println("High value item!");
	    }
	    isFilled = filled;
	    billAmount = cost;
	    shipping = shippingMethod;
	    couponCode = coupon;
	  }
	  
	  public void ship() {
	    if (isFilled) {
	      System.out.println("Shipping");
	      System.out.println("Shipping cost: " + calculateShipping());
	    } else {
	      System.out.println("Order not ready");
	    }
	  }
	  
	  public double calculateShipping() {
		    if (shipping.equals("Regular")) {
		    return 0;} 
		    else if (shipping.equals("Express")) {
		         if (couponCode.equals("ship50")) {
		         return 0.85;
		         }
		         else { 
		         return 1.75; 
		         }
		    } 
		    else { 
		    return .50;}
		 	}
	  
	  /* public double calculateShipping() {
   double shippingCost;
	 
   switch (shipping){ 
        case "Regular":
        shippingCost = 0;
        break;

        case "Express":
        shippingCost = 1.75;
        break;

        default: 
        shippingCost = 0.50;
   } 
   return shippingCost;
   }
  
  public static void main(String[] args) {
    // do not alter the main method!
    Order book = new Order(true, 9.99, "Express");
    Order chemistrySet = new Order(false, 72.50, "Regular");
    
    book.ship();
    chemistrySet.ship();
  }
}
		*/
	  
	  public static void main(String[] args) {
		   
		    Order book = new Order(true, 9.99, "Express", "ship50");
		    Order chemistrySet = new Order(false, 72.50, "Regular", "freeShipping");
		    
		    book.ship();
		    chemistrySet.ship();
		  }
		}