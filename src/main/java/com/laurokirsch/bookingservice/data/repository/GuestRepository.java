package com.laurokirsch.bookingservice.data.repository;

import com.laurokirsch.bookingservice.data.domain.Guest;
import org.springframework.data.repository.CrudRepository;

public interface GuestRepository extends CrudRepository<Guest, Long> {
}
