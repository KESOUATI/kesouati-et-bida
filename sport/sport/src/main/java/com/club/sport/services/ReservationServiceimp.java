package com.club.sport.services;

import com.club.sport.models.Reservation;
import com.club.sport.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ReservationServiceimp implements ReservationService {
    @Autowired
    ReservationRepository res;
    @Override


    public Reservation Save(Reservation reservation) {
        return res.save(reservation);
    }

    @Override
    public Reservation Update(Reservation reservation) {
        return res.save(reservation);
    }


    @Override
    public List<Reservation> GetAllReservation() {
        return res.findAll();
    }

    @Override
    public Reservation GetReservationById(Long id) {
        return res.findById(id).get();
    }

    @Override
    public void DeleteReservationById(Long id) {
      res.deleteById(id);
    }

    @Override
    public void deleteAllReservation() {
   res.deleteAll();
    }
}
