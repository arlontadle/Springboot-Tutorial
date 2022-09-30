package com.springboot.tutorial.controller;

import com.springboot.tutorial.dto.FlightBookingAcknowledgement;
import com.springboot.tutorial.dto.FlightBookingRequest;
import com.springboot.tutorial.service.FlightBookingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author arlund
 */
@RestController
@RequestMapping("/tutorial/flight-booking")
@EnableTransactionManagement
public class FlightBookingController {

    @Autowired
    private FlightBookingServiceImpl flightBookingService;

    @PostMapping("/bookFlightTicket")
    public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest flightBookingRequest) {
        return flightBookingService.bookFlightTicket(flightBookingRequest);
    }

}
