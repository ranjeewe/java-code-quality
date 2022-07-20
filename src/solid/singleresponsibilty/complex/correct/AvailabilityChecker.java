package solid.singleresponsibilty.complex.correct;

import solid.singleresponsibilty.complex.correct.bean.Availability;
import solid.singleresponsibilty.complex.correct.bean.BookingCriteria;
import solid.singleresponsibilty.complex.correct.bean.Room;
import solid.singleresponsibilty.complex.correct.dao.AvailabilityDAO;
import solid.singleresponsibilty.complex.correct.dao.RoomDAO;
import solid.singleresponsibilty.complex.correct.util.DateUtil;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class AvailabilityChecker {
    private Map<Integer, Room> roomMap = new HashMap<>();

    private AvailabilityDAO availabilityDAO;
    private RoomDAO roomDAO;

    public AvailabilityChecker() {
        this.availabilityDAO = new AvailabilityDAO();
        this.roomDAO = new RoomDAO();
    }

    public Optional<Room> checkAvailability(BookingCriteria criteria) {
        roomMap = roomDAO.loadRooms();
        LocalDate fromDate = criteria.getFromDate();
        LocalDate toDate = criteria.getToDate();
        int adult = criteria.getAdult();
        int child = criteria.getChild();
        int infant = criteria.getInfant();

        System.out.println("From date " + fromDate + " to date " + toDate);
        Map<LocalDate, List<Availability>> availabilityMap = availabilityDAO.loadAvailability(fromDate, toDate);
        List<LocalDate> dateRange = DateUtil.getDates(fromDate, toDate);
        for (LocalDate date : dateRange) {
            List<Availability> dateWiseAvailabilities = availabilityMap.get(date);
            for (Availability availability : dateWiseAvailabilities) {
                if (availability != null && availability.isAvailable()) {
                    Room room = roomMap.get(availability.getRoomNo());
                    if (room.getAdult() == adult && room.getChild() == child && room.getInfant() == infant) {
                        return Optional.of(room);
                    }
                }
            }
        }
        System.out.println("No availability");
        return Optional.empty();
    }
}