public class Plane {
    private PlaneType plane;

    public Plane(PlaneType plane){
        this.plane = plane;
    }

    public Enum getPlaneType() {
        return this.plane;
    }

    public int findCapacity() {
        return this.plane.getCapacity();
    }
}
