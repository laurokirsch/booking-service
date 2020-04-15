package com.laurokirsch.bookingservice.web;

import com.laurokirsch.bookingservice.business.domain.RoomReservation;
import com.laurokirsch.bookingservice.business.service.ReservationService;
import com.laurokirsch.bookingservice.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/reservations")
public class RoomReservationRestController {
    private final ReservationService reservationService;

    @Autowired
    public RoomReservationRestController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public ResponseEntity<List<RoomReservation>> getReservations(@RequestParam(value="date", required=false) String dateString) {
        Date date = DateUtils.createDateFromDateString(dateString);
        List<RoomReservation> roomReservations = reservationService.getRoomReservationsForDate(date);
        return ResponseEntity.ok().body(roomReservations);
    }
}
