package com.booking.service;
import com.booking.entity.Room;
import com.booking.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoomService {
  @Autowired private RoomRepository roomRepo;
  public List<Room> getAll() { return roomRepo.findAll(); }
  public Room save(Room room) { return roomRepo.save(room); }
}