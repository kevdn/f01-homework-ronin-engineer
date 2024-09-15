package Q2;

import java.util.ArrayList;

class Room {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class House {
    private String address;
    private ArrayList<Room> rooms; // Thành phần của House

    public House(String address) {
        this.address = address;
        this.rooms = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
}

public class Composition {
    public static void main(String[] args) {
        Room room1 = new Room("Living room");
        Room room2 = new Room("Bedroom");

        House house = new House("123 Wall Street");
        house.addRoom(room1);
        house.addRoom(room2);

        System.out.println("House address: " + house.getAddress());
        System.out.println("Rooms: ");
        for (Room room : house.getRooms()) {
            System.out.println(room.getName());
        }
    }
}
