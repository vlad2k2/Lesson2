package app.java;

public class Lesson02Program {
    // Глобальні Зміні
    static String order = "Order";
    static String client = "Client:";
    static String product = "Product:";
    static String price = "price";
    static String address = "Address:";
    static char point = '.';
    static char coma = ',';
    static String eur = "EUR";

    public static void main(String[] args) {

        char charN = 'N';
        char charO = 'o';
        char charNum =  49; // ASCI
        int charNum2 = charNum + 1; // 2 ASCI

        // Зміні для ордер 1
        String name1 = "Alice";
        String nameProd1 = "smartphone";
        float priceFloat = 305.99f;
        String nameAddress = "Moon Street";
        byte numberAddress = 10;

        // Output for order1
        System.out.println(order+ " " + charN + charO + " " + charNum + " "+ client
        + " " + name1 + point); // Line 1 Order
        System.out.println(product + " " + nameProd1 + coma); // line 2 product
        System.out.println(price + " " + eur + " " + priceFloat + point); // line 4 Price
        System.out.println(address + " " + nameAddress  + coma + " " + numberAddress);

        // Зміні для ордер2
        name1 = "Tom";
        priceFloat = 570.95f;
        nameAddress = "Terra Street";
        numberAddress = 17;

        // Output for order2
        System.out.println(order+ " " + charN + charO + " " + (char)charNum2 + " "+ client
                + " " + name1 + point); // Line 1 Order
        System.out.println(product + " " + nameProd1 + coma); // line 2 product
        System.out.println(price + " " + eur + " " + priceFloat + point); // line 4 Price
        System.out.println(address + " " + nameAddress  + coma + " " + numberAddress);


    }

}
