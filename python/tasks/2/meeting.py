class MeetingRoom:
    def __init__(self, room_id, capacity, floor_location):
        self.room_id = room_id
        self.capacity = capacity
        self.floor_location = floor_location

    def display_room_details(self):
        print(f"Room ID: {self.room_id}")
        print(f"Capacity: {self.capacity}")
        print(f"Floor Location: {self.floor_location}")


# Subclass for rooms with Zoom facility
class ZoomMeetingRoom(MeetingRoom):
    def __init__(self, room_id, capacity, floor_location, zoom_device_id, zoom_account_id):
        super().__init__(room_id, capacity, floor_location)
        self.zoom_device_id = zoom_device_id
        self.zoom_account_id = zoom_account_id

    def display_zoom_details(self):
        self.display_room_details()
        print(f"Zoom Device ID: {self.zoom_device_id}")
        print(f"Zoom Account ID: {self.zoom_account_id}")


# Class for booking meeting rooms
class Booking:
    all_bookings = []  # class-level list to store all bookings

    def __init__(self, employee_id, meeting_date, meeting_time, duration, room):
        self.employee_id = employee_id
        self.meeting_date = meeting_date
        self.meeting_time = meeting_time
        self.duration = duration
        self.room = room
        Booking.all_bookings.append(self)  # store each booking automatically

    def display_booking(self):
        print(f"Employee ID: {self.employee_id}")
        print(f"Meeting Date: {self.meeting_date}")
        print(f"Meeting Time: {self.meeting_time}")
        print(f"Duration: {self.duration} hours")
        print(f"Booked Room ID: {self.room.room_id}")

    @classmethod
    def get_bookings_by_date(cls, date):
        print(f"\nBookings on {date}:")
        found = False
        for booking in cls.all_bookings:
            if booking.meeting_date == date:
                booking.display_booking()
                print()
                found = True
        if not found:
            print("No bookings found for this date.")


# -------------------- Example Usage --------------------
if __name__ == "__main__":
    # Create rooms
    room1 = MeetingRoom("R101", 10, "1st Floor")
    room2 = ZoomMeetingRoom("R202", 20, "2nd Floor", "ZD567", "ZA890")

    # Display details
    print("=== Meeting Room Details ===")
    room1.display_room_details()
    print()
    room2.display_zoom_details()

    # Create bookings
    b1 = Booking("E001", "2025-10-07", "10:00 AM", 2, room1)
    b2 = Booking("E002", "2025-10-07", "3:00 PM", 1, room2)
    b3 = Booking("E003", "2025-10-08", "11:00 AM", 1, room1)

    # Retrieve bookings by date
    Booking.get_bookings_by_date("2025-10-07")
    Booking.get_bookings_by_date("2025-10-08")