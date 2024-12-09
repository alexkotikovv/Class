/**
 * Класс для представления товара с его характеристиками.
 */
public class Product {
    // Количество товаров
    private int quantity; 
    // Цена одного товара
    private double price;  
    // Скидка на товар в процентах
    private double discount; 

    /**
     * Конструктор класса Product.
     *
     * @param quantity Количество товаров.
     * @param price Цена товара.
     * @param discount Скидка на товар.
     */
    public Product(int quantity, double price, double discount) {
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    /**
     * Метод для расчета и вывода общей суммы покупки без скидки и со скидкой.
     */
    public void calculateTotals() {
        double totalWithoutDiscount = quantity * price; // Общая сумма без скидки
        double totalDiscounted = totalWithoutDiscount * (1 - discount / 100); // Сумма со скидкой

        System.out.printf("Сумма без скидки: %.2f руб.%n", totalWithoutDiscount);
        System.out.printf("Сумма со скидкой: %.2f руб.%n", totalDiscounted);
    }
}
