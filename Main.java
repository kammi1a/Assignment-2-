public class Main {
    public static void main(String[] args) {
        // Создание смартфона по умолчанию
        Smartphone defaultPhone = new Smartphone();
        defaultPhone.displayInfo();

        // Создание смартфонов с использованием параметризованного конструктора
        Smartphone phone1 = new Smartphone("Apple", "iPhone 14", 128, 999.99);
        Smartphone phone2 = new Smartphone("Samsung", "Galaxy S23", 256, 799.99);

        // Отображение информации о phone1
        System.out.println("\nИнформация о телефоне 1:");
        phone1.displayInfo();

        // Отображение информации о phone2
        System.out.println("\nИнформация о телефоне 2:");
        phone2.displayInfo();

        // Применение скидки и отображение обновленной информации для phone1
        phone1.applyDiscount(10);
        System.out.println("\nПосле применения скидки к телефону 1:");
        phone1.displayInfo();
    }
}

