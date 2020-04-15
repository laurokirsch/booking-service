package com.laurokirsch.bookingservice.data.repository;

import com.laurokirsch.bookingservice.data.domain.Reservation;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    Iterable<Reservation> findReservationByReservationDate(Date date);
}
