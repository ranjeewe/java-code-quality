package solid.singleresponsibilty.complex.correct.dao;


import solid.singleresponsibilty.complex.correct.util.DateUtil;
import solid.singleresponsibilty.complex.correct.bean.Availability;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This is to load availability from DB
 */
public class AvailabilityDAO {
    private static Map<LocalDate, List<Availability>> availabilityMap = new HashMap<>();

    private List<Availability> availabilities12 = new ArrayList<>();
    private List<Availability> availabilities13 = new ArrayList<>();
    private List<Availability> availabilities14 = new ArrayList<>();
    private List<Availability> availabilities15 = new ArrayList<>();
    private List<Availability> availabilities16 = new ArrayList<>();


    public Map<LocalDate, List<Availability>> loadAvailability(LocalDate fromDate, LocalDate toDate) {
        load();
        List<LocalDate> dates = DateUtil.getDates(fromDate, toDate);
        Map<LocalDate, List<Availability>> newMap = new HashMap<>(availabilityMap);
        newMap.keySet().retainAll(dates);
        return newMap;
    }

    private void load() {
        availabilityMap.put(LocalDate.of(2022, 12, 12), availabilities12);
        availabilityMap.put(LocalDate.of(2022, 12, 13), availabilities13);
        availabilityMap.put(LocalDate.of(2022, 12, 14), availabilities14);
        availabilityMap.put(LocalDate.of(2022, 12, 15), availabilities15);
        availabilityMap.put(LocalDate.of(2022, 12, 16), availabilities16);

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
    }
}