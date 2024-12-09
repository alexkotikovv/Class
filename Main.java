/**
 * 
 */
public class Main {
    public static void main(String[] args) {
        // Создаем объекты класса Product
        Product product1 = new Product(10, 100.0, 0.75);   // 10 товаров, цена 100.0, скидка 0.75%
        Product product2 = new Product(5, 200.5, 42.575);   // 5 товаров, цена 200.5, скидка 42.575%
        Product product3 = new Product(3, 150.0, 59.1);     // 3 товара, цена 150.0, скидка 59.1%

        // Вызываем метод
        product1.calculateTotals();
        System.out.println();  
        product2.calculateTotals();
        System.out.println();  
        product3.calculateTotals();
    }
}
