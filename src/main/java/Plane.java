public class Plane {
    private Enum PlaneType;

    public Plane(Enum planeType){
        this.PlaneType = planeType;
    }

    public Enum getPlaneType() {
        return this.PlaneType;
    }

    public int findCapacity() {
        getPlaneType();
        return getCapacity();
    }
}
