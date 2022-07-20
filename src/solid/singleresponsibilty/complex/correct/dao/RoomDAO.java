package solid.singleresponsibilty.complex.correct.dao;


import solid.singleresponsibilty.complex.correct.bean.Room;

import java.util.HashMap;
import java.util.Map;

public class RoomDAO {
    private static Map<Integer, Room> roomMap = new HashMap<>();

    public Map<Integer, Room> loadRooms() {
        roomMap.put(1, new Room(1, 0, 1, 2));
        roomMap.put(2, new Room(2, 0, 1, 2));
        roomMap.put(3, new Room(3, 0, 2, 2));
        return roomMap;
    }
}