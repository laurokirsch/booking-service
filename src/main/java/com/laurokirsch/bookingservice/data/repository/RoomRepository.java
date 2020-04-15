package com.laurokirsch.bookingservice.data.repository;

import com.laurokirsch.bookingservice.data.domain.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
