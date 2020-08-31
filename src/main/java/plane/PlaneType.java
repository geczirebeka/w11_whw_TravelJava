package plane;

public enum PlaneType {
    AIRBUSA380(250, 500),
    AIRBUSA220(150, 300),
    BOEING747(300, 600),
    BOEING737(270, 550);

    public final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getTotalWeight() {
        return this.totalWeight;
    }
}
