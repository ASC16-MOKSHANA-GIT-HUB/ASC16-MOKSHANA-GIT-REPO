package Lab2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

// Base Class: MeetingRoom
abstract class MeetingRoom {
    protected String roomId;
    protected int capacity;
    protected int floorLocation;

    public MeetingRoom(String roomId, int capacity, int floorLocation) {
        this.roomId = roomId;
        this.capacity = capacity;
        this.floorLocation = floorLocation;
    }

    public String getRoomId() {
        return roomId;
    }

    public abstract void showDetails();
}

// Subclass: ZoomMeetingRoom
class ZoomMeetingRoom extends MeetingRoom {
    private String zoomDeviceId;
    private String zoomAccountId;

    public ZoomMeetingRoom(String roomId, int capacity, int floorLocation,
                           String zoomDeviceId, String zoomAccountId) {
        super(roomId, capacity, floorLocation);
        this.zoomDeviceId = zoomDeviceId;
        this.zoomAccountId = zoomAccountId;
    }

    @Override
    public void showDetails() {
        System.out.println("Zoom Meeting Room: " + roomId +
                ", Capacity: " + capacity +
                ", Floor: " + floorLocation +
                ", Zoom Device ID: " + zoomDeviceId +
                ", Zoom Account ID: " + zoomAccountId);
    }
}

// Subclass: RegularMeetingRoom
class RegularMeetingRoom extends MeetingRoom {
    public RegularMeetingRoom(String roomId, int capacity, int floorLocation) {
        super(roomId, capacity, floorLocation);
    }

    @Override
    public void showDetails() {
        System.out.println("Regular Meeting Room: " + roomId +
                ", Capacity: " + capacity +
                ", Floor: " + floorLocation);
    }
}

// Employee Class
class Employee {
    private String employeeId;
    private String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }
}

// Booking Class
class Booking {
    private String bookingId;
    private Employee employee;
    private MeetingRoom room;
    private LocalDate meetingDate;
    private LocalTime meetingTime;
    private int duration; // in minutes

    public Booking(String bookingId, Employee employee, MeetingRoom room,
                   LocalDate meetingDate, LocalTime meetingTime, int duration) {
        this.bookingId = bookingId;
        this.employee = employee;
        this.room = room;
        this.meetingDate = meetingDate;
        this.meetingTime = meetingTime;
        this.duration = duration;
    }

    public LocalDate getMeetingDate() {
        return meetingDate;
    }

    public void showBookingDetails() {
        System.out.println("Booking ID: " + bookingId +
                ", Employee: " + employee.getName() +
                " (" + employee.getEmployeeId() + ")" +
                ", Room: " + room.getRoomId() +
                ", Date: " + meetingDate +
                ", Time: " + meetingTime +
                ", Duration: " + duration + " mins");
    }
}

// Booking Manager
class BookingManager {
    private List<Booking> bookings = new ArrayList<>();

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public void getBookingsByDate(LocalDate date) {
        System.out.println("Bookings on " + date + ":");
        for (Booking b : bookings) {
            if (b.getMeetingDate().equals(date)) {
                b.showBookingDetails();
            }
        }
    }
}

// Main Class
public class MeetingRoomApp {
    public static void main(String[] args) {
        // Create Meeting Rooms
        MeetingRoom zoomRoom = new ZoomMeetingRoom("Z101", 10, 1, "ZD123", "ZA456");
        MeetingRoom regularRoom = new RegularMeetingRoom("R201", 8, 2);

        // Show details
        zoomRoom.showDetails();
        regularRoom.showDetails();

        // Create Employees
        Employee emp1 = new Employee("E001", "Swapna");
        Employee emp2 = new Employee("E002", "Rahul");

        // Booking Manager
        BookingManager manager = new BookingManager();

        // Create Bookings
        Booking b1 = new Booking("B001", emp1, zoomRoom,
                LocalDate.of(2025, 9, 26), LocalTime.of(10, 0), 60);

        Booking b2 = new Booking("B002", emp2, regularRoom,
                LocalDate.of(2025, 9, 26), LocalTime.of(14, 0), 30);

        Booking b3 = new Booking("B003", emp1, regularRoom,
                LocalDate.of(2025, 9, 27), LocalTime.of(11, 0), 45);

        // Add bookings to manager
        manager.addBooking(b1);
        manager.addBooking(b2);
        manager.addBooking(b3);

        // Retrieve bookings by date
        manager.getBookingsByDate(LocalDate.of(2025, 9, 26));
    }
}