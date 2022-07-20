package solid.singleresponsibilty.complex.wrong;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HotelManager {
    private static Map<LocalDate, List<Availability>> availabilityMap = new HashMap<>();
    private static Map<Integer, Room> roomMap = new HashMap<>();

    public static void main(String[] args) {
        LocalDate fromDate = LocalDate.of(2022, 12, 12);
        LocalDate toDate = LocalDate.of(2022, 12, 14);
        book(fromDate, toDate, 2, 1, 0);
    }

    private static void book(LocalDate fromDate, LocalDate toDate, int adult, int child, int infant) {
        load();
        if (fromDate.isAfter(toDate)) {
            System.out.println("Incorrect date range");
        }
        if (adult <= 0) {
            System.out.println("At least one adult should be included");
        }
        Optional<Room> room = checkAvailability(fromDate, toDate, adult, child, infant);
        /**
         * if (room.isPresent()) {
         *             reserve(room.get());
         * }
         */
        room.ifPresent(HotelManager::reserve);
    }

    private static void load() {
        List<Availability> availabilities12 = new ArrayList<>();
        List<Availability> availabilities13 = new ArrayList<>();
        List<Availability> availabilities14 = new ArrayList<>();
        List<Availability> availabilities15 = new ArrayList<>();
        List<Availability> availabilities16 = new ArrayList<>();

        availabilities12.add(new Availability(1, true));
        availabilities13.add(new Availability(1, true));
        availabilities14.add(new Availability(1, true));
        availabilities15.add(new Availability(1, true));
        availabilities16.add(new Availability(1, true));

        availabilities12.add(new Availability(2, true));
        availabilities13.add(new Availability(2, false));
        availabilities14.add(new Availability(2, false));
        availabilities15.add(new Availability(2, true));
        availabilities16.add(new Availability(2, true));

        availabilities12.add(new Availability(3, true));
        availabilities13.add(new Availability(3, true));
        availabilities14.add(new Availability(3, true));
        availabilities15.add(new Availability(3, true));
        availabilities16.add(new Availability(3, true));

        availabilityMap.put(LocalDate.of(2022, 12, 12), availabilities12);
        availabilityMap.put(LocalDate.of(2022, 12, 13), availabilities13);
        availabilityMap.put(LocalDate.of(2022, 12, 14), availabilities14);
        availabilityMap.put(LocalDate.of(2022, 12, 15), availabilities15);
        availabilityMap.put(LocalDate.of(2022, 12, 16), availabilities16);

        roomMap.put(1, new Room(1, 0, 1, 2));
        roomMap.put(2, new Room(2, 0, 1, 2));
        roomMap.put(3, new Room(3, 0, 2, 2));
    }

    private static void reserve(Room room) {
        //reserve
        System.out.println("Booked room number:" + room.getRoomNo());
    }

    private static Optional<Room> checkAvailability(LocalDate fromDate, LocalDate toDate, int adult, int child, int infant) {
        List<LocalDate> dateRange = getDates(fromDate, toDate);
        for (LocalDate date : dateRange) {
            List<Availability> dateWieseAvailabilities = availabilityMap.get(date);
            for (Availability availability : dateWieseAvailabilities) {
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

    private static List<LocalDate> getDates(LocalDate startDate, LocalDate endDate) {
        long numOfDaysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        return IntStream.iterate(0, i -> i + 1)
                .limit(numOfDaysBetween)
                .mapToObj(i -> startDate.plusDays(i))
                .collect(Collectors.toList());
    }
}

class Availability {
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

class Room {
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