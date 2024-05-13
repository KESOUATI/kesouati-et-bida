package com.club.sport.controllers;

import com.club.sport.models.Reservation;
import com.club.sport.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller

@RequestMapping("/Reservation")

public class ReservationController {
  @Autowired
  ReservationService reservationService;

  @RequestMapping("/create")
  public String Create() {
    return "CreateReservation";
  }

  @RequestMapping("/save")
  public String Save(
          @ModelAttribute("reservation") Reservation reservation ,
          @RequestParam("datereservation") String datereservation,
          ModelMap model
          )throws ParseException
  {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    reservation.setDatereservation(datereservation);
    Reservation memo=reservationService.Save(reservation);
    String Message ="Valide avec succes Mr/Mme"+memo.getNom();
   model.addAttribute("Message",Message);

    return "CreateReservation";

  }
  @RequestMapping("/List")
  public String List(ModelMap model) {
   List<Reservation> res=reservationService.GetAllReservation();
   model.addAttribute("reservations",res);
    return "Listreservation";
  }

  @RequestMapping("/delete")
  public String Delete(@RequestParam("id") Long id, ModelMap model) {
    reservationService.DeleteReservationById(id);
      List<Reservation> res=reservationService.GetAllReservation();
      model.addAttribute("reservations",res);
      return "Listreservation";
  }
  //Update
  @RequestMapping("/update")
  public String Update(@RequestParam("id") Long id, ModelMap model) {
    Reservation res=reservationService.GetReservationById(id);
    model.addAttribute("reservations",res);

    return "EditReservation";
  }
  @RequestMapping("/update2")
  public String update2(
          @ModelAttribute("reservation") Reservation reservation ,
          @RequestParam("datereservation") String datereservation,
          ModelMap model
  )throws ParseException
  {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    reservation.setDatereservation(datereservation);
    Reservation memo=reservationService.Save(reservation);
    String Message ="Valide avec succes Mr/Mme"+memo.getNom();
    model.addAttribute("Message",Message);

    return "CreateReservation";

  }
  //---------------------------------------------------------------------------
}
