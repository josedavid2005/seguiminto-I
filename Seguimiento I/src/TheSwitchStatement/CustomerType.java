package TheSwitchStatement;

public class CustomerType {
    public static void main(String[] args) {
        String customerType = "VIP";
        double price = 100.0;
        double discount;

        switch (customerType) {
            case "Normal":
                discount = 0.0;
                break;
            case "Frequent":
                discount = 0.1;
                break;
            case "VIP":
                discount = 0.2;
                break;
            default:
                discount = 0.0;
                break;
        }

        price = price * (1 - discount);
        System.out.println(price);

    }
}
