package optional;

import java.util.Optional;

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

    public static String getCurrentLocationOfOrderWithId(String orderId) {
        /* TODO: Implement the logic as below:
        *   1. Find order by orderId (orderId could be null)
        *   2. Find the track info based on the order from step 1
        *   3. Return the current location of track info or "No location found" if no location is set
        */

//        if (orderId != null) {
//            Order order = OrderService.findOrderByOrderId(orderId);
//
//            if (order != null && order.hasTrackingId()) {
//                TrackingInfo trackingInfo = ShippingService.findTrackingInfoByTrackingId(order.getTrackingId());
//
//                if (trackingInfo != null) {
//                    return trackingInfo.getCurrentLocation();
//                }
//            }
//        }
//
//        return "No location found";

        return Optional.ofNullable(orderId)
                .map(OrderService::findOrderByOrderId)
                .filter(Order::hasTrackingId)
                .map(Order::getTrackingId)
                .map(ShippingService::findTrackingInfoByTrackingId)
                .map(TrackingInfo::getCurrentLocation)
                .orElse("No location found");
    }
}
