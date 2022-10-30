package estudos;

import java.util.ArrayList;
import java.util.List;


public class IceCreamMachine {
    public String[] ingredients;
    public String[] toppings;
    
    public static class IceCream {
        public String ingredient;
        public String topping;

        public IceCream(String ingredient, String topping) {
            this.ingredient = ingredient;
            this.topping = topping;
        }
    }

    public IceCreamMachine(String[] ingredients, String[] toppings) {
        this.ingredients = ingredients;
        this.toppings = toppings;
    }

 public List<IceCream> scoops() {
            List<IceCream> scoops = new ArrayList<>();

            for (int x = 0; x<ingredients.length;x++){
                for(int y = 0; y<toppings.length;y++){
                	scoops.add(new IceCream(ingredients[x],toppings[y]));
                }
            }
            return scoops;
        }

    public static void main(String[] args) {
        IceCreamMachine machine = new IceCreamMachine(new String[]{
                "vanilla", "chocolate"
        }, new String[]{
                "chocolate sauce"
        });
        List<IceCream> scoops = machine.scoops();
        
        /*
         * Should print:
         * vanilla, chocolate sauce
         * chocolate, chocolate sauce
         */
         for (IceCream iceCream : scoops) {
         System.out.println(iceCream.ingredient + ", " + iceCream.topping);
        
        }
    }
}
