class Order {
    String item;
    String customer;
    int bill;

    Order(String item, String customer, int bill) {
        this.item = item;
        this.customer = customer;
        this.bill = bill;
    }

    class OrderDetails {
        void display(){
            System.out.println("Item ordered: " + item);
            System.out.println("Customer name: " + customer);
            System.out.println("Bill price: " + bill);
        }
    }
}

class DeliveryStatus {
    void status(){}
}

public class assignment6_delivery{
    public static void main(String[] args) {
        Order o = new Order("Pizza","Mrigank",370);
        Order.OrderDetails d = o.new OrderDetails();
        d.display();

        DeliveryStatus ds = new DeliveryStatus() {
          void status() {
              System.out.println("Order is out for delivery.");
          }
        };
        ds.status();
    }
}
