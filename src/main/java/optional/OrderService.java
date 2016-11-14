package optional;

public class OrderService {

    // This method is hard-coded just for demo purpose
    public static Order findOrderByOrderId(String orderId) {
        Order order = null;
        if ("test-order-with-tracking-id".equals(orderId)) {
            order = new Order(orderId);
            order.setTrackingId("test-tracking-123");
        } else if ("test-order-without-tracking-id".equals((orderId))) {
            order = new Order(orderId);
        }
        return order;
    }
}
