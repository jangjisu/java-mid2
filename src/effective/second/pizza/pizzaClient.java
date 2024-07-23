package effective.second.pizza;

public class pizzaClient {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.HAM)
                .build();

        Calzone calzone = new Calzone.Builder()
                .sauceInside()
                .addTopping(Pizza.Topping.ONION)
                .addTopping(Pizza.Topping.PEPPER)
                .build();

        System.out.println(pizza);
        System.out.println(calzone);
    }
}
