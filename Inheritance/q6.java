package Inheritance;

class Order {
    int orderId;
    String orderDate;
}

class ShippedOrder extends Order {
    String trackingNumber;
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    String getOrderStatus() {
        return "Delivered";
    }
}

public class q6 {
    public static void main(String[] args) {

        DeliveredOrder order = new DeliveredOrder();

        order.orderId = 1001;
        order.orderDate = "22-01-2026";
        order.trackingNumber = "TRK987654";
        order.deliveryDate = "24-01-2026";

        System.out.println("Order ID: " + order.orderId);
        System.out.println("Order Date: " + order.orderDate);
        System.out.println("Tracking Number: " + order.trackingNumber);
        System.out.println("Delivery Date: " + order.deliveryDate);
        System.out.println("Status: " + order.getOrderStatus());
    }

}
