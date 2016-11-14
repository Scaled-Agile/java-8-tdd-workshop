package optional;

public class Order {
    private final String orderId;
    private String trackingId;

    public Order(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public boolean hasTrackingId() {
        return trackingId != null;
    }
}
