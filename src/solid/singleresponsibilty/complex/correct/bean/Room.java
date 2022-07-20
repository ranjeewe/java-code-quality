package solid.singleresponsibilty.complex.correct.bean;

public class Room {
    private int roomNo;
    private int infant;
    private int child;
    private int adult;

    public Room(int roomNo, int infant, int child, int adult) {
        this.roomNo = roomNo;
        this.infant = infant;
        this.child = child;
        this.adult = adult;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public int getInfant() {
        return infant;
    }

    public void setInfant(int infant) {
        this.infant = infant;
    }

    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    public int getAdult() {
        return adult;
    }

    public void setAdult(int adult) {
        this.adult = adult;
    }
}