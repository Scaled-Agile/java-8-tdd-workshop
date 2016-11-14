package optional;

public class TrackingInfo {
    private final String trackingId;
    private String currentLocation;

    public TrackingInfo(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }
}
