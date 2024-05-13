package com.club.sport.services;

import com.club.sport.models.Reservation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface ReservationService {



     Reservation Save(Reservation reservation);

    Reservation Update(Reservation reservation);


    List<Reservation> GetAllReservation();

    Reservation GetReservationById(Long id);

    void DeleteReservationById(Long id);
    void deleteAllReservation();


}
