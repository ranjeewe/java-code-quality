package solid.singleresponsibilty.complex.correct;

import solid.singleresponsibilty.complex.correct.bean.BookingCriteria;
import solid.singleresponsibilty.complex.correct.bean.Room;
import solid.singleresponsibilty.complex.correct.util.CriteriaValidator;

import java.time.LocalDate;
import java.util.Optional;

public class HotelManager {

    public static void main(String[] args) {
        LocalDate fromDate = LocalDate.of(2022, 12, 12);
        LocalDate toDate = LocalDate.of(2022, 12, 14);

        BookingCriteria criteria = new BookingCriteria(fromDate, toDate, 2, 2, 0);
        if (CriteriaValidator.validateCriteria(criteria)) {
            AvailabilityChecker availabilityChecker = new AvailabilityChecker();
            Optional<Room> roomOptional = availabilityChecker.checkAvailability(criteria);

            if (roomOptional.isPresent()) {
                RoomReservationManager reservationManager = new RoomReservationManager();
                reservationManager.reserve(roomOptional.get(), criteria);
            }
        }
    }
}