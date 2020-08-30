package plane;

public class Plane {

    private final int capacity;
    private final int totalWeight;
    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
        this.capacity = planeType.getCapacity();
        this.totalWeight = planeType.getTotalWeight();
    }

    public PlaneType getPlaneType() {
        return planeType;
    }
}
