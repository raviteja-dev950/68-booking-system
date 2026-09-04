package com.booking.entity;
import jakarta.persistence.*;

@Entity
public class Room {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private String roomNumber;
  private String type;
  private Double pricePerNight;
  private Integer capacity;
  private String amenities;
  private String imageUrl;
  private Boolean isAvailable = true;

  public Room() {}

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public String getRoomNumber() { return roomNumber; }
  public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }
  public String getType() { return type; }
  public void setType(String type) { this.type = type; }
  public Double getPricePerNight() { return pricePerNight; }
  public void setPricePerNight(Double pricePerNight) { this.pricePerNight = pricePerNight; }
  public Integer getCapacity() { return capacity; }
  public void setCapacity(Integer capacity) { this.capacity = capacity; }
  public String getAmenities() { return amenities; }
  public void setAmenities(String amenities) { this.amenities = amenities; }
  public String getImageUrl() { return imageUrl; }
  public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
  public Boolean getIsAvailable() { return isAvailable; }
  public void setIsAvailable(Boolean isAvailable) { this.isAvailable = isAvailable; }
}