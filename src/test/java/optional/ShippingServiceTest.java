package optional;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ShippingServiceTest {

    @Test
    public void should_return_track_info_for_test_tracking() {
        String trackingId = "test-tracking-123";
        TrackingInfo trackingInfo = ShippingService.findTrackingInfoByTrackingId(trackingId);

        assertEquals(trackingId, trackingInfo.getTrackingId());
    }

    @Test
    public void should_return_null_other_than_test_tracking() {
        String trackingId = "tracking-123";

        assertNull(ShippingService.findTrackingInfoByTrackingId(trackingId));
    }

    // TODO: Build test cases for getCurrentLocationOfOrderWithId(String orderId)

}
