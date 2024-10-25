public class TicketMachine {
    private int balance;
    private int total;
    private int price;

    public TicketMachine(int price) {
        this.price = price;
        this.balance = 0;
        this.total = 0;
    }

    public int getPrice() {
        return price;
    }

    public int getBalance() {
        return balance;
    }

    public void insertMoney(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Amount must be positive.");
        }
    }

    public boolean hasSufficientBalance() {
        return balance >= price;
    }

    public void printTicket() {
        if (hasSufficientBalance()) {
            System.out.println("########## Ticket ##########");
            System.out.println("Price: " + price + " cents.");
            System.out.println("############################");
            balance -= price;
            total += price;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public int refundBalance() {
        int amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
