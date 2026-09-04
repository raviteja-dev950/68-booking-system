package com.booking.config;
import com.booking.entity.Room;
import com.booking.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
  @Autowired private RoomRepository roomRepo;

  @Override
  public void run(String... args) throws Exception {
    if(roomRepo.count() == 0) {
      Room r1 = new Room();
      r1.setRoomNumber("101");
      r1.setType("Deluxe");
      r1.setPricePerNight(2500.0);
      r1.setCapacity(2);
      r1.setAmenities("AC, WiFi, TV");
      r1.setImageUrl("https://images.unsplash.com/photo-1611892440504-42a792e24d32");
      r1.setIsAvailable(true);
      roomRepo.save(r1);

      Room r2 = new Room();
      r2.setRoomNumber("102");
      r2.setType("Suite");
      r2.setPricePerNight(4500.0);
      r2.setCapacity(4);
      r2.setAmenities("AC, WiFi, TV, Kitchen");
      r2.setImageUrl("https://images.unsplash.com/photo-1590490360182-c33d57733427");
      r2.setIsAvailable(true);
      roomRepo.save(r2);

      Room r3 = new Room();
      r3.setRoomNumber("103");
      r3.setType("Single");
      r3.setPricePerNight(1500.0);
      r3.setCapacity(1);
      r3.setAmenities("WiFi, TV");
      r3.setImageUrl("https://images.unsplash.com/photo-1560448204-e02f11c3d0e2");
      r3.setIsAvailable(true);
      roomRepo.save(r3);
      
      System.out.println("Sample rooms added!");
    }
  }
}