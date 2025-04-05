interface Payment {
    void makePayment(double amount);
}

class CreditCardPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

class PayPalPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

public class InterfaceExample1 {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        payment1.makePayment(100.50);

        Payment payment2 = new PayPalPayment();
        payment2.makePayment(75.25);
    }
}
