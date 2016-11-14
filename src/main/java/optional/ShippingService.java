package optional;

public class ShippingService {

    // This method is hard-coded just for demo purpose
    public static TrackingInfo findTrackingInfoByTrackingId(String trackingId) {
        TrackingInfo trackingInfo = null;
        if ("test-tracking-123".equals(trackingId)) {
            trackingInfo = new TrackingInfo(trackingId);
            trackingInfo.setCurrentLocation("Melbourne");
        }
        return trackingInfo;
    }

    public String getCurrentLocationOfOrderWithId(String orderId) {
        /* TODO: Implement the logic as below:
        *   1. Find order by orderId (orderId could be null)
        *   2. Find the track info based on the order from step 1
        *   3. Return the current location of track info or "No location found" if no location is set
        */

        throw new UnsupportedOperationException("To be implemented");
    }
}
