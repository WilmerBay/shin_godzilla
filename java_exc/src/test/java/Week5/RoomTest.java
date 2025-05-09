package Week5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    private Room room;

    @BeforeEach // initiates creation of a room before evry test
    public void setUp() {
        room = new Room(2, 134.0, false, false);
    }

    @Test
    public void testCheckInMakesRoomOccupiedAndDirty() {

        room.checkIn();
        assertTrue(room.isOccupied(), "Room should be occupied after check-in");
        assertTrue(room.isDirty(), "Room should be dirty after check-in");
    }
    @Test
    public void testCheckOutMakesRoomUnoccupiedAndClean() {

        room.checkIn();
        room.checkOut();
        assertFalse(room.isOccupied(), "Room should not be occupied after checkout");
        assertFalse(room.isDirty(), "Room should be clean after checkout");
    }

    @Test
    public void testCleanRoomCleansDirtyRoom() {
        room.setDirty(true);
        room.cleanRoom();
        assertFalse(room.isDirty(), "Room should be clean after cleaning");
    }

    @Test
    public void testIsAvailableWhenCleanAndUnoccupied() {
        assertTrue(room.isAvailable(), "Room should be available when unoccupied and clean");
    }

    @Test
    public void testIsAvailableReturnsFalseWhenDirty() {
        room.setDirty(true);
        assertFalse(room.isAvailable(), "Room should not be available when dirty");
    }

    @Test
    public void testIsAvailableReturnsFalseWhenOccupied() {
        room.setOccupied(true);
        assertFalse(room.isAvailable(), "Room should not be available when occupied");
    }
}