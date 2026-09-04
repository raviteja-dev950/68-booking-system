package com.booking.controller;
import com.booking.entity.Room;
import com.booking.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/rooms")
@CrossOrigin(origins = "*")
public class RoomController {
  @Autowired private RoomRepository roomRepo;

  @GetMapping
  public List<Room> getAllRooms() {
    return roomRepo.findAll();
  }

  @PostMapping
  public Room addRoom(@RequestBody Room room) {
    return roomRepo.save(room);
  }

  @DeleteMapping("/{id}")
  public void deleteRoom(@PathVariable Long id) {
    roomRepo.deleteById(id);
  }
}