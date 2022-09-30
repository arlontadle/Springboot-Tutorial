package com.springboot.tutorial.dto;

import com.springboot.tutorial.entity.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author arlund
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknowledgement {

    private String status;

    private double totalFare;

    private String pnr;

    private PassengerInfo passengerInfo;

}
