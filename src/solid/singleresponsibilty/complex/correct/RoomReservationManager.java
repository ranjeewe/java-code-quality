package solid.singleresponsibilty.complex.correct;

import solid.singleresponsibilty.complex.correct.bean.BookingCriteria;
import solid.singleresponsibilty.complex.correct.bean.Room;

public class RoomReservationManager {
    public void reserve(Room room,
                        BookingCriteria criteria) {
        //reserve
        System.out.println("Booked room number:" + room.getRoomNo() + " for " + criteria);
    }
}