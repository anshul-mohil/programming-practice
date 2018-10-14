package com.anshul.designpatterns.factory.example.room;

import java.util.ArrayList;
import java.util.List;

/**
 * This factory is where class needed internal factory
 * implementation to dynamically operate on objects
 * provided by subclass overridden method
 * <code> createRooms</code>
 */
public abstract class Room {

  List<RoomType> rooms = new ArrayList<>();


  public Room() {

    RoomType roomType1 = createRoom(1);
    RoomType roomType2 = createRoom(2);

    rooms.add(roomType1);
    rooms.add(roomType2);
  }

  public RoomType getRoom(int id) {
    return rooms.get(id);
  }

  protected abstract RoomType createRoom(int room_id);
}
