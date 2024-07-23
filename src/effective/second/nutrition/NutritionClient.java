package effective.second.nutrition;

public class NutritionClient {
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .calories(100)
                .sodium(35)
                .fat(100)
                .carbohydrate(27)
                .build();

        if(cocaCola.getCalories() == 100) {
            System.out.println("test");
        }
    }
}
