package solid.singleresponsibilty.complex.correct.bean;

public class Availability {
    private int roomNo;
    private boolean available;

    public Availability(int roomNo, boolean available) {
        this.roomNo = roomNo;
        this.available = available;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}