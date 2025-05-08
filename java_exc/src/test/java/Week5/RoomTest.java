package Week5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    private Room room;

    @BeforeEach
    public void setUp() {
        room = new Room(2, 100.0, false, false);
    }

    @Test
    public void testCheckInMakesRoomOccupiedAndDirty() {
        room.checkIn();
        assertTrue(room.isOccupied(), "Room should be occupied after check-in");
        assertTrue(room.isDirty(), "Room should be dirty after check-in");
    }





}