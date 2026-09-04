package com.booking.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Booking {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private LocalDate checkIn;
  private LocalDate checkOut;
  private int guests;
  private double totalPrice;
  private String status;

  @ManyToOne
  private Room room;

  @ManyToOne
  private User user;

  // Getters & Setters
  public Long getId(){return id;}
  public void setId(Long id){this.id=id;}
  public LocalDate getCheckIn(){return checkIn;}
  public void setCheckIn(LocalDate c){this.checkIn=c;}
  public LocalDate getCheckOut(){return checkOut;}
  public void setCheckOut(LocalDate c){this.checkOut=c;}
  public int getGuests(){return guests;}
  public void setGuests(int g){this.guests=g;}
  public double getTotalPrice(){return totalPrice;}
  public void setTotalPrice(double p){this.totalPrice=p;}
  public String getStatus(){return status;}
  public void setStatus(String s){this.status=s;}
  public Room getRoom(){return room;}
  public void setRoom(Room r){this.room=r;}
  public User getUser(){return user;}
  public void setUser(User u){this.user=u;}
}