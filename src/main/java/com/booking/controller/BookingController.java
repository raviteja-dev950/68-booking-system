package com.booking.controller;

import com.booking.entity.Booking;
import com.booking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "*")
public class BookingController {

  @Autowired
  private BookingRepository bookingRepo;

  @PostMapping
  public Booking book(@RequestBody Booking b){
    b.setStatus("CONFIRMED");
    return bookingRepo.save(b);
  }

  @GetMapping
  public List<Booking> all(){
    return bookingRepo.findAll();
  }

  @GetMapping("/my/{email}")
  public List<Booking> getMyBookings(@PathVariable String email){
    return bookingRepo.findByUser_Email(email);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id){
    bookingRepo.deleteById(id);
  }
}