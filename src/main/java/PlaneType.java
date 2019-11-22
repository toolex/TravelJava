public enum PlaneType {
    BOEING747(100, 25);

    public final int weight;
    public final int capacity;

    PlaneType(int weight, int capacity){
        this.weight = weight;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
