package Lab1.Week9_10.Challenge_One.src;

import java.util.Objects;

public class Room {
    private String roomName;
    private Chair[] chairs;

    public Room(String roomName, Chair c1, Chair c2, Chair c3, Chair c4) {
        this.roomName = roomName;
        this.chairs = new Chair[]{c1, c2, c3, c4};
    }

    public String getRoomName() { return roomName; }
    public Chair[] getChairs() { return chairs; }

    public void setRoomName(String roomName) { this.roomName = roomName; }
    public void setChairs(Chair[] chairs) { this.chairs = chairs; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Room Name: " + roomName + "\n");
        for (Chair c : chairs) {
            sb.append(c.toString()).append("\n");
        }
        return sb.toString();
    }

    public int chairsWithTablesAvailable() {
        int freeChairs = 0;
        for (Chair c : chairs) {
            if (c instanceof ChairWithTable && c.getStudent() == null) {
                freeChairs++;
            }
        }
        return freeChairs;
    }

    public int chairWithWheelsAvailable() {
        int freeChairs = 0;
        for (Chair c : chairs) {
            if (c instanceof ChairWithWheels && c.getStudent() == null) {
                freeChairs++;
            }
        }
        return freeChairs;
    }

    public Chair enterStudent(Student student, String chairType) {
        for (Chair c : chairs) {
            if (chairType.equals("table") && c instanceof ChairWithTable && c.getStudent() == null) {
                c.setStudent(student);
                return c;
            } else if (chairType.equals("wheels") && c instanceof ChairWithWheels && c.getStudent() == null) {
                c.setStudent(student);
                return c;
            }
        }

        for (Chair c : chairs) {
            if (c.getStudent() == null) {
                c.setStudent(student);
                return c;
            }
        }

        return null;
    }
}
