package com.anshul.designpatterns.creational.factory.example.room;

public class RoomTajFactory extends Room {
  @Override
  protected RoomType createRoom(int room_id) {

    RoomType roomType = null;
    switch (room_id) {
      case 1:
        roomType = RoomType.ORDINARY_ROOM;
        break;
      case 2:
        roomType = RoomType.DELUXE_ROOM;
        break;
      case 3:
        roomType = RoomType.SUPER_DELUX_ROOM;
        break;
    }
    return roomType;
  }
}
