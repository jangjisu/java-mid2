package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int addQuantity) {
        int existingQuanity = cartMap.getOrDefault(product, 0);
        cartMap.put(product, existingQuanity + addQuantity);
    }

    public void minus(Product product, int minusQuantity) {
        int existingQuantity = cartMap.getOrDefault(product, 0);
        int newQuanity = existingQuantity - minusQuantity;

        if(newQuanity <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, newQuanity);
        }
    }

    public void printAll() {
        System.out.println("== 모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품 : " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartMap=" + cartMap +
                '}';
    }
}
