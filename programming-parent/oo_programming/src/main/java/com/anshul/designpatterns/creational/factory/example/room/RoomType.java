package com.anshul.designpatterns.creational.factory.example.room;

public enum RoomType {

  ORDINARY_ROOM(1), DELUXE_ROOM(2), SUPER_DELUX_ROOM(3), QUEEN_SUITE(4), GRAND_TAJ_SUITE(5);

  private int room_id;

  RoomType(int room_id) {
    this.room_id = room_id;
  }

  public int getRoom_id() {
    return this.room_id;
  }

  @Override
  public String toString() {
    return super.toString();
  }

}
